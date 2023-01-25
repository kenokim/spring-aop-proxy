package hello.proxy.pureproxy.decorator.code;

public class RealComponent implements Component {
    @Override
    public String operation() {
        System.out.println("RealComponent 실행");
        return "ok";
    }
}
