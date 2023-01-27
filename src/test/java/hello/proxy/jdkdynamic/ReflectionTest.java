package hello.proxy.jdkdynamic;

import org.junit.jupiter.api.Test;

public class ReflectionTest {
    @Test
    void reflection0() {
        Hello target = new Hello();
        target.callA();
        target.callB();
    }

    static class Hello {
        public String callA() {
            System.out.println("callA");
            return "A";
        }

        public String callB() {
            System.out.println("callB");
            return "B";
        }
    }
}
