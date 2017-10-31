package party.lovey.proxy;

public class Client {

    public static void main(String[] args) {
        /**
         * 所有的功能通过代理类完成
         * 自身不直接和client接触
         */
        Sourceable sourceable=new Proxy();
        sourceable.method();
    }
}
