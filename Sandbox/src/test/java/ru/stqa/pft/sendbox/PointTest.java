package ru.stqa.pft.sendbox;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.stqa.pft.sandbox.Point;

public class PointTest {


  @Test
  public void testDistance(){
    Point p=new Point(3,3);
    Assert.assertEquals(p.distance(),1.4142135623730951);

  }
}
