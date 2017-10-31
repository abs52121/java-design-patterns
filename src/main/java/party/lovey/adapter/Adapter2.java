package party.lovey.adapter;

public class Adapter2 implements Targetable{
    private Source source;
    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is  method2!");
    }
}
