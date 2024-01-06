package org.cricbuzz;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
public class scorecard {
    public static void main(String[] args)  {


        System.setProperty("webdriver.gecko.driver", "C:/Users/pratham1/Downloads/geckodriver-v0.32.0-win64/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.cricbuzz.com/live-cricket-scores/70319/pak-vs-aus-3rd-test-pakistan-tour-of-australia-2023-24");


        WebElement scoreCard = driver.findElement(By.xpath("//table/tbody"));
//        System.out.println(score_table.size());
        List<WebElement> score = scoreCard.findElements(By.tagName("tr"));
        boolean flag = true;
        for(WebElement rows:score)
        {
            flag = !flag;
            if(flag)
            {
                continue;
            }
            WebElement name = rows.findElement(By.xpath("(//td[1]/div/a)"));
            System.out.println(name.getText());
//			System.out.println(name);
        }





        driver.close();
    }
}
