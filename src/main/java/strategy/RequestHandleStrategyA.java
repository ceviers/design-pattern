package strategy;

public class RequestHandleStrategyA implements RequestHandleStrategy{
    @Override
    public RequestType checkRequestType() {
        return RequestType.A;
    }

    @Override
    public void doOperation(Object request) {
        System.out.println(request);
    }
}
