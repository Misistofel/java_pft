package ru.stqa.pft.addressbook.tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.AddContactData;

public class ContactDeletionTest extends TestBase {


  @Test
  public void testContactDeletion() throws Exception {
    app.getNavigationHelper().gotoHomePage();
    if (!app.getContactHelper().isThereAContact()) {
      app.getContactHelper().createContact(new AddContactData("Margo", "Marina", "Tofel",
              "Kyiv", "380111111111", "380111111112", "mtofel@mail.ru",
              "1", "JANUARY", "1990", "Ma"), true);
    }
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    //   if (app.getContactHelper().isAlertPresent()) {
   //} else (????);
   }
  }


