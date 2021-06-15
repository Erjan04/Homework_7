package com.company;

public class  Warrior extends Character implements Superable {
    @Override
    public void useSuperPower() {
        System.out.println("Боец применил ульту!");
    }

}
