package gof23.gof23_3.visitor;

/**
 * 抽象元素，Element子类可以扩展，如ElementA、ElementB...Element是可扩展的2个维度之一
 */
interface Element {

    void accept(Visitor visitor);

    String operation();
}