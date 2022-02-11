public class Cheese {
    private static float price = 1.50f;
    private String name;
    private String shred;

    public Cheese(String name, String shred) {
        this.name = name;
        this.shred = shred;
    }
    public Cheese(String name) {
        this.name = name;
        shred = "shredded";
    }
    public Cheese() {
        name = "Cheddar";
    }

    public void changePrice(float price) {
        Cheese.price = price;
    }

    public float getPriceC() {
        return Cheese.price;
    }

    public String toString() {
        return this.name;
    }
}
