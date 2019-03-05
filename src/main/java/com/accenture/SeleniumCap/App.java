package com.accenture.SeleniumCap;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
	

	public static void main(String[] args) {
		

		Date date = new Date();
		DateFormat dateFormat = new SimpleDateFormat("MM/yyyy");
		DateFormat dateFormatd = new SimpleDateFormat("dd");
		
		int a=Integer.parseInt(dateFormatd.format(date));
		System.out.println((a+1)+"/"+dateFormat.format(date));
		String fecha=(a+1)+"/"+dateFormat.format(date);
		
		Pasos pasos= new Pasos();
		pasos.abrirNavegador();
		pasos.marcarIda();
		pasos.asignarOrigen();
		pasos.asignarDestino();
		pasos.asignarFecha(fecha);
		pasos.aceptarT();
		pasos.esperar();
		pasos.elejirVuelo();
		pasos.esperar();
		pasos.aceptarTerminos();
//		pasos.llenarCampos();
		
		
		
		
		

	}

}
