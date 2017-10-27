package party.lovey.builder;

/**
 * 为创建一个产品对象的各个部件指定抽象接口
 *
 * @author huhaichao
 */
public interface PersonBuilder {
    ManBuilder buildHead();

    ManBuilder buildBody();

    ManBuilder buildFoot();

    Person buildPerson();
}
