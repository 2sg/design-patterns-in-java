package factoryMethod.wikibooks;

//팩토리 메소드가 생성할 객체
public class CatToy extends AnimalToy {

    @Override
    void identify() {
        System.out.println("cat toy");
    }
    
}
