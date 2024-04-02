package com.study.tdd.etc.pattern.simple.fatory;

public class MainApplication {
    public static void main(String[] args) {

        // before
        Cat prevCat = new Cat();
        Dog pervDog = new Dog();

        // after
        PetFactory petFactory = new PetFactory();
        Pet cat = petFactory.create(Pet.Type.CAT);
    }
}
