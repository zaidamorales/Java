package com.company;
import java.util.Scanner;

public class Main {
    //square
//Mesnaje que se muestr por pantalla

        public static void main(String[] args) {
//Escanear cosas xd
        Scanner sc = new Scanner(System.in);
//cuadrado: Instància de la classe Quadrat
        Square sq = new Square(sc.nextInt(), "Quadrat");
//Printa el mensaje
        System.out.println(sq.getSide());
    }
}
