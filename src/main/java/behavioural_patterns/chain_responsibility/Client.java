package behavioural_patterns.chain_responsibility;

public class Client {

    public static void main(String args[]) {
        AbstractRequest request = new LowFuelRequest();
        AbstractHandler lowFuelHandler = new LowFuelHandler(null);
        FireHandler fireHandler = new FireHandler(lowFuelHandler);

        fireHandler.handleRequest(request);
    }
}
