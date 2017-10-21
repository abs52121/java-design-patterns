package party.lovey.abstractfactory;

/**
 * 麦当劳鸡腿
 * @author huhaichao
 */
public class MCDChicken implements AbstractChicken {

    @Override
    public void taste() {
        System.out.println("鸡腿：麦当劳口味");
    }

}
