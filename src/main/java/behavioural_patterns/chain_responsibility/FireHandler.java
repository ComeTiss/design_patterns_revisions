package behavioural_patterns.chain_responsibility;

public class FireHandler extends AbstractHandler {

    private static int FIRE_CODE = 2;

    FireHandler(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if (request.getCode() == FIRE_CODE) {
            System.out.println("Handling fire request");
        } else {
            super.handleRequest(request);
        }
    }
}
