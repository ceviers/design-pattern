package strategy;

public class RequestHandleStrategyB implements RequestHandleStrategy{
    @Override
    public RequestType checkRequestType() {
        return RequestType.B;
    }

    @Override
    public void doOperation(Object request) {
        System.out.println(request);
    }
}
