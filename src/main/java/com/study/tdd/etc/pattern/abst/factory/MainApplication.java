package com.study.tdd.etc.pattern.abst.factory;

public class MainApplication {
    public static void main(String[] args) {

        use(new SoccerStaffFactory());
        use(new TennisStaffFactory());
    }

    private static void use(StaffFactory factory) {
        Manager manager = factory.createManager();
        Player player = factory.createPlayer();

        System.out.println(manager.getClass());
        System.out.println(player.getClass());
    }
}
