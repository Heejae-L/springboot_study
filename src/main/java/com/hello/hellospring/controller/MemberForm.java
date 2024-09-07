package com.hello.hellospring.controller;

public class MemberForm {
    //왜 스프링이 자동적으로 여기에 저장하는지 궁금하다
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
