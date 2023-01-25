package hello.proxy.pureproxy.decorator.code;

public class MessageDecorator implements Component {
    private Component component;

    public MessageDecorator(Component component) {
        this.component = component;
    }

    @Override
    public String operation() {
        System.out.println("MessageDecorator 실행");
        String operation = component.operation();
        String decoratedResult = "****" + operation + "****";
        return decoratedResult;
    }
}
