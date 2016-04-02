package com.spring.demo;

public class DataSource {

    String name;
    Integer port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public DataSource(){

    }

    public DataSource(String name, Integer port) {
        this.name = name;
        this.port = port;
    }

    public void displayMessage(){
        System.out.println("Display Message");
    }
}
