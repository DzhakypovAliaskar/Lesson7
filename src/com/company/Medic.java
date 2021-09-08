package com.company;

public class Medic extends Hero{


    @Override
    public int health() {
        return 80;
    }

    @Override
    public int damage() {
        return 25;
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Medic  применил суперспособность " + superAbilityType;
    }
}
