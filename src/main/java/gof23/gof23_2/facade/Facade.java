package gof23.gof23_2.facade;

public class Facade {
    //
    private SubSystem1 subSystem1 = new SubSystem1(); // 工商局
    private SubSystem2 subSystem2 = new SubSystem2(); // 质检局
    private SubSystem3 subSystem3 = new SubSystem3(); // 银行

    public void register() {
        System.out.println("公司注册--需要去如下机构办理的事项");
        subSystem1.do1();
        subSystem2.do1();
        System.out.println("-----------------------------------");

    }

    public void tax() {
        System.out.println("注册后经营期间-纳税-需要去如下机构办理的事项");
        subSystem1.do2();
        subSystem2.do2();
        System.out.println("-----------------------------------");
    }

    public void loan() {
        System.out.println("注册后经营期间-贷款-需要去如下机构办理的事项");
        subSystem1.do1();
        subSystem3.do2();
        System.out.println("-----------------------------------");
    }

}
