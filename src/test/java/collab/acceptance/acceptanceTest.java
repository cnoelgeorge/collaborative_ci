package collab.acceptance;



import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
public class acceptanceTest extends baseTest {




    @Test
   public void landingPage(){
        browser.navigate().to(urlApp);
        int linkCount= browser.findElements(By.linkText("here")).size();
        Assert.assertTrue("Link count= "+ linkCount,linkCount == 1);

    }

    @Test
    public void homePage(){
        browser.navigate().to(urlApp+"/home");
        Assert.assertEquals("Welcome text validation-", "This demo is for - Chennai", browser.findElement(By.className("comment1")).getText());

    }


    @Test
    public void homePageParam(){
        browser.navigate().to(urlApp+"/home?location=Hyderabad");
        Assert.assertEquals("Welcome text validation-", "This demo is for - Hyderabad", browser.findElement(By.className("comment1")).getText());

    }


}
