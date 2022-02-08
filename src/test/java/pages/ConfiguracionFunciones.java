package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfiguracionFunciones {

    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 5);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\57316\\Documents\\SafeDelivery\\testpruebassafedelivery");
    }

    public ConfiguracionFunciones(WebDriver driver) {
        ConfiguracionFunciones.driver = driver;
        wait = new WebDriverWait(driver, 5);
    }

    //Ingresar a la aplicacion
    public static void navegarPorLaAplicacion (String url){
        driver.get(url);
    }

    //web elementos por el xpath
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    //Click
    public  void clickElement(String locator){
        Find(locator).click();
    }

    //Escribe en los input
    public void escribir(String locator, String letras){
        Find(locator).clear();
        Find(locator).sendKeys(letras);
    }

    //Selecionar una opcio de una lista despeglable
    public void selectOption(String locator, String option){
        Select select = new Select(Find(locator));
        select.selectByValue(option);
    }




}
