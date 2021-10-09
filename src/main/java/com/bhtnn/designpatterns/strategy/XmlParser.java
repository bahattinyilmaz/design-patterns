package com.bhtnn.designpatterns.strategy;

public class XmlParser implements IFileParserStrategy {

    @Override
    public String doParse(String content) {
        System.out.println("Contet : ".concat(content));
        return "Im XML parser";
    }
}
