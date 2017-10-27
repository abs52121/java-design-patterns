package party.lovey.builder;

/**
 * 实现Builder的接口以构造和装配该产品的各个部件，
 * 定义并明确它所创建的表示，并提供一个检索产品的接口。
 *
 * @author huhaichao
 */
public class ManBuilder implements PersonBuilder {

    private Person person;

    public ManBuilder() {
        person = new Person();
    }

    @Override
    public ManBuilder buildHead() {
        person.setHead("帅气的头");
        return this;
    }

    @Override
    public ManBuilder buildBody() {
        person.setBody("脱衣有肉，穿衣显瘦的身体");
        return this;
    }

    @Override
    public ManBuilder buildFoot() {
        person.setFood("没别的，就是脚");
        return this;
    }

    @Override
    public Person buildPerson() {
        return person;
    }
}
