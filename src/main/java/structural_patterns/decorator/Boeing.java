package structural_patterns.decorator;

public class Boeing implements IAircraft {

    public void fly() {
        System.out.println("Boeing flying!");
    }

    public void land() {
        System.out.println("Boeing landing!");
    }

    public float getWeight() {
        return BASE_WEIGHT;
    }
}
