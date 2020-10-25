package behavioural_patterns.chain_responsibility;

public class LowFuelHandler extends AbstractHandler {

    private static int LOW_FUEL_CODE = 1;

    LowFuelHandler(AbstractHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handleRequest(AbstractRequest request) {
        if (request.getCode() == LOW_FUEL_CODE) {
            System.out.println("Handling low fuel request");
        } else {
            super.handleRequest(request);
        }
    }
}
