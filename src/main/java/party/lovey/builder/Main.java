package party.lovey.builder;

public class Main {
    public static void main(String[] args){

        PersonBuilder personBuilder = new ManBuilder().buildHead().buildBody().buildFoot();

        Person man1 = personBuilder.buildPerson();

        Person man2 = new PersonDirector().constructPerson(personBuilder);
    }
}
