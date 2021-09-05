package gof23.gof23_3.state;

/**
 * 处理业务逻辑时，可能需要环境类参数context和客户端传递的参数aaa
 */
public class AState extends State{

    @Override
    public void handle(Context context,String aaa) {
        System.out.println("AState handle方法接收到两个典型参数，并做出符合A状态的业务行为\n");
    }
}
