import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.Keys.ENTER;


public class PruebaTest {
    private WebDriver firefoxDriver;
    @Before
    public void abrirDriver () {
        //Encontrar archivo exe geckodriver
        System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");


        //creamos opciones sobre nuestro driver
        FirefoxOptions options  = new FirefoxOptions ();
        options.setCapability("marionette", false);

        //Nueva instancia de FirefoxDriver
        firefoxDriver = new FirefoxDriver(options);

        // Definimos el tiempo de espera hasta que aceptamos un timeout
        firefoxDriver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);

    }

    @Test
    public void  hacer_una_busqueda() {


        // Abrimos una URL
        firefoxDriver.get("hhttp://aws.amazon.com/en/");

        //Encontrar e interactuar con elementos

        firefoxDriver.findElement(By.xpath("//input[@name='q']")).sendKeys("pruebaz");

        firefoxDriver.findElement(By.xpath("//input[@title = 'Buscar']")).sendKeys(ENTER);


        //Hacer click sobre la palabra deseada
        firefoxDriver.findElement(By.xpath("//h3[contains(text(),'prueba')]")).click();

        //Creamos elementos web para poder hacer acciones más avanzadas.
        WebElement subtitulo = firefoxDriver.findElement(By.id("listado"));

//        //Obtener la lista de los resultados y validar que la cantidad de resultados sea mayor a 6.
        Assert.assertTrue(subtitulo.getText().contanis("10"));

            }

    @After

    public void cerrarDriver() {
        //Cerrar ventana, apagar driver
        firefoxDriver.quit();
    }
}
