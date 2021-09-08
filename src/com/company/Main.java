package com.company;

import java.io.Flushable;

public class Main {

    public static void main(String[] args) {

        Magic magic = new Magic();
        System.out.println(magic.health());
        System.out.println(magic.damage());
        System.out.println(magic.applySuperAbility("PARALYSIS SPELL"));

        System.out.println("____________________");

        Medic medic = new Medic();
        System.out.println(medic.health());
        System.out.println(medic.damage());
        System.out.println(medic.applySuperAbility("SUPER TREATMENT"));

        System.out.println("____________________");

        Warrior warrior = new Warrior();
        System.out.println(warrior.health());
        System.out.println(warrior.damage());
        System.out.println(warrior.applySuperAbility("CRITICAL DAMAGE"));

        System.out.println("____________________");

        Hero[] heroes = {magic, medic, warrior};
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i] instanceof Hero) {
                switch (i) {
                    case 0:
                        System.out.println((heroes[i]).applySuperAbility("PARALYSIS SPELL"));
                        break;
                    case 1:
                        System.out.println((heroes[i]).applySuperAbility("SUPER TREATMENT"));
                        break;
                    case 2:
                        System.out.println((heroes[i]).applySuperAbility("CRITICAL DAMAGE"));
                        break;
                }
            }
        }
    }
}