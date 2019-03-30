package ru.stqa.pft.addressbook.app.manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;

public class NavigationHelper extends HelperBase {

  public NavigationHelper(WebDriver wd) {
    super(wd);
  }

  public void gotoGroupPage() {
    click(By.linkText("GROUPS"));
  }
    public void gotoHomePage() {
      click(By.linkText("HOME"));
    }

}
