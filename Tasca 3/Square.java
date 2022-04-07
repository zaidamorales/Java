package com.company;

public class Square {
    private int side;

    public Square(int side, String name){
        this.setSide(side);
    }
    public int getSide(){
        return this.side;
    }

    public void setSide(int side){
        if(side>0){
            this.side = side;
        }
        else{
            System.out.println("Error");
        }
    }
}
