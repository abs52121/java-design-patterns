package party.lovey.singleton;

import java.util.concurrent.CyclicBarrier;


public class Test {

    private static Test instance;
    private String data;

    private Test() {
        try {
            //模拟初始化耗时
            Thread.sleep(1000);
            data = new String("hello");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static Test getInstance() {
        if (instance == null) {
            synchronized (Test.class) {
                instance = new Test();
                instance.hashCode();
            }
        }
        return instance;
    }

    public static void main(String[] args) {

        int num = 10000;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(num);

        for (int i = 0; i < num; i++) {
            new Thread(() -> {
                try {
                    cyclicBarrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                String data = Test.getInstance().getData();
                // System.out.println(data);
            }).start();
        }


    }

    public String getData() {
        return data.trim();
    }
}
