package gof23.gof23_3.visitor;

/**
 * 具体访问者
 */
class VisitorA implements Visitor {

    public void visit(Element element) {
        System.out.println("VisitorA 访问-->" + element.operation());
    }

}