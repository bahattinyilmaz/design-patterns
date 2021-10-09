package com.bhtnn.designpatterns.strategy;

public class HtmlParser implements IFileParserStrategy {

    @Override
    public String doParse(String content) {
        System.out.println("Contet : ".concat(content));
        return "Im HTML parser";
    }
}
