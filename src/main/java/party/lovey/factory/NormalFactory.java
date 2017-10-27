package party.lovey.factory;


/**
 * 普通工厂模式，就是建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 * 工厂方法，用来产生对象
 *
 * @author huhaichao
 */
public class NormalFactory {

    public Product create(String type) {
        if (ProductA.class.getSimpleName().equalsIgnoreCase(type)) {
            return new ProductA();
        } else if (ProductA.class.getSimpleName().equalsIgnoreCase(type)) {
            return new ProductB();
        } else {
            return null;
        }
    }
}
