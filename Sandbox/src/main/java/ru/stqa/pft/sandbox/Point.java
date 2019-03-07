package ru.stqa.pft.sandbox;

public class Point {

  public double x;
  public double y;

  //После перенесения ф-ции сюда, завожу еще два параметра, описывающих координаты второй точки.
  public double a=2;
  public double b=2;


  //2) Create constructor
  public Point(double x,double y){
    this.x = x;
    this.y = y;

  }
  //Перенесеная из main ф-я становится методом (убирает static и параметры Point p1,Point p2) и
  public double distance(){
    return (Math.sqrt((this.x-a)*(this.x-a)+(this.y-b)*(this.y-b)));

  }

}