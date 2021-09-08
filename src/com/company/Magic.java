package com.company;

public class Magic extends Hero{

    @Override
    public int health() {
        return 100;
    }

    @Override
    public int damage() {
        return 50;
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
      return "Magic применил суперспособность " + superAbilityType ;

    }

    }

