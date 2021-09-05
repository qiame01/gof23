package gof23.gof23_1.factory.abstractFactory;

public class BPhone implements Phone{
    @Override
    public void call() {
        System.out.println("BPhone-call");
    }
}
