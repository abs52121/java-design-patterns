package party.lovey.factory;

/**
 * 静态工厂方法模式，将上面的多个工厂方法模式里的方法置为静态的，不需要创建实例，直接调用即可。
 *
 * @author huhaichao
 */
public class StaticFactory {

    public static Product createA() {
        return new ProductA();
    }

    public static Product createB() {
        return new ProductB();
    }
}
