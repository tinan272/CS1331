public class Turkey {
    private float ounces;
    private static float pricePerOunce= (float) 1.99;
    private float total;
    public Turkey(float ounces) {
        this.ounces = ounces;
    }
    public float cost() {
        total = (this.ounces * Turkey.pricePerOunce);
        total = (Math.round(total*100))/ (100.00f);
        return total;
    }
    public void changePrice(float priceChange) {
        Turkey.pricePerOunce = priceChange;
    }
    public float getPriceT() {
        return cost();
    }
    public String toString() {
        return this.ounces + " ounces of turkey.";
    }
}