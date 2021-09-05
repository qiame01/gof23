package gof23.gof23_3.state;

/**
 * 环境类
 */
public class Context {

    private State state;

    public Context() {
        this.state = new AState(); // 设置默认状态
    }

    public void handle(String aaa) {
        // 1不同参数，触发不同状态的切换(例如分数决定优良中差四种状态)，最终由不同的状态类去执行具体业务操作。。
        Integer score = Integer.valueOf(aaa);

        if (score > 0 && score < 60) {
            // 沿用构造器里初始化的默认状态
        } else if (score >= 60 && score <= 100) {
            this.setState(new BState());
        } else {
            System.out.println(String.format("\n对比起,您的分数是%s,不在0-100闭区间内,故分配默认等第AState,并将执行其方法", score));
        }

        // 2处理方法保持稳定不变
        state.handle(this, aaa);
    }


    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

}
