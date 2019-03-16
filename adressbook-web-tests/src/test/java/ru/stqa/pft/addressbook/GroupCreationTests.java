package ru.stqa.pft.addressbook;
import org.testng.annotations.*;


public class GroupCreationTests extends TestBase
{


  @Test
  public void testGroupCreationTests() throws Exception {

    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new ru.stqa.pft.addressbook.GroupData("test12", "test13", "test11"));
    submitGroupCreation();
    returnToGroupPage();

  }


}
