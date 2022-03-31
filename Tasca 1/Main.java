package com.company;

public class Main {

    public static void main(String[] args) {
        //alumme_asix: Instància de la classe Person
        Person alumne_asix = new Person();
        //alumme_daw: Instància de la classe Person
        Person alumne_daw = new Person();

        alumne_asix.setName("Zaida");
        System.out.println(alumne_asix.getName());

        alumne_asix.setSurname("Morales");
        System.out.println(alumne_asix.getSurname());

        alumne_asix.setDni("53643561V");
        System.out.println(alumne_asix.getDni());

        alumne_asix.setHeight(1.58f);
        System.out.println(alumne_asix.getHeight());

        alumne_asix.setWidth(5f);
        System.out.println(alumne_asix.getWidth());
    }
}
