package home.page;


import base.CommonAPI;

import org.apache.bcel.generic.Select;
import org.apache.bcel.generic.Visitor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.naming.Name;
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Registration {

    @FindBy(name = "firstname") WebElement Firstname;

    @FindBy(name = "lastname") WebElement Lastname;

    @FindBy(name = "reg_email__") WebElement Email;

    @FindBy(name = "reg_passwd__") WebElement Password;


    public void Registering() {
        Firstname.sendKeys("Maya");
        Lastname.sendKeys("Begum");
        Email.sendKeys("abcd123@gmail.com");
        Password.sendKeys("abcd123");

    }
}



















