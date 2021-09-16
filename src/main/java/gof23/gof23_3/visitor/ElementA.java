package gof23.gof23_3.visitor;

/**
 * 具体元素
 */
class ElementA implements Element {

    public void accept(Visitor visitor) {
        visitor.visit(this); // todo 这里用到了双分派，即参数变成了动作执行者，动作执行者变成了参数
    }

    public String operation() {
        return "ElementA的操作";
    }
}