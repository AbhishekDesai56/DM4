package com.builder.censusanalyser;

public class CSVBuilderFactory {

    public static ICSVBuilder createCSVBuilder() {
        return new OpenCSVBuilder();
    }
}
