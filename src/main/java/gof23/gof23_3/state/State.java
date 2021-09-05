package gof23.gof23_3.state;

/**
 * 接口或抽象类均可(但要注意类的单继承局限)
 * 处理业务逻辑时，可能需要环境类参数context和客户端传递的参数aaa
 */
public abstract class State {
    public abstract void handle(Context context, String aaa);
}
