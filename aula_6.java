package aula_06;

import java.util.Locale;
import java.util.Scanner;

public class problema {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double aX, bX, cX;
		double aY, bY, cY;
	
		System.out.println("Digite o tamanho dos lados do triangulo X:");
		aX = sc.nextDouble();
		bX = sc.nextDouble();
		cX = sc.nextDouble();
		
		System.out.println("Digite o tamanho dos lados do triangulo Y:");
		aY = sc.nextDouble();
		bY = sc.nextDouble();
		cY = sc.nextDouble();
		
		double pX = (aX + bX +cX) / 2;
		double areaX = Math.sqrt(pX *(pX-aX)*(pX-bX)*(pX-cX));
		double pY = (aY + bY +cY) / 2;
		double areaY = Math.sqrt(pY *(pY-aY)*(pY-bY)*(pY-cY));
		
		if (areaX>areaY) {
			System.out.println("A maior aréa é de X");
		} else {
			System.out.println("A maior aréa é de Y");
		}
	
		sc.close();
		
	}	

}
