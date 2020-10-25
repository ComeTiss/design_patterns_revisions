package structural_patterns.decorator;

import creational_patterns.singleton.AirForceOne;
import creational_patterns.singleton.AirForceOneThreadSafe;

public class Client {

    public static void main(String args[]) {
        IAircraft boeing = new Boeing();
        IAircraft bulletProofBoeing = new BulletProofDecorator(boeing);
        IAircraft luxuriousBoeing = new LuxuryFittingsDecorator(bulletProofBoeing);
        System.out.println("net weight: "+ luxuriousBoeing.getWeight());
    }
}
