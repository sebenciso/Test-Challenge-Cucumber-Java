package pruebas;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class Purchase {
    protected WebDriver firefoxDriver;

    @Before
    public void abrirDriver () {
        //Encontrar archivo exe geckodriver
        System.setProperty("webdriver.gecko.driver","src\\main\\resources\\geckodriver.exe");

        //creamos opciones sobre nuestro driver
        FirefoxOptions options = new FirefoxOptions ();
        options.setCapability("marionette", false);


        //Nueva instancia de FirefoxDriver
        firefoxDriver = new FirefoxDriver(options);

        // Definimos el tiempo de espera hasta que aceptamos un timeout
        firefoxDriver.manage().timeouts().implicitlyWait( 10, TimeUnit.SECONDS);

    }

    @Test
    public void  hacer_una_compra() {


        // Abrimos una URL
        firefoxDriver.get("http://automationpractice.com/index.php");

        //Boton de sign in

        WebElement BotonSignIn = firefoxDriver.findElemt(By.xpath("//a[@class='login']"));
        botonSigIn.click();

        //input de email
        WebElement inputEmail = firefoxDriver.findElement(By.cssSelector("#email"));
        inputEmail.sendKeys( ...charSequences: "sebastian.enciso@bitsamericas.com");

        //input de contraseña
        WebElement inputContraseña = firefoxDriver.findElement(By.cssSelector("#passwd"));
        inputContraseña.sendKeys (..charSequences: "123456789");

        //Boton Sig In Candado
         WebElement botonSigInCandado = firefoxDriver.findElement (By.cssSelector("#SubmitLogin"));
         botonSigInCandado.click();

        //Pestana T-Shirt
        WebElement pestañaTshirts = firefoxDriver.findElement (By.xpath("//body[@id='authentication']/div[@id='page']/div[@class='header-container']/header[@id='header']/div/div[@class='container']/div[@class='row']/div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a[1]"));
             pestañaTshits.click();

        // Crear acción

        Actions accion = new Actions(firefoxDriver);
        WebElement imagenDeCompra = firefoxDriver.findElement (By.xpath ("//div[@class='clearfix']//span//img") );

        // ajax_add_to_cart_button btn btn-default

        accion.moveToElement (pestañaTshirt).moveToElement (firefoxDriver.findElement
                (By.xpath ("//span[contains(text(),'Add to cart')]"))).click.build().perform();

        WebElement botonDeCompra1 = firefoxDriver.findElement
                (By.xpath("//span[contains(text(),'Procceed to checkout '))]"));
        botonDeCompra1.click();

        WebElemnt botonDeCompra2 = firefoxDriver.findElement
                (By.xpath("//p//*[contains(text(),'Procceed to checkout '))]"));
        botonDeCompra2.click();

        WebElement botonDeCompra3 = firefoxDriver.findElement
                (By.xpath("//button//span[contains(text(),'Procceed to checkout '))]"));
        botonDeCompra3.click();

        WebElement checkbox = firefoxDriver.findElement (By.cssSelector("#cgv"));
        checkbox.click();

        WebElement botonDeCompra4 = firefoxDriver.findElement
                (By.xpath("//button//@name = 'ProccesCarrier']"));
        botonDeCompra4.click();

        WebElement botonCheque = firefoxDriver.findElement
                (By.cssSelector(".cheque"));
        botonCheque.click();

        WebElement botonConfirmarCompra = firefoxDriver.findElement
                (By.xpath("//p//button[@type = 'summit']"));
        botonConfirmarCompra.click();

        WebElement bannerOrdenCompleta = firefoxDriver.findElement
                (By.className(" alert"));

        Assert.assertTrue(bannerOrdenCompleta.isDisplayed());

        //bannerOrdenCompleta.click();

        Thread.sleep(4000);

    }


    @After

    public void cerrarDriver() {
        //Cerrar ventana, apagar driver
        firefoxDriver.quit();

    }

