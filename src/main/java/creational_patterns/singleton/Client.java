package creational_patterns.singleton;

public class Client {

    public static void main(String args[]) {
        AirForceOne airForceOne = AirForceOne.getInstance();
        airForceOne.fly();

        AirForceOneThreadSafe airForceOneMultiThread = AirForceOneThreadSafe.getInstance();
        airForceOneMultiThread.fly();
    }
}
