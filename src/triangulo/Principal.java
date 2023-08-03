package triangulo;

import java.util.Scanner;

public class Principal {

	public Principal() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		double aX , bX , cX, aY, bY, cY ;
		
		Scanner sca = new Scanner (System.in);
		
		System.out.println("Digite os lados do triangulo X");
		aX = sca.nextDouble();
		bX= sca.nextDouble();
		cX = sca.nextDouble();
		
		
		
		
		System.out.println("Digite os lados do triangulo Y");
		aY = sca.nextDouble();
		bY= sca.nextDouble();
		cY=sca.nextDouble();
		
		double p = (aX + bX + cX)/2;
		
		double areaX = Math.sqrt(p * (p - aX) * (p - bX) * (p - cX));
		
		p = (aY + bY + cY)/2;
		double areaY = Math.sqrt(p * (p - aY) * (p - bY) * (p - cY));
		sca.close();
		
		System.out.printf("Triangle X area = %4f%n", areaX);
		System.out.printf("Triangle Y area = %4f%n", areaY);
		
		if(areaX > areaY) {
			System.out.println("Area do triangulo X é maior");
		}else {
			System.out.println("Area do triangulo Y é maior");
		}

	}

}
