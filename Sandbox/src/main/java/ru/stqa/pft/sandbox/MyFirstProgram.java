package ru.stqa.pft.sandbox;

public class MyFirstProgram {

    public static void main(String[] args) {
        hello("Marina");

        double l = 5;
        System.out.println("Площадь клвадрата c стороной " + l + " равна " + area(l) + " !");


        double s = 6;
        double d = 4;
        System.out.println("Площадь прямоугольника со сторонами "+s+" и "+d+" равна "+area(s,d));
    }


        public static void hello(String a){

            System.out.println("Hello, "+ a+" ! " );


        }
    public static double area(double len) {

        return len * len;
    }


    public static double area(double a,double b){
        return a*b;
        }
    }
    
