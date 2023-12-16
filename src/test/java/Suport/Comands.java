package Suport;

import Runner.RunCucumberTest;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Comands extends RunCucumberTest {

    public static void clickElement(By element){
        System.out.println("######################################");
        Utils.waitToElementBeClicable(element,10);
        getDriver().findElement(element).click();
        System.out.println("Clicou no elemento "+ element);
        System.out.println("######################################");
    }

    public static void fillField(By element,String value){
        System.out.println("######################################");
        Utils.waitToElementBeVisible(element, 10);
        getDriver().findElement(element).sendKeys(value);
        System.out.println("Preencheu o campo "+ element);
        System.out.println("######################################");
    }

    public static void checkText(By element, String expectedMensage){
        System.out.println("######################################");
        Utils.waitToElementBeVisible(element,10);
        Assert.assertEquals("Erro ao validar a mensagem.",expectedMensage,getDriver().findElement(element).getText());
        System.out.println("Validou a mensagem "+ expectedMensage);
        System.out.println("######################################");
    }
    public static void simpleAssert(String expectedValue, String currentValue){
        Assert.assertEquals(expectedValue,currentValue);
    }

    public static void validateCurrentUrl(String expectedUrl){
        simpleAssert(expectedUrl,getDriver().getCurrentUrl());
    }

    public static String getTextElement(By element){
        return getDriver().findElement(element).getText();
    }
}
