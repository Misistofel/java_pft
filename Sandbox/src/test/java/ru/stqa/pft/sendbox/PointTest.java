package ru.stqa.pft.sendbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

public class PointTest {


  @Test
  public void testDistance(){
    Point p1=new Point(2,2);
    Point p2=new Point(4,4);;
    Assert.assertEquals(p1.distance(p2),2.8284271247461903);

  }


}
