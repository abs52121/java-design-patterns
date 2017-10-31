package party.lovey.proxy;

public class Proxy implements Sourceable{

    Sourceable source;

    public Proxy(){
        source=new Source();
    }
    @Override
    public void method() {
        before();
        source.method();
        after();
    }

    private void after() {
        System.out.println("before");
    }

    private void before() {
        System.out.println("after");
    }
}
