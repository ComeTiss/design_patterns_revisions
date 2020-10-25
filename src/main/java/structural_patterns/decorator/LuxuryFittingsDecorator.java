package structural_patterns.decorator;

public class LuxuryFittingsDecorator extends BoeingDecorator {

    IAircraft boeing;

    LuxuryFittingsDecorator(IAircraft boeing) {
        this.boeing = boeing;
    }

    public void fly() {
        boeing.fly();
    }

    public void land() {
        boeing.land();
    }

    public float getWeight() {
        return (boeing.getWeight() + 30);
    }
}
