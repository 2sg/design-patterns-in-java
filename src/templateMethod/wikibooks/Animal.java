package templateMethod.wikibooks;

public abstract class Animal {
    //템플릿 메소드
    public void playWithOwner() {
        System.out.println("come on");
        play();
        runSomething();
        System.out.println("good");
    }
    
    //추상메소드
    abstract void play();
    
    //Hook메소드
    void runSomething() {
        System.out.println("wagging");
    }

}
