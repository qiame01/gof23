package gof23.gof23_3.visitor;

/**
 * 抽象访问者，Visitor子类可以扩展，如VisitorA、VisitorB...Visitor是可扩展的第2个维度
 */
interface Visitor {

    void visit(Element element);

}