package com.study.tdd.etc.pattern.factory.method;

public class MainApplication {
    public static void main(String[] args) {

        UserFactory naverUserFactory = new NaverUserFactory();
        User naverUser = naverUserFactory.newInstance();
        System.out.println(naverUser.getClass());

        UserFactory kakaoUserFactory = new KakaoUserFactory();
        User kakaoUser = kakaoUserFactory.newInstance();
        System.out.println(kakaoUser.getClass());
    }
}
