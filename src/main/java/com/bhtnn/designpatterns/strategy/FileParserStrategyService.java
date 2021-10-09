package com.bhtnn.designpatterns.strategy;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class FileParserStrategyService {
    private Map<FileTypes,IFileParserStrategy> fileParserStrategyMap =
            Map.of(FileTypes.HTML,new HtmlParser(),FileTypes.XML,new XmlParser(),FileTypes.JSON,new JsonParser());
    public IFileParserStrategy getParser(FileTypes fileTypes){
        return fileParserStrategyMap.get(fileTypes);
    }
}
