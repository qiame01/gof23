package gof23.gof23_2.proxy.staticProxy;

public class TeacherProxy implements Teacher{

    private Teacher target;

    public TeacherProxy(Teacher target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("代理之前干点儿什么呗");
        target.teach();
        System.out.println("代理之后再干点儿什么呗");
    }
}
