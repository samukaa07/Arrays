package com.exemplo.arrayobjeto;

public class ChamandoUsuario {

	public static void main(String[] args) {
		// instanciando a classe Usuario()
		
		Usuario usuarioInfo = new Usuario("Marcelo");
		
		//definição de array
		Usuario novosUsuarios[] = {usuarioInfo, new Usuario("Samuel"), new Usuario("Felipe")};
		
		for(Usuario user : novosUsuarios) {
			System.out.println(user.getNome());
		}
	
	}

}
