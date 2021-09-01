
package main;

import dto.*;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Elige un tipo de personaje : "
                + "\n1. Mago"
                + "\n2. Guerrero"
                + "\n3. Demonio");
        byte tipo = input.nextByte();
        Personaje personaje = null;
        switch(tipo) {
            case 1 : 
                personaje = new Mago();
                System.out.println("Mago creado.");
                break;
            case 2 : 
                personaje = new Guerrero();
                System.out.println("Guerrero creado.");
                break;
            case 3 : 
                personaje = new Demonio();
                System.out.println("Demonio creado.");
                break;
            default : System.out.println("No existe la opción seleccionada");
                break;
        }
        System.out.println("Tu personaje tiene " + personaje.getVida() + " vida, " + personaje.getEnergia() + " energía y " + personaje.getAtaqueNormal()+ " de ataque normal");
        

        
//        Guerrero user1 = new Guerrero();
//        Mago user2 = new Mago();
//        System.out.println("Usuario 1 ");
//        System.out.println("Personaje : Guerrero");
//        System.out.println("Vida : " + user1.getVida());
//        System.out.println("Ataque : " + user1.getAtaqueNormal());
//        System.out.println("----------------------------");
//        System.out.println("Usuario 2 ");
//        System.out.println("Personaje : Mago");
//        System.out.println("Vida : " + user2.getVida());
//        System.out.println("Ataque : " + user2.getAtaqueNormal());
//        System.out.println("-----------Guerrero vs Mago-----------------");
//        user2.setVida(user1.atacar(user2.getVida()));
//        System.out.println("Guerrero atacando...");
//        System.out.println("Vida de Mago: " +user2.getVida());
//        user2.curar();
//        System.out.println("Curación de Mago...");
//        System.out.println("Vida de Mago: " +user2.getVida());
//        user1.setVida(user2.atacar(user1.getVida()));
//        System.out.println("Mago atacando...");
//        System.out.println("Vida de Guerrero: " +user1.getVida());
//        System.out.println("Guerrero bloqueando...");
//        user2.setAtaqueNormal(user1.bloquear(user2.getAtaqueNormal()));
//        System.out.println("Mago atacando...");
//        user1.setVida(user2.atacar(user1.getVida()));
//        System.out.println("Vida de Guerrero: " +user1.getVida());
//        
//        System.out.println("*******************************************");
//        Guerrero user3 = new Guerrero();
//        Demonio user4 = new Demonio();
//        System.out.println("Usuario 3 ");
//        System.out.println("Personaje : Guerrero");
//        System.out.println("Vida : " + user3.getVida());
//        System.out.println("Ataque : " + user3.getAtaqueNormal());
//        System.out.println("----------------------------");
//        System.out.println("Usuario 4 ");
//        System.out.println("Personaje : Demonio");
//        System.out.println("Vida : " + user4.getVida());
//        System.out.println("Ataque : " + user4.getAtaqueNormal());
//        System.out.println("-----------Guerrero vs Demonio-----------------");
//        System.out.println("Guerrero atacando...");
//        user4.setVida(user3.atacar(user4.getVida()));
//        System.out.println("Vida de Demonio: " +user4.getVida());
//        user4.transformar();
//        System.out.println("Transformación de Demonio...");
//        System.out.println("Vida " + user4.getVida() + " y Ataque " + user4.getAtaqueNormal());
//        System.out.println("Demonio atacando...");
//        user3.setVida(user4.atacar(user3.getVida()));
//        System.out.println("Vida de Guerrero: " +user3.getVida());
//        System.out.println("Guerrero bloqueando...");
//        user4.setAtaqueNormal(user3.bloquear(user4.getAtaqueNormal()));
//        System.out.println("Demonio atacando...");
//        user3.setVida(user4.atacar(user3.getVida()));
//        System.out.println("Vida de Guerrero: " +user3.getVida());
        
    }
}
