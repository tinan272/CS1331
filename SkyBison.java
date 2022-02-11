public class SkyBison {

    private String name;
    private int fluffiness;
    private int health;

    public SkyBison(String n, int f, int h) {
        name = n; // instantiate the variables
        fluffiness = f;
        if (h<0) { //makes health 0 if provided negative number
            health = 0;
        } 
        else { 
            health = h;
        }
    }

    public SkyBison(String n) {
        health = 100;
        fluffiness = 100;
        name = n;
    }

    //setter 
    public void setName(String n) {
        name = n;
    }
    
    public void setFluffiness(int f) {
        fluffiness = f;
    }

    public void setHealth(int h) {
        if (h<0) {
            health = 0;
        }
        else {
            health = h;
        }
    }

    // getter
    public String getName() {
        return name;
    }

    public int getFluffiness() {
        return fluffiness;
    }

    public int getHealth() {
        return health;
    }
        
    public void eatSnack(int[] healtharray) {
        for (int i=0; i<healtharray.length; i++) {
            this.health += healtharray[i];
        }
    }

    public void eatSnack(int food) {
        this.health += food;
    }

    public void fly(int hours) {
        this.health -= 10*hours;
        if (this.health <0) {
            this.health = 0;
        }

    }
    public static void main(String[] args) {
        SkyBison appa = new SkyBison("appa", 100, 3);
        SkyBison oogi = new SkyBison("oogi");
        int[] eating = {2,3,4};
        appa.eatSnack(eating);
        oogi.eatSnack(3);
        appa.fly(6);
        appa.setHealth(100);
        oogi.setFluffiness(20);
        appa.setName("Blueberry Spicehead");
        System.out.println("appa's health: " + appa.getHealth());
        System.out.println("oogis' health: " +oogi.getHealth());
        System.out.println("appa's fluffiness: " + appa.getFluffiness());
        System.out.println("oogis' fluffiness: " +oogi.getFluffiness());
        System.out.println("appa's name changed to: " + appa.getName());

    }



}
