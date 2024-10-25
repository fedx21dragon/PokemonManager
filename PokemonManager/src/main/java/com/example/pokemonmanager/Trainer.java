package com.example.pokemonmanager;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Scanner;

public class Trainer {
    //Methoden der Klasse trainer
    private String firstName;
    private String lastName;
    private int ID;
    private int nextID = 1;
    private List<Pokemon> pokemons = new ArrayList();

    Scanner sc1 = new Scanner(System.in);
    String choice = sc1.nextLine();

    //Konstruktor
    public Trainer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = this.nextID++;
    }
    //Methoden der Klasse Trainer get und set
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    //Create Trainer in Terminal,
    //Show Trainer Details in Terminal,
    //Link Pokemon to Trainer in Terminal,
    //List Pokemons for Trainer in Terminal,
    //List Pokemons for Trainer by Type in Terminal und
    //Show i-th Pokemon for Trainer in Terminal

    public static void createTrainer() {

    }

    public void addTrainer(Trainer trainer) {

    }
    //methoden zu liste erstellen wie add, remove, get, set


    //get pokemon
    public List<Pokemon> getPokemons() {
        return this.pokemons;
    }
    //getPokemon an einer bestimmten Stelle
    public Pokemon getPokemon(int index) {
        return (Pokemon)this.pokemons.get(index);
    }

    public void setPokemons(List<Pokemon> pokemons) {
        this.pokemons = pokemons;
        Iterator var2;
    }

    //add pokemon
    public void addPokemon(Pokemon pokemon) {
        this.getPokemons().add(pokemon);
        pokemon.setTrainer(this);
    }

    //remove pokemon
    public void removePokemon(int index) {
        this.pokemons.remove(index);;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", pokemons=" + pokemons +
                '}';
    }

    public static void main(String[] args) {
        List<Pokemon> pokemons = new ArrayList();
    }
}
