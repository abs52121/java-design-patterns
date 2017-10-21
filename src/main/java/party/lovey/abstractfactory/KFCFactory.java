package party.lovey.abstractfactory;


/**
 * 肯德基工厂
 * @author huhaichao
 */
public class KFCFactory implements AbstractFactory{
    @Override
    public AbstractChicken createChicken() {
        return new KFCChicken();
    }

    @Override
    public AbstractHamburger createHamburger() {
        return new KFCHamburger();
    }
}
