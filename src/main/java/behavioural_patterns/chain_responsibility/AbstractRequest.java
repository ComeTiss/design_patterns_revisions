package behavioural_patterns.chain_responsibility;

abstract public class AbstractRequest {

    private int code;

    public AbstractRequest(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
