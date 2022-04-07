package com.company;

public class Figures {
    private int side;

    public Figures(int side){
        this.setSide(side);
    }

    public int getSide(){
        return  this.side;
    }

    public void setSide(int side){
        this.side = side;
    }

    public float calcArea(){
        return this.getSide()*this.getSide();
    }
}
