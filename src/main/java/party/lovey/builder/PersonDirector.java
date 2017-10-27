package party.lovey.builder;

/**
 * 构造一个使用Builder接口的对象，指导构建过程
 *
 * @author huhaichao
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }
}
