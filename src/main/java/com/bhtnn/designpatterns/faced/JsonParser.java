package com.bhtnn.designpatterns.faced;

 class JsonParser implements IFileParser {

    @Override
    public String parse(String content) {
        System.out.println("Contet : ".concat(content));
        return "Im JSON parser";
    }
}
