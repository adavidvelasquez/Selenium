package com.accenture.SeleniumCap;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pasos {
	public static WebDriver driver;
	
	public void abrirNavegador() {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.out.println("WebDriver inicializado");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.vivaair.com/co");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		}
	
	public void marcarIda() {
		WebElement search;
		search =driver.findElement(By.xpath("//*[@id=\"rbOneWayWrapper\"]/span"));
		search.click();	
	}
	
	public void asignarOrigen() {
		WebElement search;
		search =driver.findElement(By.xpath("//*[@id=\"s2id_departureCityDrop\"]/a/span[2]/b"));
		search.click();
		
		WebElement search2;
		search2=driver.findElement(By.xpath("//*[@id=\"s2id_autogen20_search\"]"));
		search2.sendKeys("medellin\n");	
	}
	public void asignarDestino() {
		WebElement search;
		search =driver.findElement(By.xpath("//*[@id=\"s2id_arrivalCityDrop\"]/a/span[2]/b"));
		search.click();
		
		WebElement search2;
		search2=driver.findElement(By.xpath("//*[@id=\"s2id_autogen21_search\"]"));
		search2.sendKeys("bogota\n");	
	}
	
	public void asignarFecha(String fecha) {
		WebElement search;
		search =driver.findElement(By.xpath("//*[@id=\"DepartureDateForDisplay\"]"));
		search.clear();
		
		search.sendKeys(fecha);
		System.out.println("hola mundo");
		
	}
	
	public void aceptarT() {
		WebElement search2;
		search2=driver.findElement(By.xpath("//*[@id=\"box-flight\"]/div"));
		search2.click();
		
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
		System.out.println("hola mundo");
	}
	
	
	public void elejirVuelo() {
		    System.out.println("hola mundo");
		    WebElement first;
			first = driver.findElement(By.xpath("//*[@id=\"divAvailabilityOut\"]/div[1]/div[1]/div[2]/label[1]/div/div[1]/div[3]/div")); 
			first.click(); 

	}
	
	public void esperar() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void aceptarTerminos() {
		WebElement search;
		search =driver.findElement(By.xpath("//*[@id=\"fancyConfirm\"]/div[4]/a/span"));
		search.click();	
	}
	
	public void llenarCampos() {
		System.out.println("hola mundo");
		WebElement search;
		search =driver.findElement(By.xpath("//*[@id=\"Adults[0].FirstName\"]"));
		search.sendKeys("Sara Luisa");
		
		WebElement search1;
		search1 =driver.findElement(By.xpath("//*[@id=\"Adults[0].LastName\"]"));
		search1.sendKeys("Cassab Orrego");
		
		WebElement search2;
		search2 =driver.findElement(By.xpath("//*[@id=\"s2id_Adults[0].gender\"]/a/span[2]/b"));
		search2.click();
		
		WebElement search5;
		search5 =driver.findElement(By.xpath("//*[@id=\"s2id_autogen28_search\"]"));
		search5.sendKeys("Femenino\n");
		
		WebElement search3;
		search3=driver.findElement(By.xpath("//*[@id=\"Adults[0].IdentificationNumber\"]"));
		search3.sendKeys("1037648516");
		
		WebElement search4;
		search4=driver.findElement(By.xpath("//*[@id=\"Passengers[0].email\"]"));
		search4.sendKeys("saracassab7@hotmail.com");
		
		WebElement search6;
		search6=driver.findElement(By.xpath("//*[@id=\"Passengers[0].repeatemail\"]"));
		search6.sendKeys("saracassab7@hotmail.com");
		
		WebElement search7;
		search7=driver.findElement(By.xpath("//*[@id=\"Passengers0_mobile\"]"));
		search7.sendKeys("3113576790");
	}
	
	public void confirmar() {
		WebElement search;
		search=driver.findElement(By.xpath("//*[@id=\"btnContinuePassengerDetails\"]"));
		search.click();
	}
	
	public String obtenerFecha() {
		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
		DateFormat dateFormatd = new SimpleDateFormat("dd");
		
		int a=Integer.parseInt(dateFormatd.format(date));
		System.out.println((a+1)+"/"+dateFormat.format(date));
		String fecha=(a+1)+"/"+dateFormat.format(date);
		
		return fecha;
		
	}
	

}
