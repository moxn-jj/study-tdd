package com.study.tdd.etc.pattern.factory.method;

public class NaverUserFactory extends UserFactory {

    @Override
    protected User createUser() {
        return new NaverUser();
    }
}
