package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;

import ru.stqa.pft.addressbook.model.AddContactData;

public class ContactCreationTest extends TestBase{


  @Test
  public void testContactCreation() throws Exception {

    app.goToAddNewPage();
    app.getContactHelper().fillAddNewForm(new AddContactData("Margo", "Marina", "Tofel",
            "Kyiv", "380111111111", "380111111112", "mtofel@mail.ru",
            "1", "JANUARY", "1990", "Ma"));
    app.getContactHelper().submitAddNewCreation();
    app.logout();
  }


}
