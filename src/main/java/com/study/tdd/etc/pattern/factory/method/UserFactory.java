package com.study.tdd.etc.pattern.factory.method;

public abstract class UserFactory {

    public User newInstance() {
        User user = createUser();
        user.signUp();
        return user;
    }

    protected abstract User createUser();
}
