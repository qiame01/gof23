package gof23.gof23_2.proxy.staticProxy;

import org.junit.jupiter.api.Test;

/**
 * 静态代理：要求代理类和目标类要实现同一个接口
 */
public class ClientTest {

    @Test
    public void test(){
        TeacherImpl teacher = new TeacherImpl();
        TeacherProxy teacherProxy = new TeacherProxy(teacher);
        // 通过代理对象调用到目标对象的方法
        teacherProxy.teach();
    }

}
