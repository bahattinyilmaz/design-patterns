package com.bhtnn.designpatterns.faced;

 public class HtmlParser implements IFileParser {

    @Override
    public String parse(String content) {
        System.out.println("Contet : ".concat(content));
        return "Im HTML parser";
    }
}
