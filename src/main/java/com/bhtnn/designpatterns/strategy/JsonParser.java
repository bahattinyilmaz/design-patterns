package com.bhtnn.designpatterns.strategy;

public class JsonParser implements IFileParserStrategy {

    @Override
    public String doParse(String content) {
        System.out.println("Contet : ".concat(content));
        return "Im JSON parser";
    }
}
