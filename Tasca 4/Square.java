package com.company;

public class Square extends Figures{
    private String background;

    public Square(int side, String background){
        super(side);
        this.setBackground(background);
    }
    public String getBackground(){
        return this.background;
    }

    public void setBackground(String background){
        this.background = background;
    }

    public float calcArea(){
        return 2*(this.getSide()*this.getSide());
    }
}
