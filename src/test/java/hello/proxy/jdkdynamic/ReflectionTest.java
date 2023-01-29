package hello.proxy.jdkdynamic;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class ReflectionTest {
    @Test
    void reflection0() {
        Hello target = new Hello();
        // 공통 로직 1 시작
        System.out.println("start");
        String result1 = target.callA();
        System.out.println(result1);
        // 공통 로직 1 종료

        // 공통 로직 2 시작
        System.out.println("start");
        String result2 = target.callB();
        System.out.println(result2);
        // 공통 로직 2 종료
    }

    @Test
    void reflection1() throws Exception {
        Class classHello = Class.forName("hello.proxy.jdkdynamic.ReflectionTest$Hello");
        Hello target = new Hello();
        Method callA = classHello.getMethod("callA");
        Method callB = classHello.getMethod("callB");

        Object result1 = callA.invoke(target);
        System.out.println("result 1 = " + result1);

        Object result2 = callB.invoke(target);
        System.out.println("result 2 = " + result2);
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
