package gof23.gof23_3.template;

/**
 * 具体模板类，一般加上@Component 或@Service注解。使用时，在引用处注入即可
 */
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
