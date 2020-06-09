package com.minghong;

public class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;
    private int test;

    //bad constructor
//    public Rectangle(){
//        this.height = 0;
//        this.width = 0;
//        this.x = 0;
//        this.y =0;
//    }
//    public Rectangle(int width,int height){
//        this.x = 0;
//        this.y = 0;
//        this.width = width;
//        this.height = height;
//    }
//    public Rectangle(int x, int y, int width, int height){
//        this.x = x;
//        this.y = y;
//        this.width = width;
//        this.height = height;
//    }

    //good constructor

    //1st constructor
    public Rectangle() {
        this(0,0); //calls 2nd constructor
    }
    //2nd constructor
    public Rectangle(int width, int height){
        this(0,0,width,height); //calls 3rd constructor
    }
    //3rd constructor
    public Rectangle(int x,int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getTest() {
        return test;
    }
}
