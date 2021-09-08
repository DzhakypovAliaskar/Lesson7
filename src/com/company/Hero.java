package com.company;

public abstract class Hero implements HavingSuperAbility{

    public abstract int health();
    public abstract int damage();
    public abstract String applySuperAbility(String superAbilityType);
}

