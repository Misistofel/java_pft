package ru.stqa.pft.sandbox;
import java.lang.Math;
public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Marina");
        hello("Masha");
        hello("Dima");

        //double l=7;
        Square f=new Square(5);
        System.out.println("Площадь квадрата со сторой "+f.l+"  равна "+f.area());

        //double a=7;
        //double b=8 ;
        Regtangle g=new Regtangle(8,9);
        System.out.println("Площадь прямоугольника со сторонами "+g.a+ " и "+ g.b+ " равна "+g.area());

        Point p1=new Point(2,2);
        Point p2=new Point(4,4);

        System.out.println("Расстояние между точкой "+ p1.x+" и "+p2.y+" = "+distance(p1,p2));

        System.out.println("Расстояние между точками"+ p1.x+" и "+p2.y+" = "+p1.distance(p2));
    }

    public static double distance(Point k, Point j){
        return Math.sqrt((j.x-k.x)*(j.x-k.x)+(j.y-k.y)*(j.y-k.y));
    }

    public static void hello(String somebody) {

        System.out.println("Hello, " + somebody + " !");
    }

   // public static double area(Square s){
   //     return s.l * s.l;
   // }

   // public static double area(Regtangle r){
   //     return r.a* r.b;
    //}
}








