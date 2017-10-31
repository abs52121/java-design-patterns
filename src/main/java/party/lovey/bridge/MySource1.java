package party.lovey.bridge;

public class MySource1 implements Sourceable{
    @Override
    public void method() {
        System.out.println("连接到Mysql");
    }
}
