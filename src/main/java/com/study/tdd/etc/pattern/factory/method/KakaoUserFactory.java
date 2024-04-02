package com.study.tdd.etc.pattern.factory.method;

public class KakaoUserFactory extends UserFactory {
    @Override
    protected User createUser() {
        return new KakaoUser();
    }
}
