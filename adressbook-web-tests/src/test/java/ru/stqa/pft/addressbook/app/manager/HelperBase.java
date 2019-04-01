package ru.stqa.pft.addressbook.app.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;

public class HelperBase {
  protected WebDriver wd;


  public HelperBase(WebDriver wd) {
    this.wd=wd;
  }

  protected void click(By locator) {
    wd.findElement(locator).click();
  }

  protected void type(By locator, String text) {
    click(locator);
    if (text!=null){
      wd.findElement(locator).clear();
      wd.findElement(locator).sendKeys(text);
    }

  }
  public boolean isAlertPresent() {
    try {
      wd.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  protected void select(String bday, String dayOfBirth) {
    new Select(wd.findElement(By.name(bday))).selectByVisibleText(dayOfBirth);
  }

  protected void click(String bday) {
    wd.findElement(By.name(bday)).click();
  }
}
