package party.lovey.abstractfactory;

/**
 * 麦当劳汉堡
 * @author huhaichao
 */
public class MCDHamburger implements AbstractHamburger {

    @Override
    public void heat() {
        System.out.println("汉堡：麦当劳热量90");
    }
}
