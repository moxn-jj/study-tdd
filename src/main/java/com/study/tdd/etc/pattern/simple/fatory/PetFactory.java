package com.study.tdd.etc.pattern.simple.fatory;

public class PetFactory {
    public Pet create(Pet.Type petType) {
        switch(petType) {
            case CAT -> {
                return new Cat();
            }
            case DOG -> {
                return new Dog();
            }
            default -> throw new IllegalArgumentException("지원하지 않는 Pet 입니다.");
        }
    }
}
