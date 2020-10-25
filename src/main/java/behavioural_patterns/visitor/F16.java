package behavioural_patterns.visitor;

public class F16 implements IAirplane {
    public void accept(IAirplaneVisitor visitor) {
        visitor.visitF16(this);
    }
}
