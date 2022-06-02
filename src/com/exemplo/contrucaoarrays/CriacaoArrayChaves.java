package com.exemplo.contrucaoarrays;

public class CriacaoArrayChaves {

	public static void main(String[] args) {
		// definição do array
		int numero = 5;
		
		// criando o array
		int codigos[] = {0, 1, 2, 3, 4, numero, 8, 13, 21};
		
		// estabelecendo o loop
		for(int i = 0; i < codigos.length; i++) {
			
		//exibindo os valores
			System.out.println(codigos[i] + " ");		
			
		}
	}
}
