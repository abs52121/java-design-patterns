package party.lovey.abstractfactory;

/**
 * 麦当劳工厂，生产麦当劳产品
 * @author huhaichao
 */
public class MCDFactory implements AbstractFactory{
    @Override
    public AbstractChicken createChicken() {
        return new MCDChicken();
    }

    @Override
    public AbstractHamburger createHamburger() {
        return new MCDHamburger();
    }
}
