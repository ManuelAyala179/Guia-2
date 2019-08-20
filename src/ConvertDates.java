/* Guia N°2
 * Ejercicio Proyecto Libre
 * Programa recibe una fecha en formato Gregoriano YYYYMMDD y la convierte a formato Juliano YYYYDDD
 * Integrantes:
 * Andres Sneider Jimenez Garcia
 * Harold Felipe Zuluaga Grisales
 * Manuel leonardo Ayala Ayala 
*/
import java.util.Scanner;
public class ConvertDates
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Digite el dia");
		int day = sc.nextInt();
		while(day > 31){
		 System.out.println("Digite correctamente el dia");
		 day = sc.nextInt();
		}
		System.out.println("Digite el mes");
		int month = sc.nextInt();
		while(month > 12){
		System.out.println("Digite correctamente el mes");
		 month = sc.nextInt();
		}
		if((month == 2 || month == 4 || month == 6 || month == 9 || month == 11) && day > 30)
		   {
			System.out.println("Este mes no tiene mas de 30 dias, digite otro mes");
			month = sc.nextInt();
		   }//else month = sc.nextInt();
		
		System.out.println("Digite el año");
		int year = sc.nextInt();
		
		System.out.print("la fecha digitada en formato gregoriano es: " + year + "-"+ month + "-" + day);
		sc.close();
		
		int resultJulian = 0;
		int[] diasMes = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		//Verifica si es año biciesto
		
		if(year % 4 == 0)
		    {
		      diasMes[1] = 29;
		    }  
		//Arma la fecha juliana
		
		String fechaJul = "0";
		fechaJul += year;
		
		int diasJul = 0;
		for (int i=0; i<month-1; i++)
		    {
		      diasJul += diasMes[i];
		    }  
		diasJul += day;
		
		    if(String.valueOf(diasJul).length() < 2)
		    {
	           fechaJul += "00"; 	    
		    }
		    if(String.valueOf(diasJul).length() < 3)
		    {	
		       fechaJul += "0"; 
		    }	
		    
		fechaJul += String.valueOf(diasJul);
		
	  resultJulian = Integer.valueOf(fechaJul);	
	  
	  System.out.print("\nLa fecha en formato Juliano es : " + resultJulian);   	
    }
}