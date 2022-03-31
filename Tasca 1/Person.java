package com.company;

public class Person {
    //Atributs de la classe
    String name, surname, dni;
    float height, width;

    //getName: retorna el valor que conté l'atribut 'name'
    public String getName() {
        return this.name;
    }
    //setName: assigna el valor de l'argument a l'atribut 'name'
    public void setName(String name) {
        this.name = name;
    }

    //getSurname: retorna el valor que conté l'atribut 'surname'
    public String getSurname() {
        return this.surname;
    }
    //setSurname: assigna el valor de l'argument a l'atribut 'surname'
    public void setSurname(String surname) {
        this.surname = surname;
    }

    //getdni: retorna el valor que conté l'atribut 'dni'
    public String getDni() {
        return this.dni;
    }
    //setdni: assigna el valor de l'argument a l'atribut 'dni'
    public void setDni(String dni) {
        this.dni = dni;
    }

    //getHeight: retorna el valor que conté l'atribut 'height'
    public float getHeight() {
        return this.height;
    }
    //setHeight: assigna el valor de l'argument a l'atribut 'height'
    public void setHeight(float height) {
        this.height = height;
    }

    //getWidth: retorna el valor que conté l'atribut 'width'
    public float getWidth() {
        return this.width;
    }
    //setWidth: assigna el valor de l'argument a l'atribut 'width'
    public void setWidth(float width) {
        this.width = width;
    }
}