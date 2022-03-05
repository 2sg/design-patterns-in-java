package templateMethod.wikibooks;

public class Dog extends Animal {

    //추상메소드 오버라이딩
    @Override
    void play() {
        System.out.println("bow wow");
    }

    //Hook메소드 오버라이딩
    @Override
    void runSomething() {
        System.out.println("bow wow / wagging");
    }

}
