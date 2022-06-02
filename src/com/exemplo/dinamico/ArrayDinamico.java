package com.exemplo.dinamico;

public class ArrayDinamico {
	
	// criar o método para receber como argumento do parametro um array
	static void receberArray(int umArray[]) {
		 	for(int exibir : umArray) {
			System.out.println(exibir); // exibindo o array
		}
				
	}
	

	public static void main(String[] args) {
		// instancia da classe
		ArrayDinamico a = new ArrayDinamico();
		a.receberArray(new int[] {8, 9, 2, 3});
		
	}

}
