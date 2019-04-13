package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.AddContactData;

public class ContactModificationTests extends TestBase {

  @Test
  public void testContactModification() {
    app.getNavigationHelper().gotoHomePage();
    app.getContactHelper().selectContact();
    app.getContactHelper().initContactModification();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new AddContactData("Margo", "Marina", "Tofel",
              "Kyiv", "380111111111", "380111111112", "mtofel@mail.ru",
              "1", "JANUARY", "1990", "Ma"), true);
    }
    app.getContactHelper().updateContactModification();

  }
}