package strategy;

public interface RequestHandleStrategy {
    RequestType checkRequestType();
    void doOperation(Object request);
}
