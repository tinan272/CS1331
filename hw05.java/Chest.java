import java.util.ArrayList;

/**
* Represents magical item wand.
* @author mnguyen354
* @version 1.0
*/
public class Chest {
    private ArrayList<MagicItem> itemsInside = new ArrayList<>();

    /**
     * Creates a chest.
     * @param itemArray list holding magic items.
     */
    public Chest(ArrayList<MagicItem> itemArray) {
        itemsInside = itemArray;
    }

    /**
     * Sorts the chest using selection search.
     */
    public void sortChest() {
        int compTo = 0;
        int index = -1;
        MagicItem lowestItem = new Carpet("Temp", 0, 0);
        for (int y = 0; y < itemsInside.size(); y++) {
            int currentLPower = (itemsInside.get(y)).getPower();
            for (int i = 1; i < itemsInside.size(); i++) {
                compTo = (itemsInside.get(i - 1)).compareTo(itemsInside.get(i));
                int power = (itemsInside.get(i)).getPower();
                if (compTo < 0 && (power > currentLPower)) {
                    lowestItem = itemsInside.get(i);
                    currentLPower = power;
                    index = i;
                }
            }
            if (index != -1) {
                MagicItem swapItem = itemsInside.get(y);
                itemsInside.set(y, lowestItem);
                itemsInside.set(index, swapItem);
                index = -1;
            }
        }
    }

    /**
     * Adds item into chest.
     * @param itemAdd item added to chest.
     */
    public void addItem(MagicItem itemAdd) {
        itemsInside.add(itemAdd);
    }

    /**
     * Finds an item in the chest.
     * @param item item to find in the chest
     * @return item in the chest or null if not in there
     */
    public MagicItem findItem(MagicItem item) {
        int isIn = binarySearch(itemsInside, item);
        if (isIn > 0) {
            System.out.println("You found " + item.getName());
            return item;
        } else {
            return null;
        }
    }
    /**
     * Recursive method implementing binary search to find item.
     * @param newArray array to find item in
     * @param item item to find in chest
      * @return 1 if item in chest, -1 if not
     */
    public int binarySearch(ArrayList<MagicItem> newArray, MagicItem item) {
        ArrayList<MagicItem> first = new ArrayList<>();
        ArrayList<MagicItem> second = new ArrayList<>();
        int sizeArray = newArray.size() - 1;
        int middle = (sizeArray) / 2;
        int compTo = (newArray.get(middle)).compareTo(item);
        if (sizeArray + 1 == 2) {
            if ((newArray.get(0)).equals(item) || (newArray.get(1)).equals(item)) {
                return 1;
            } else {
                return -1;
            }
        }
        if (newArray.get(middle) == item) {
            return 1;
        }
        if (compTo > 0) {
            for (int i = 0; i < newArray.size(); i++) {
                if (i >= middle) {
                    second.add(newArray.get(i));
                }
            }
            return binarySearch(second, item);
        } else {
            for (int i = 0; i < newArray.size(); i++) {
                if (i <= middle) {
                    first.add(newArray.get(i));
                }
            }
            return binarySearch(first, item);
        }
    }

    /**
     * Looks through chest to see if item exists and removes it.
     * @param rItem item being removed
     * @return item that is being removed
     */
    public MagicItem removeItem(MagicItem rItem) {
        int isIn = binarySearch(itemsInside, rItem);
        if (isIn > 0) {
            itemsInside.remove(rItem);
            return rItem;
        } else {
            return null;
        }
    }

    /**
     * Removes the item with the lowest power.
     * @return the item with the lowest power.
     */
    public MagicItem removeJunk() {
        sortChest();
        int lastIndex = itemsInside.size() - 1;
        MagicItem lowestItem = itemsInside.get(lastIndex);
        itemsInside.remove(lowestItem);
        System.out.println("Removed the junk");
        return lowestItem;
    }

    /**
     * Prints the items inside chest.
     */
    public void printChest() {
        for (int i = 0; i < itemsInside.size(); i++) {
            System.out.println(itemsInside.get(i));
        }
    }

    /**
     * Driver method running code.
     * @param args needed argument for main method
     */
    public static void main(String[] args) {
        Lamp lamp1 = new Lamp("Amal's Lamp", 200, true);
        Lamp lampeq = new Lamp("Tina's Lamp", 200, true);
        Lamp lamp2 = new Lamp("lamp2", 10, false);
        Carpet car1 = new Carpet("Carp1", 20, 30);
        Carpet car2 = new Carpet("Carp2", 3, 30);
        Wand wand1 = new Wand("Wand1", 100, "Tina");
        Wand wand2 = new Wand("Wand2", 50, "Charlie");
        Wand wand3 = new Wand("Wand3", 0, "N/A");
        System.out.println(lampeq.equals(lamp1));
        ArrayList<MagicItem> list = new ArrayList<>();
        list.add(lamp1);
        list.add(lamp2);
        list.add(car1);
        list.add(car2);
        list.add(wand1);
        Chest chest1 = new Chest(list);
        System.out.println("--------Current Chest");
        chest1.printChest();
        System.out.println("-------Add wand2 and wand3 to chest");
        chest1.addItem(wand2);
        chest1.addItem(wand3);
        chest1.sortChest();
        System.out.println("--------Current Chest");
        chest1.printChest();
        System.out.println("--------Finds wand3.");
        System.out.println(chest1.findItem(wand3));
        System.out.println("--------Removes wand3.");
        System.out.println(chest1.removeItem(wand3));
        System.out.println("--------Current Chest");
        chest1.printChest();
        System.out.println("--------Finds wand3.");
        System.out.println(chest1.findItem(wand3));
        System.out.println("--------Removed lowest carp2.");
        System.out.println(chest1.removeJunk());
        System.out.println("--------Current Chest");
        chest1.printChest();
        System.out.println("--------Finds carp2.");
        System.out.println(chest1.findItem(car2));
        // check magic item
        System.out.println("--------Get lamp1 power.");
        System.out.println(lamp1.getPower());
        System.out.println("--------Get lamp1 name.");
        System.out.println(lamp1.getName());
        System.out.println("--------Set lamp1 power to 30.");
        lamp1.setPower(30);
        System.out.println("--------Get lamp1 power.");
        System.out.println(lamp1.getPower());
        System.out.println("--------Current Chest");
        chest1.printChest();
        System.out.println("--------Recharge wand1 power +30.");
        wand1.recharge(30);
        System.out.println("--------Get wand1 power.");
        System.out.println(wand1.getPower());
        System.out.println("--------Invoke wand1.");
        wand1.invoke();
        System.out.println("--------Invoke carp1.");
        car1.invoke();
        System.out.println("--------Invoke lamp1.");
        lamp1.invoke();
    }
}
