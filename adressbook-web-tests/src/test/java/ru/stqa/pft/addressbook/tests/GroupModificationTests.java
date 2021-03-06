package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.GroupData;

public class GroupModificationTests extends TestBase {


 @Test
  public void testGroupModification (){
   app.getNavigationHelper().gotoGroupPage();
  if (!app.getGroupHelper().isThereAGroup()) {
   app.getGroupHelper().createGroup(new GroupData(null, null, "Ma"));
  }
   app.getGroupHelper().selectGroup();
   app.getGroupHelper().initGroupModification();
   app.getGroupHelper().fillGroupForm(new GroupData("Maria", "Marina", "Ma"));
   app.getGroupHelper().submitGroupModification();
   app.getGroupHelper().returnToGroupPage();
  }

}
