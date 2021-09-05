package gof23.gof23_1.factory.abstractFactory;

public class APhone implements Phone{
    @Override
    public void call() {
        System.out.println("APhone-call");
    }
}
