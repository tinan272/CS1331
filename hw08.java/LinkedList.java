/**
 * Represents the structure that makes up each item in the LinkedList.
 * @author Tina Nguyen
 * @version 1.0
 * @param <T> The type of elements in this list
 */
public class LinkedList<T> implements List<T>, Queue<T> {
    private Node<T> head;
    private Node<T> tail;

    /**
     * Sets head to null.
     */
    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * Getter method for head.
     * @return the head
     */
    public Node<T> getHead() {
        return head;
    }

    /**
     * Add an element to before, inside, or after the linkedlist.
     * @param index index wanted to insert at
     * @param data data to be stored in the node
     */
    public void add(int index, T data) {
        if (index < 0 || index > size()) {
            throw new IllegalArgumentException("Invalid index!");
        } else if (data == null) {
            throw new NullPointerException("Data passed in is null.");
        }

        Node<T> node;
        if (head == null) {
            node = new Node<>(data);
            head = node;
        } else if (index == 0) {
            node = new Node<>(data, head);
            head = node;
        } else if (index == size()) {
            node = head;
            while (node.getNext() != null) {
                node = node.getNext();
            }
            Node<T> nodeToAdd = new Node<>(data);
            node.setNext(nodeToAdd);
        } else {
            node = head;
            Node<T> prevNode = null;
            for (int i = 0; i < index; i++) {
                prevNode = node;
                node = node.getNext();
            }
            Node<T> nodeToAdd = new Node<>(data, node);
            prevNode.setNext(nodeToAdd);
        }
    }

    /**
     * Removes an element at a certain index of the linkedlist.
     * @param index the index to remove an element at.
     * @return the element removed
     */
    public T remove(int index) {
        if (index < 0 || index >= size()) {
            throw new IllegalArgumentException("Invalid index!");
        }
        Node<T> node = head;
        Node<T> prevNode = null;
        if (head == null) {
            return null;
        } else if (index == 0) {
            T data = head.getData();
            head = head.getNext();
            return data;
        }
        for (int i = 0; i < index; i++) {
            prevNode = node;
            node = node.getNext();
        }
        prevNode.setNext(node.getNext());
        return node.getData();
    }

    /**
     * Get a element from a certain index of the linkedlist.
     * @param index the index to get from linkedlist.
     * @return the element wanted
     */
    public T get(int index) {
        if (index < 0 || index >= size()) {
            throw new IllegalArgumentException("Your index is invalid");
        }

        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        return node.getData();
    }

    /**
     * To not add, but to change the element of a node.
     * @param index the index where to set the node
     * @param element the new element to set the node to.
     * @return the previous element that was there.
     */
    public T set(int index, T data) {
        if (index < 0 || index >= size()) {
            throw new IllegalArgumentException("Invalid index!");
        } else if (data == null) {
            throw new NullPointerException("Data passed in is null.");
        }
        Node<T> node = head;
        for (int i = 0; i < index; i++) {
            node = node.getNext();
        }
        T info = node.getData();
        node.setData(data);
        return info;
    }

    /**
     * Checks to see if the linkedlist has an element or not.
     * @param element the element searched for
     * @return true if it does false if it doesn't
     */
    public boolean contains(T data) {
        if (data == null) {
            throw new NullPointerException("Null data cannot be in list");
        }
        Node<T> node = head;
        while (node != null) {
            if (node.getData().equals(data)) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    /**
     * Removes all elements from linkedlist.
     */
    public void clear() {
        head = null;
    }

    /**
     * Checks to see if the linkedlist has any elements.
     * @return true if empty and false if not
     */
    public boolean isEmpty() {
        return (head == null && tail == null);
    }

    /**
     * Returns size of linkedlist by iterating through entire linkedlist.
     * @return the integer value of the size of the linkedlist.
     */
    public int size() {
        int count = 0;
        Node<T> node = head;
        while (node != null) {
            node = node.getNext();
            count++;
        }
        return count;
    }

    /**
     * Adds data to the back of the List.
     */
    public void addToBack(T data) {
        Node<T> node = new Node<>(data);
        node.setNext(null);
        if (data == null) {
            throw new NullPointerException("Data passed in is null.");
        }

        if (head == null) {
            head = node;
        } else {
            Node<T> temp = new Node<>(data);
            temp = head;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
        }
    }

    

    /**
     * Removes the element at the top of the stack.
     * @return the element removed
     */
    public T dequeue() {
        if (head == null) {
            throw new IllegalArgumentException("Empty queue.");
        }
        T data = head.getData();
        head = head.getNext();
        return data;
    }

    /**
     * adding an element to the top.
     * @param element the element to add.
     * @return the element added
     */
    public void enqueue(T data) {
        if (data == null) {
            throw new NullPointerException("Data passed in is null.");
        }

        Node<T> node;
        if (head == null) {
            node = new Node<>(data);
            head = node;
        } else {
            node = new Node<>(data, head);
            head = node;
        }
    }

    /**
     * Prints out linked list.
     * @return String of List
     */
    public String toString() {
        String finalList = "";
        Node<T> info = head;
        if (size() == 0) {
            return "[]";
        }
        if (head != null) {
            finalList += "[" + info.getData().toString() + "]";
            info = info.getNext();
            while (info != null) {
                finalList += "-->" + "[" + info.getData().toString() + "]";
                info = info.getNext();
            }
        }
        return "Linked List is: " + finalList;
    }

    public List<T> subOddList() {
        if (head == null) {
            throw new IllegalArgumentException("List is empty");
        }
        LinkedList<T> newList = new LinkedList<T>();
        Node<T> node = head;

        for (int i = 0; i < size(); i++) {
            if (i%2 != 0) {
                newList.add(i,node.getData());
            }
            node = node.getNext();
        }
        return newList;
    }

    public static void main(String[] args) {
        LinkedList<String> stringList = new LinkedList<String>();
        stringList.add(0, "Amal");
        stringList.add(1, "Tina");
        stringList.add(2, "Charlie");
        stringList.add(3, "Kelly");
        stringList.addToBack("hello");
        System.out.println(stringList);
        stringList.subOddList();
    }
}


int counter = 0;
        for (int i = 0; i < S.length(); i++) {
            char currentL = S.charAt(i);
            for (int y = 1; y < S.length(); y++) {
                char sameChar = S.charAt(y);
                if (currentL == (sameChar)) {
                    counter++;
                }
            }
            if (counter)
        }