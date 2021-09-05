package gof23.gof23_3.state;

public class BState extends State {

    @Override
    public void handle(Context context, String aaa) {
        System.out.println("\nBState handle方法接收到两个典型参数，并做出符合B状态的业务行为\n");

    }
}
