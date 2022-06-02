package com.exemplo.bidimensional;

public class ArrayBidimensional {

	public static void main(String[] args) {
		// criar o array
		double notas[][] = new double[100][3];
		
		// populando os arrays
		notas[0][0] = 6.5; // primeira nota do primeiro aluno
		notas[0][1] = 7.5; // segunda nota do primeiro aluno
		notas[0][2] = 7.0; // terceira nota do primeiro aluno
		
		notas[1][0] = 5.4; // primeira nota do segundo aluno
		notas[1][1] = 9.0; // segunda nota do segundo aluno
		notas[1][2] = 4.1; // terceira nota do segundo aluno
		
		notas[99][0] = 7.2; // primeira nota do terceiro aluno
		notas[99][1] = 8.6; // segunda nota do ultimo aluno
		notas[99][2] = 6.5; // terceira nota do ultimo aluno
 
		System.out.println(notas[0][0]);
		System.out.println(notas[0][1]);
		System.out.println(notas[0][2]);
		System.out.println("---------");
		System.out.println(notas[1][0]);
		System.out.println(notas[1][1]);
		System.out.println(notas[1][2]);
		System.out.println("---------");
		System.out.println(notas[99][0]);
		System.out.println(notas[99][1]);
		System.out.println(notas[99][2]);
	}

}
