package com.company;
import java.util.Scanner;

public class Main {
    //Persona
//Mesnaje que se muestr por pantalla
    public static final String MSG_NAME = "Introdueix el nom de la persona:";
    public static final String MSG_SURNAME = "Introdueix el cognom de la persona:";
    public static final String MSG_DNI = "Introdueix el DNI de la persona:";
    public static final String MSG_height = "Introdueix l'altura de la persona:";
    public static final String MSG_width = "Introdueix el pes de la persona:";
    //Car
    public static final String MSG_model = "Introdueix el model del cotxe:";
    public static final String MSG_brand = "Introdueix la marca del cotxe:";
    public static final String MSG_price = "Introdueix el preu del cotxe:";
    //Cat
    public static final String MSG_name = "Introdueix el nom del gat:";
    public static final String MSG_color = "Introdueix el color del gat:";
    public static final String MSG_raza = "Introdueix la raza del gat:";
    //Chair
    public static final String MSG_1heigth = "Introdueix la altura de la cadira:";
    public static final String MSG_2width = "Introdueix el pes de la cadira:";
    //Square
    public static final String MSG_2heigth = "Introdueix la altura del cuadrat:";
    public static final String MSG_area = "Introdueix l'area del cuadrat:";


    public static void main(String[] args) {
        //Person
//Escanear cosas xd
        Scanner sc = new Scanner(System.in);
        //alumme_asix: Instància de la classe Person
        Person alumne_asix = new Person();
        //alumme_daw: Instància de la classe Person
        Person alumne_daw = new Person();
//Printa el mensaje
        System.out.println(MSG_NAME);
        alumne_asix.setName(sc.next());
        System.out.println(MSG_SURNAME);
        alumne_asix.setSurname(sc.next());
        System.out.println(MSG_DNI);
        alumne_asix.setDni(sc.next());
        System.out.println(MSG_height);
        alumne_asix.setHeight(Float.parseFloat(sc.next()));
        System.out.println(MSG_width);
        alumne_asix.setWidth(Float.parseFloat(sc.next()));
//Mostramos por pantalla el texto escrito por el usuario
        System.out.println(alumne_asix.getName());
        System.out.println(alumne_asix.getSurname());
        System.out.println(alumne_asix.getDni());
        System.out.println(alumne_asix.getHeight());
        System.out.println(alumne_asix.getWidth());

        //Car: Instància de la classe Car
        Car car = new Car();
//Printa el mensaje
        System.out.println(MSG_model);
        car.setModel(sc.next());
        System.out.println(MSG_brand);
        car.setBrand(sc.next());
        System.out.println(MSG_price);
        car.setPrice(Float.parseFloat(sc.next()));
//Mostramos por pantalla el texto escrito por el usuario
        System.out.println(car.getModel());
        System.out.println(car.getBrand());
        System.out.println(car.getPrice());

        //Cat: Instància de la classe Cat
        Cat cat = new Cat();
//Printa el mensaje
        System.out.println(MSG_name);
        cat.setName(sc.next());
        System.out.println(MSG_color);
        cat.setColor(sc.next());
        System.out.println(MSG_raza);
        cat.setRaza(sc.next());
//Mostramos por pantalla el texto escrito por el usuario
        System.out.println(cat.getName());
        System.out.println(cat.getColor());
        System.out.println(cat.getRaza());

        //Chair: Instància de la classe Chair
        Chair chair = new Chair();
//Printa el mensaje
        System.out.println(MSG_1heigth);
        chair.setHeight(Float.parseFloat(sc.next()));
        System.out.println(MSG_2width);
        chair.setWidth(Float.parseFloat(sc.next()));

//Mostramos por pantalla el texto escrito por el usuario
        System.out.println(chair.getHeight());
        System.out.println(chair.getWidth());

        //Chair: Instància de la classe Chair
        Square square = new Square();
//Printa el mensaje
        System.out.println(MSG_2heigth);
        square.setHeight(Float.parseFloat(sc.next()));
        System.out.println(MSG_area);
        square.setArea(Float.parseFloat(sc.next()));

//Mostramos por pantalla el texto escrito por el usuario
        System.out.println(square.getHeight());
        System.out.println(square.getArea());
    }
}
