package com.cybertek.tests.pages;

import com.cybertek.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PageObjectModelPractices {
    @Test
    public void negative_login_to_library_test(){
        Driver.getDriver().get("https://library2.cybertekschool.com/login.html");
        LibraryLoginPage loginPage = new LibraryLoginPage();

        loginPage.inputEmail.sendKeys("wrong@gmail.com");

        loginPage.inputPassword.sendKeys("wrong password");

        loginPage.signInButton.click();

        Assert.assertTrue(loginPage.incorrectEmailPasswordError.isDisplayed());


    }
}
