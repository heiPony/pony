package com.pony.test.projectTest;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    int age;
    String name;
    String address;

    static List<Test> list = new ArrayList<>();

    public Test() {

    }

    public Test(int age, String name, String address) {
        this.age = age;
        this.name = name;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static List<Test> getList() {
        return list;
    }

    public static void setList(List<Test> list) {
        Test.list = list;
    }

    @Override
    public String toString() {
        return "Test{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    static {
        list.add(new Test(19,"huang","厦门"));
        list.add(new Test(20,"wang","泉州"));
        list.add(new Test(18,"huang","福州"));
        list.add(new Test(18,"li","漳州"));
        list.add(new Test(19,"huang","厦门"));
    }

    public static void main(String[] args) {
        Test test = new Test();
        List<Test> list=Test.list;
        List<Test> collect = list.stream().filter(item ->list.contains(item)).collect(Collectors.toList());
        collect.forEach(System.out::println);
        list.forEach(item->{
            
        });
    }










}
