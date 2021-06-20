package com.cybertek.homework.Jun19_Upload_Actions;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverOverTC15 {

    @Test
    public void hoverTestTC15(){
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"))).perform();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//h5)[1]")).isDisplayed());
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[2]"))).perform();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//h5)[2]")).isDisplayed()); actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[1]"))).perform();
        actions.moveToElement(Driver.getDriver().findElement(By.xpath("(//img[@src='/img/avatar-blank.jpg'])[3]"))).perform();
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//h5)[3]")).isDisplayed());
    }
    @Test
    public void doubleClickTC16(){
        Driver.getDriver().get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick2");
        WebElement iframe = Driver.getDriver().findElement(By.xpath("//iframe[@id='iframeResult']"));
        Driver.getDriver().switchTo().frame(iframe);
        WebElement textColor = Driver.getDriver().findElement(By.id("demo"));
        Actions actions = new Actions(Driver.getDriver());
        actions.doubleClick(textColor).perform();
        WebElement color = Driver.getDriver().findElement(By.xpath("//p[@style='color: red;']"));
        String elementAttribute = color.getAttribute("style");
        Assert.assertTrue(elementAttribute.contains("red"));

    }

    @Test
    public void hoverTestTC17(){
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        WebElement smallCircle = Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle = Driver.getDriver().findElement(By.id("droptarget"));
        Actions actions = new Actions(Driver.getDriver());
        actions.dragAndDrop(smallCircle, bigCircle).perform();
        Assert.assertTrue(bigCircle.getText().equals("You did great!"));
    }

    @Test
    public void ContextClickTC18(){
        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");
        WebElement rightClickElement = Driver.getDriver().findElement(By.id("hot-spot"));
        Actions actions = new Actions(Driver.getDriver());
        actions.contextClick(rightClickElement).perform();
        Alert alert = Driver.getDriver().switchTo().alert();
        alert.accept();

    }


}
