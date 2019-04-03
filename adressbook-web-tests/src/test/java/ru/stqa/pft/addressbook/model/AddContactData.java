package ru.stqa.pft.addressbook.model;

public class AddContactData {
  private final String firstname;
  private final String middlename;
  private final String lastname;
  private final String address;
  private final String homePhone;
  private final String mobilePhone;
  private final String email;
  private final String dayOfBirth;
  private final String monOfBirth;
  private final String yearOfBirth;
  private String group;

  public AddContactData(String firstname, String middlename, String lastname, String address, String homePhone,
                        String mobilePhone, String email, String dayOfBirth, String monOfBirth, String yearOfBirth, String group) {
    this.firstname = firstname;
    this.middlename = middlename;
    this.lastname = lastname;
    this.address = address;
    this.homePhone = homePhone;
    this.mobilePhone = mobilePhone;
    this.email = email;
    this.dayOfBirth = dayOfBirth;
    this.monOfBirth = monOfBirth;
    this.yearOfBirth = yearOfBirth;
    this.group = group;
  }

  public String getFirstname() {
    return firstname;
  }

  public String getMiddlename() {
    return middlename;
  }

  public String getLastname() {
    return lastname;
  }

  public String getAddress() {
    return address;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public String getEmail() {
    return email;
  }

  public String getDayOfBirth() {
    return dayOfBirth;
  }

  public String getMonOfBirth() {
    return monOfBirth;
  }

  public String getYearOfBirth() {
    return yearOfBirth;
  }

  public String getGroup() {
    return group;
  }
}
