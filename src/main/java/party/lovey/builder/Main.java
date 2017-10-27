package party.lovey.builder;

public class Main {
    public static void main(String[] args){

        PersonBuilder personBuilder = new ManBuilder().buildHead().buildBody().buildFoot();

        Person man1 = personBuilder.buildPerson();

        Person man2 = new PersonDirector().constructPerson(personBuilder);

        Person women = Person.builder().head("漂亮的头").body("前凸后翘的身材").food("好看的脚").build();


    }
}
