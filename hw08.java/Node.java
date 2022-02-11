/**
 * Represents the structure that makes up each item in the LinkedList.
 * @author Tina Nguyen
 * @version 1.0
 * @param <T> The type of elements in this list
 */
public class Node<T> {
    private T data;
    private Node<T> next;

    /**
     * Constructor which takes in 1 element.
     * @param d the element
     */
    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    /**
     * Constructor which takes both next and element.
     * @param data the element to take
     * @param next the next node.
     */
    public Node(T data, Node<T> next) {
        this.data = data;
        this.next = next;
    }

    /**
     * Setter method to set data.
     * @param data the new element to replace old one
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * Setter method to set data.
     * @param data the new element to replace old one
     */
    public void setNext(Node<T> nextD) {
        this.next = nextD;
    }

    /**
     * Getter method to get data.
     * @return the element
     */
    public T getData() {
        return this.data;
    }

    /**
     * Getter method to get next node.
     * @return the next node
     */
    public Node<T> getNext() {
        return this.next;
    }
}