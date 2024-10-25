package com.example.pokemonmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;

public class Pokemon {

        private String name;
        private Type type;
        private int number = 0;
        private static int nextNumber = 1;
        private Trainer trainer;
        private Boolean swaps = false;
        private Boolean competitions = false;
        private Boolean isSwapAllowed = true;


    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", type=" + type +
                ", number=" + number +
                '}';
    }

    public Trainer getTrainer() {
        return this.trainer;
    }
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
    public boolean isSwapAllowed() {
        return this.isSwapAllowed;
    }


    public void setSwapAllowed(boolean isSwapAllowed) {
        this.isSwapAllowed = isSwapAllowed;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
            return name;
        }

        public Type getType() {
            return type;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setType(Type type) {
            this.type = type;
        }


    public Pokemon(String name, Type type) {
        this.name = name;
        this.type = type;
        this.number = nextNumber;
        nextNumber++;
        this.trainer = trainer;
        this.swaps = swaps;
        this.competitions = competitions;
        this.isSwapAllowed = isSwapAllowed;
    }




        public static void main(String[] args) {
            Pokemon p1 = new Pokemon("Bulb", Type.POISON);


        }
}
