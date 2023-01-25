package hello.proxy.pureproxy.decorator.code;

public class DecoratorPatternClient {
    private Component component;

    public DecoratorPatternClient(Component component) {
        this.component = component;
    }

    public void execute() {
        String result = component.operation();
        System.out.println(result);
    }
}
