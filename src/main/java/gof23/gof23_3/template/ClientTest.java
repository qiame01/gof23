package gof23.gof23_3.template;

import org.junit.Test;
/**
 * 使用场景：行为是按照固定的顺序执行的时候
 * 优点：***
 * 结构角色职责：
 * 客户端
 * 抽象模板：包含四类方法：模板方法(规定执行顺序)、抽象方法(交由子类视情具体实现)、具体通用方法、钩子方法(非必要，用于补偿或给流程传入条件，处理逻辑和返回值类型均可以自定义)
 * 具体模板
 * <p>
 * 流程：***
 * 入门案例：银行办理业务取号排队流程、炒菜流程
 * 缺点：***
 * 应用举例：***
 * 对比：***
 * 备注：
 * 上述四类方法，每类方法都可以有不止一个
 * 钩子方法，可以没有，但钩子方法依然很有用
 * 可以为子类的入参设置泛型
 */
public class ClientTest {
    @Test
    public void test(){
        Template template = new ConcteteTemplate(); // 实际使用时，可以用@Resource(name=)注入具体模板，当然，用别的注入也可以
        template.setFlag(false); // 设置钩子方法返回值，或者让钩子方法执行一段必要的逻辑，钩子方法可处于任何位置，不拘一格
        template.templateMethod(); // 执行模板方法，类似63014里的exec方法
    }
}
