package com.study.tdd.etc.pattern.factory.method;

public class NaverUser implements User {
    @Override
    public void signUp() {
        System.out.println("Naver 아이디로 가입");
    }
}
