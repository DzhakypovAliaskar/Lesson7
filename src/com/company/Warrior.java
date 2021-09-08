package com.company;

public  class Warrior extends Hero{

    @Override
    public int health() {
        return 200;
    }

    @Override
    public int damage() {
        return 70;
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Warrior применил суперспособность " + superAbilityType;
    }
}
