package ru.stqa.pft.addressbook.app.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.stqa.pft.addressbook.model.AddContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(FirefoxDriver wd) {
    super(wd);
  }

  public void submitAddNewCreation() {
    click(By.xpath("(//input[@name='submit'])[2]"));
  }

  public void fillAddNewForm(AddContactData addContactData) {
    fullfillFirstNameOfContact(By.name("firstname"), addContactData.getFirstname());
    fullFillMiddlenameOfContact(addContactData);
    fullFillLastnameOfContact(addContactData);
    fullFillAddressOfContact(addContactData);
    fullFillHomePhoneOfContact(addContactData);
    fullFillMobileOfContact(addContactData);
    fullFillEmailOfContact(addContactData);
    fullFillBdayOdContact(addContactData);
    fullFillBmonthOfContact(addContactData);
    fullFillbmonthOfContact(addContactData);
  }

  public void fullFillbmonthOfContact(AddContactData addContactData) {
    fullfillFirstNameOfContact(By.name("byear"), addContactData.getYearOfBirth());
  }

  public void fullFillBmonthOfContact(AddContactData addContactData) {
    click("bmonth");
    select("bmonth", addContactData.getMonOfBirth());
    click("bmonth");
  }

  public void fullFillBdayOdContact(AddContactData addContactData) {
    click("bday");
    select("bday", addContactData.getDayOfBirth());
    click("bday");
  }

  public void fullFillEmailOfContact(AddContactData addContactData) {
    fullfillFirstNameOfContact(By.name("email"), addContactData.getEmail());
  }

  public void fullFillMobileOfContact(AddContactData addContactData) {
    fullfillFirstNameOfContact(By.name("mobile"), addContactData.getMobilePhone());
  }

  public void fullFillHomePhoneOfContact(AddContactData addContactData) {
    wd.findElement(By.xpath("//div[@id='content']/form/label[9]")).click();
    click("home");
    fullfillFirstNameOfContact(By.name("home"), addContactData.getHomePhone());
  }

  public void fullFillAddressOfContact(AddContactData addContactData) {
    fullfillFirstNameOfContact(By.name("address"), addContactData.getAddress());
  }

  public void fullFillLastnameOfContact(AddContactData addContactData) {
    fullfillFirstNameOfContact(By.name("lastname"), addContactData.getLastname());
  }

  public void fullFillMiddlenameOfContact(AddContactData addContactData) {
    fullfillFirstNameOfContact(By.name("middlename"), addContactData.getMiddlename());
  }

  public void fullfillFirstNameOfContact(By locator, String text) {
    wd.findElement(locator).click();
    wd.findElement(locator).clear();
    wd.findElement(locator).sendKeys(text);
  }

  public void selectContact() {
    click(By.name("selected[]"));
  }

  public void deleteSelectedContact() {
    click(By.xpath("//input[@value='DELETE']"));
  }

  public void initContactModification() {
    click(By.xpath("//img[@alt='EDIT']"));
  }

  public void updateContactModification() {
    click(By.name("update"));
  }
}
