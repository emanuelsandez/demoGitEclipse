package Resistencia;

import java.util.Scanner;

public class CalculoResistenciaTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float r1;
		float r2;
		float r3;
		float rt;
		Scanner teclado= new Scanner(System.in);
		
		do 	{
			System.out.println("Ingresar Resistencia 1");
			r1 = teclado.nextFloat();	
		if (r1 <=0) {	
			System.out.println("Ingresar nuevamente Resistencia 1");
		}
		}
		while (r1<=0);
		
		do 	{
			System.out.println("Ingresar Resistencia 2");
			r2 = teclado.nextFloat();
		if (r2 <=0) {	
				System.out.println("Ingresar nuevamente Resistencia 2");
				System.out.println("Ingresar Resistencia 65");
		}
		}
		while (r2 <=0);
		
		do 	{
		System.out.println("Ingresar Resistencia 3");
		r3 = teclado.nextFloat();
		if (r3 <=0) {	
			System.out.println("Ingresar nuevamente Resistencia 3");
		}
		}
		while (r3 <=0);	
		
				
		rt = (r1*r2*r3)/(r1*r2+r1*r3+r1*r2);
		
		System.out.printf( "El cálculo de la resistencia total es: %f" ,rt);
		
		teclado.close();
	}

}
