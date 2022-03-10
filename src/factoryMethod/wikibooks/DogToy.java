package factoryMethod.wikibooks;

//팩토리 메소드가 생성할 개체
public class DogToy extends AnimalToy {

    @Override
    void identify() {
        System.out.println("dog toy");
    }

}
