package hello.proxy.concreteproxy.code;

public class TimeProxy extends ConcreteLogic {
    private ConcreteLogic logic;

    public TimeProxy(ConcreteLogic logic) {
        this.logic = logic;
    }

    @Override
    public String operation() {
        System.out.println("TimeDecorator 실행");
        return logic.operation();
    }
}
