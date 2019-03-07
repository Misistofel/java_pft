package ru.stqa.pft.sandbox;
import java.lang.Math;
public class MyFirstProgram {

    public static void main(String[] args){

        System.out.println("Hello, world!");

        Point p=new Point(3,3);
        //p.x=2;
        //p.y=2;


        //Point p2=new Point(4,4);
        //p2.x=4;
        //p2.y=4;


        System.out.println("Расстояние мужду точками p1 и p2 "+" = "+p.distance());
    }

    //Трансформирую обычную ф-ю в метод - переношу внутрь класса, который описывет соответствующие объекты
    //
    //public static double distance(Point p1,Point p2){
    //  return (Math.sqrt((p2.x-p1.x)*(p2.x-p1.x)+(p2.y-p1.y)*(p2.y-p1.y)));


}