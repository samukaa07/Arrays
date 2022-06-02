package com.exemplo.multidimensional;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		// criar o array
		double notas[][][] = new double[100][4][3];
		//4 é a qtade de matérias
		// 3 a qtade de notas
		// populando os arrays
		notas[0][0][0] = 6.5; // primeira nota do primeiro aluno
		notas[0][1][0] = 8.5; // segunda nota do primeiro aluno
		notas[0][2][0] = 7.5; // terceira nota do primeiro aluno
		
		notas[1][0][0] = 6.5; // primeira nota do segundo aluno
		notas[1][1][0] = 9.2; // segunda nota do segundo aluno
		notas[1][2][0] = 8.7; // terceira nota do segundo aluno
		
		notas[99][0][0] = 5.3; // primeira nota do terceiro aluno
		notas[99][1][0]= 9.7; // segunda nota do ultimo aluno
		notas[99][2][0]= 8.1; // terceira nota do ultimo aluno
 
		System.out.println(notas[0][0][0]);
		System.out.println(notas[0][1][0]);
		System.out.println(notas[0][2][0]);
		System.out.println("---------");
		System.out.println(notas[1][0][0]);
		System.out.println(notas[1][1][0]);
		System.out.println(notas[1][2][0]);
		System.out.println("---------");
		System.out.println(notas[99][0][0]);
		System.out.println(notas[99][1][0]);
		System.out.println(notas[99][2][0]);
	
	}
}


