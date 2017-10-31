package party.lovey.proxy;

public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("this is the origin method");
    }
}
