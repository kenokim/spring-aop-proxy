package hello.proxy.pureproxy.proxy.code;

public class RealSubject implements Subject {
    @Override
    public String operation() {
        System.out.println("실제 객체 호출");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {}
        return "ok";
    }
}
