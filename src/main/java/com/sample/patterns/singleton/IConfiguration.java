package com.sample.patterns.singleton;

public interface IConfiguration {
    String getConnectionString();
}

//class DatabaseConfiguration implements  IConfiguration{
//    @Override
//    public String getConnectionString() {
//        //do...
//    }
//}
//
//class SimpleConfiguration implements  IConfiguration{
//    @Override
//    public String getConnectionString() {
//        return "";
//
//
//    }
//}
