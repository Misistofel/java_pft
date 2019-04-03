package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    app.getContactHelper().fillAddNewForm(new AddContactData("Margo", "Marina",
            "Tofel", "Kyiv", "380111111111", "380111", "margotofel@mail.ru",
            "1", "JANUARY", "1989", null),false);
    app.getContactHelper().updateContactModification();

  }
}