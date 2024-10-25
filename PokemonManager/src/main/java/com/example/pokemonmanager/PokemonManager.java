package com.example.pokemonmanager;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.HashMap;
/*wir nutzen HashMap, um bei den fall dass wir Pokemons haben die gleiche Name besitzen, wir können trotzdem
die Pokemon finden */



public class PokemonManager {

    public void TaskManager(){
        boolean running = true;
        HashMap<Integer, Pokemon> pokemon_in_game = new HashMap<Integer, Pokemon>();
        HashMap<Integer, Trainer> trainer_in_game = new HashMap<Integer, Trainer>();
        HashMap<Integer, String> local_pokemon_in_game = new HashMap<Integer, String>();


        while(running){
            //entscheiden welche funktion
            System.out.println("Please enter your decide between this options: " +
                    "\nCreate pokemon, Show Pokemon Details, Edit Pokemon, Delete Pokemon," +
                    "\nIf you want to exit the program, please enter 'exit'," +
                    "\nIf you want to see the list of Pokemon, please enter 'list'," +
                    "\ncreate a new Trainer, please enter 'Create Trainer'," +
                    "\nShow Trainer Details, please enter 'Show Trainer Details'," +
                    "\nLink Pokemon to Trainer, please enter 'Link Pokemon to Trainer'," +
                    "\nList Pokemons for Trainer, please enter 'List Pokemons for Trainer'," +
                    "\nList Pokemons for Trainer by Type, please enter 'List Pokemons for Trainer by Type'," +
                    "\nShow i-th Pokemon for Trainer, please enter 'Show i-th Pokemon for Trainer'");
            Scanner sc = new Scanner(System.in);
            String choice = sc.nextLine();
            switch (choice){
                case "Create pokemon":
                    System.out.println("Create a new Pokemon!");
                    System.out.println("Please enter the name of the Pokemon:");
                    String name = sc.nextLine();
                    System.out.println("Please enter the type of the Pokemon:");
                    String type = sc.nextLine().toUpperCase();

                    Pokemon p = new Pokemon(name, Type.valueOf(type));
                    pokemon_in_game.put(p.getNumber(), p);
                    local_pokemon_in_game.put(p.getNumber(), p.getName());
                    //System.out.println("Pokemon created: " + p.toString());
                    System.out.println(pokemon_in_game);
                    System.out.println(local_pokemon_in_game);

                    break;


                case "Show Pokemon Details":
                    System.out.println("About which Pokemon do you want to see the details?");

                    String pokemon_name = sc.nextLine();
                    for (int i = 0; i < local_pokemon_in_game.size(); i++){
                        if (local_pokemon_in_game.containsValue(pokemon_name)){
                            System.out.println(pokemon_in_game.get(i + 1).toString());
                        }
                    }
                    break;

                case "Edit Pokemon":
                    System.out.println("What is your choice?"
                            + "\nEdit Name, please enter 'Edit Name'"
                            + "\nEdit Type, please enter 'Edit Type'");
                    String edit_choice = sc.nextLine();
                    switch (edit_choice) {
                        case "Edit Name":
                            System.out.println("Please enter the new name of the Pokemon:");
                            String new_name = sc.nextLine();
                            System.out.println("Which ID does the pokemon have that you want to edit?");
                            System.out.println(local_pokemon_in_game);
                            int id = sc.nextInt();
                            pokemon_in_game.get(id).setName(new_name);
                            local_pokemon_in_game.put(id, new_name);
                            System.out.println(local_pokemon_in_game);
                            System.out.println(pokemon_in_game);
                            break;
                        case "Edit Type":
                            System.out.println("Please enter the new type of the Pokemon:");
                            String new_type = sc.nextLine();
                            System.out.println("Which ID does the pokemon have that you want to edit?");
                            System.out.println(local_pokemon_in_game);
                            int id1 = sc.nextInt();
                            pokemon_in_game.get(id1).setType(Type.valueOf(new_type));
                            local_pokemon_in_game.put(id1, new_type);
                            System.out.println(local_pokemon_in_game);
                            System.out.println(pokemon_in_game);
                            break;
                    }
                case "Delete Pokemon":
                    if(local_pokemon_in_game.isEmpty()){
                        System.out.println("There is no Pokemon to delete!");
                        break;
                    } else if (local_pokemon_in_game.size() == 1) {
                        local_pokemon_in_game.remove(1);
                        pokemon_in_game.remove(1);
                        break;
                    }else {
                        System.out.println("Which ID does the pokemon have that you want to delete?");
                        System.out.println(local_pokemon_in_game);
                        int id_to_remove = sc.nextInt();
                        local_pokemon_in_game.remove(id_to_remove);
                        pokemon_in_game.remove(id_to_remove);
                        System.out.println("Pokemon deleted!");
                        break;
                    }

                case "exit":
                    System.out.println("Exit the program!");
                    running = false;
                    break;
                case "list":
                    System.out.println("List of Pokemon:");
                    for (Pokemon p1 : pokemon_in_game.values()){
                        System.out.println(p1.toString());
                    }
                    break;
                case "Create Trainer":
                    System.out.println("Please enter the first name of the Trainer:");
                    String firstName = sc.nextLine();
                    System.out.println("Please enter the last name of the Trainer:");
                    String lastName = sc.nextLine();
                    Trainer t = new Trainer(firstName, lastName);
                    System.out.println("Trainer created: " + t.toString());
                    break;
                case "Show Trainer Details":
                    System.out.println("Show Trainer Details!");
                    break;
                case "Link Pokemon to Trainer":
                    System.out.println("Link Pokemon to Trainer!");
                    break;
                case "List Pokemons for Trainer":
                    System.out.println("List Pokemons for Trainer!");
                    break;
                case "List Pokemons for Trainer by Type":
                    System.out.println("List Pokemons for Trainer by Type!");
                    break;
                case "Show i-th Pokemon for Trainer":
                    System.out.println("Show i-th Pokemon for Trainer!");
                    break;

                default:
                    System.out.println("No decision made");
                    running = false;
                    break;
            }
        }


    }

    public static void main(String[] args) {

        PokemonManager p = new PokemonManager();
        p.TaskManager();

    }

}