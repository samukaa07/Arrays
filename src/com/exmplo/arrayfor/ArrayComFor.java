package com.exmplo.arrayfor;

public class ArrayComFor {

	public static void main(String[] args) {
		// declarando a variavel que ser� o array
		
		int arrayNumeros[];
		
		arrayNumeros = new int[10];
		
		// implementando o loop
		for(int i = 0; i < arrayNumeros.length; i++) {
			arrayNumeros[i] = i;
			System.out.println(arrayNumeros[i] + " ");
		}
	}
}
