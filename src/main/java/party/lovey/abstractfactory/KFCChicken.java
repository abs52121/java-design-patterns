package party.lovey.abstractfactory;

/**
 * 肯德基鸡腿
 * @author huhaichao
 */
public class KFCChicken implements AbstractChicken {
    @Override
    public void taste() {
        System.out.println("鸡腿：肯德基口味");
    }
}
