package gof23.gof23_3.interpreter;

/**
 * 抽象表达式类
 */
interface Expression {
    boolean interpret(String info);
}