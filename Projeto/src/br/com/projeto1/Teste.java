package br.com.projeto1;

import java.util.ArrayList;
import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		ArrayList<Integer>primos = new ArrayList<>();
		int num=0;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		for(int i =1;i<num;i++) {
			int divisores =0;
			int soma=0;
			
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					divisores++;
				}
				
			}
			if(divisores==2) {
				primos.add(i);
				
				//System.out.print(i+",");
				System.out.println("A soma é: "+primos);
				
			}
			//System.out.println("A soma é: "+primos);
			
		}
		
	}

}
