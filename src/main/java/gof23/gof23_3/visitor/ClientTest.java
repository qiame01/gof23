package gof23.gof23_3.visitor;

/**
 *
 * 模式角色有5个，ClassTest不算：
 * ClassTest：1-init objectStructure(add element) 2-create visitor and objectStructure.receive(visitor)：receive 与 Element 的accept一个意思，便于区分，receive是总接收入口
 *
 * ObjectStructure：1-add/remove element to list 2-receive(visitor){iterate element list and element.accept(visitor)}
 * Element(被访问者接口)：accept(visitor){visitor.visit(this)}：(维度一，可扩展新类，如ElementB)
 * ElementA(具体元素)
 * Visitor(访问者接口)：visitor(element){element.do}：(维度二，可扩展新类，如VisitorB)
 * VisitorA(具体访问者)
 *
 * 核心：是要将element传给visitor的visit(element)方法,从而实现访问者visitor对元素element的访问其他操作
 *
 * 流程表述方式1：
 * ObjectStructure 每次接收一个 visitor，并将该 visitor 传给自己内部维护的每个 element，
 * element 再将自己反传给该visitor，最终由该visitor操作element
 *
 * 流程表述方式2：
 * 先在测试类ClassTest里初始化一个 ObjectStructure ，接着ObjectStructure 接收（receive）一个 visitor，并在内部遍历自己作为容器所存放的所有 element 时，将visitor通过element.accept(visitor)传给每个 element。
 * 然后每个element调用入参visitor的visit方法——即visitor.visit(this)——将自己(this)反传给该visitor，最后由该visitor对element进行操作（包括调用element自己的方法：element.operation()）
 *
 * visitor.visit(this); // todo 这里用到了双分派，即参数变成了动作执行者，动作执行者变成了参数
 */
public class ClientTest {

    public static void main(String[] args) {
        // step1：init
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.add(new ElementA());
        // objectStructure.add(new ElementB()); // todo 可扩展1：可以灵活增加新的element

        // step2：每次接收一个Visitor的实现类 VisitorA，该实现类将对所有 element 进行操作
        objectStructure.receive(new VisitorA());
        // objectStructure.receive(new VisitorB()); // todo 可扩展2：可以灵活增加新的visitor


    }
}