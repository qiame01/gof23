package gof23.gof23_2.proxy.dynamicProxy.proxyOptimization1;

public class ActorImpl implements Actor {
    @Override
    public void movie(String value) {
        System.out.println("I like movie movie");
    }

    @Override
    public void teleplay(String value) {
        System.out.println("I like movie teleplay teleplay");

    }
}
