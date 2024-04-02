package com.study.tdd.etc.pattern.factory.method;

public class KakaoUser implements User {
    @Override
    public void signUp() {
        System.out.println("Kakao 아이디로 가입");
    }
}
