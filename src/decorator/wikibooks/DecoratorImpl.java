package decorator.wikibooks;

public class DecoratorImpl implements IService {

    IService service;

    @Override
    public String runSomething() {
        System.out.println("호출에 대한 장식이 주목적이다. 클라이언트에게 반환 결과에 장식을 더하여 전달한다.");

        service = new DecoratorImpl();
        return "good " + service.runSomething();
    }

}
