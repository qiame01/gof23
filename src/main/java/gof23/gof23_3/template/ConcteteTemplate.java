package gof23.gof23_3.template;

public class ConcteteTemplate extends Template {


    @Override
    public void cStep() {
        System.out.println("办理具体业务");
    }

    @Override
    public void dStep() {
        System.out.println("对服务进行评价");
    }
}
