package strategy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        var type = "request type";

        // 不使用策略模式处理
        if ("A".equals(type)) {
            // handle type A
            System.out.println("A");
        } else if ("B".equals(type)) {
            // handle type B
            System.out.println("B");
        } else {
            // default handler
            System.out.println(type);
        }


        var requestType = RequestType.A;

        // 使用策略模式
        Map<RequestType, RequestHandleStrategy> requestStrategy = new HashMap<>();

        ServiceLoader<RequestHandleStrategy> loader = ServiceLoader.load(RequestHandleStrategy.class);
        loader.forEach(item -> {
            requestStrategy.put(item.checkRequestType(), item);
        });
        if (requestStrategy.get(requestType) != null){
            requestStrategy.get(requestType).doOperation(requestType);
        }else {
            // default handler
            System.out.println(requestType);
        }
    }
}