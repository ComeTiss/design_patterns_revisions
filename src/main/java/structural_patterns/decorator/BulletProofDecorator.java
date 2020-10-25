package structural_patterns.decorator;

public class BulletProofDecorator extends BoeingDecorator {

    IAircraft boeing;

    BulletProofDecorator(IAircraft boeing) {
        this.boeing = boeing;
    }

    public void fly() {
        boeing.fly();
    }

    public void land() {
        boeing.land();
    }

    public float getWeight() {
        return (boeing.getWeight() + 50);
    }
}
