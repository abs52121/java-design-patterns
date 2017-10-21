package party.lovey.abstractfactory;

/**
 * 肯德基生产的汉堡
 * @author huhaichao
 */
public class KFCHamburger implements AbstractHamburger {
    @Override
    public void heat() {
        System.out.println("汉堡：肯德基热量100");
    }
}
