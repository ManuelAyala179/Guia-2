/* Ejercicios b�sicos de programaci�n N�2
 * Ejercicio n�mero 2
 * Programa que calcula el area sombreada que est� entre un cuadrado inscrito en un circulo de radio r
 * Integrantes:
 * Andres Sneider Jimenez Garcia
 * Harold Felipe Zuluaga Grisales
 * Manuel leonardo Ayala Ayala 
*/

import java.util.Scanner;
public class Areas 
{
    public static void main(String[] args)
	{
	   Scanner sc = new Scanner(System.in);
	   double radio;
	   double ladoc;
	   double aCirculo;
	   double aCuadrado;
	   double aSombra;
	   System.out.println("Digite el valor del radio");
	   radio = sc.nextDouble();
	   sc.close();
	   
	   /* El area sombreada corresponde a la resta del area de la circunferencia menos el area del cuadrado
	    * area circunferencia = Pi * r^2
	    * area cuadrado = Lado * Lado = L^2
	    * Por teorema de pitagoras L^2 = r^2 + r^2 que simplificado es L^2 = 2 * r^2	 */   
	   	   	   
	   aCirculo = Math.PI * Math.pow(radio, 2);                    // Calcula el area del circulo dado el radio
	   System.out.printf("El area del circulo es: %.3f\n" ,aCirculo); 
	   ladoc = Math.sqrt(2 * Math.pow(radio, 2));                  // Calcula el lado del cuadrado
	   System.out.printf("El lado del cuadrado es: %.3f\n" ,ladoc);       
	   aCuadrado = 2 * Math.pow(radio, 2);                         // Calcula el area del cuadrado
	   System.out.println("El area del cuadrado es: " + aCuadrado);   
	   aSombra = aCirculo - aCuadrado;                             // Resta el area del circulo menos el area del cuadrado para hallar el area sombreada
	   System.out.printf("El valor del area sombreada es: %.3f\n" ,aSombra);
	}
		
}
