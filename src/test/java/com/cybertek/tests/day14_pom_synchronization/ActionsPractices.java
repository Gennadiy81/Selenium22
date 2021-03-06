package com.cybertek.tests.day14_pom_synchronization;

import com.cybertek.tests.pages.TelerikPage;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionsPractices {
    @Test
    public void drag_and_drop_test(){
        //1. Go to https://demos.telerik.com/kendo-ui/dragdrop/index
        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index");

        //2. Drag and drop the small circle to bigger circle.
        //3. Assert:
        //-Text in big circle changed to: “You did great!”

        TelerikPage telerikPage= new TelerikPage();
        Actions actions = new Actions(Driver.getDriver());

        BrowserUtils.sleep(2);
        telerikPage.acceptCookiesButton.click();

        actions.dragAndDrop(telerikPage.smallCircle, telerikPage.bigCircle).perform();
        Assert.assertTrue(telerikPage.bigCircle.getText().equals("You did great!"));
    }
}
