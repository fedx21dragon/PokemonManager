package com.example.pokemonmanager;

public class PokemonTest {

    public static void main(String[] args){
        Pokemon p1 = new Pokemon("Klumander", Type.FIRE);
        Pokemon p2 = new Pokemon("Bulb", Type.POISON);
        Pokemon p3 = new Pokemon("Pikachu", Type.LIGHT);

        //Testen von toString
        //diese Operationen sind witchig, um zu sehen, ob die Klasse Pokemon richtig implementiert ist
        //und vor allem wollen wir dann beim erzeugen von Pokemon ob es auch so geklappt hat wie wir es wollten
        System.out.println("Testen von toString");
        System.out.println("p1:");
        System.out.println(p1.toString());

        //testen von getter
        //Umzu sehen ob der Pokemon schon existiert
        System.out.println("Testen von Getter:");
        System.out.println("Name von Pokemon p2:");
        System.out.println(p2.getName());
        System.out.println("Typ von Pokemon p2:");
        System.out.println(p2.getType());

        //testen von setter
        /*Bei Fälle wenn man Pokemon name und typ gibt oder Trainername */
        System.out.println("Testen von Setter:");
        System.out.println("Name von Pokemon p3:");
        System.out.println(p3.getName());
        System.out.println("Typ von Pokemon p3:");
        System.out.println(p3.getType());
        p3.setName("Pikachu");
        p3.setType(Type.DARK);
        System.out.println("Name von Pokemon p3:");
        System.out.println(p3.getName());
        System.out.println("Typ von Pokemon p3:");
        System.out.println(p3.getType());



    }
}
