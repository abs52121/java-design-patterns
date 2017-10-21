package party.lovey.factory;


/**
 * 工厂方法，用来产生对象
 * @author huhaichao
 */
public class Factory {

    public Product create(String type) {
        if (ProductA.class.getSimpleName().equalsIgnoreCase(type)) {
            return new ProductA();
        } else if (ProductA.class.getSimpleName().equalsIgnoreCase(type)) {
            return new ProductB();
        } else {
            return () -> {
                System.out.println("Product other...");
            };
        }
    }
}
