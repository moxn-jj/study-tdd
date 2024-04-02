package com.study.tdd.etc.pattern.abst.factory;

public class SoccerStaffFactory implements StaffFactory {

    @Override
    public Manager createManager() {
        return new SoccerManager();
    }

    @Override
    public Player createPlayer() {
        return new SoccerPlayer();
    }
}
