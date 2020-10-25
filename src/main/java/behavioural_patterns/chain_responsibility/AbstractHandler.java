package behavioural_patterns.chain_responsibility;

abstract public class AbstractHandler  {

    AbstractHandler next;

    AbstractHandler(AbstractHandler nextHandler) {
        this.next = nextHandler;
    }

    public AbstractHandler getNext() {
        return next;
    }

    public void handleRequest(AbstractRequest request) {
        if(next != null) {
            next.handleRequest(request);
        }
    }
}
