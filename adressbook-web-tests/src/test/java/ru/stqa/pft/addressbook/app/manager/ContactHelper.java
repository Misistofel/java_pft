package ru.stqa.pft.addressbook.app.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import ru.stqa.pft.addressbook.model.AddContactData;

public class ContactHelper extends HelperBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void submitAddNewCreation() {
    click(By.xpath("(//input[@name='submit'])[2]"));
  }

  public void fillAddNewForm(AddContactData addContactData, boolean creation) {
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

    if (creation) {
      new Select(wd.findElement(By.name("new group"))).selectByVisibleText(addContactData.getGroup());
    } else {
      Assert.assertFalse((isElementPresent(By.name("new group"))));
    }
  }

  @Override
  public boolean isAlertPresent() {
    return super.isAlertPresent();
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
    wd.switchTo().alert().accept();
    wd.findElement(By.cssSelector("div.msgbox"));
  }



  public void initContactModification() {
    click(By.xpath("//img[@alt='EDIT']"));
  }

  public void updateContactModification() {
    click(By.name("update"));
  }


  public void createContact(AddContactData contact, boolean creation) {
    fillAddNewForm(contact, creation);
    submitAddNewCreation();
    //fillAddNewForm(new AddContactData("Margo", "Marina", "Tofel",
    //     "Kyiv", "380111111111", "380111111112", "mtofel@mail.ru",
    //    "1", "JANUARY", "1990","Ma"),true);
    //submitAddNewCreation();
    ///app.logout();


  }

  public boolean isThereAContact() {
    return isElementPresent(By.name("selected[]"));
  }
}
