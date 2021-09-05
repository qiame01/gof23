package gof23.gof23_2.proxy.dynamicProxy.proxy3;

public class ActorImpl implements Actor {
    @Override
    public void movie(String value) {
        System.out.println("游女长歌缓缓归");
    }

    @Override
    public void teleplay(String value) {
        System.out.println("江山如画");

    }
}
