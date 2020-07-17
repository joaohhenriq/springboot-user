package br.com.user.teste;

import java.util.Arrays;
import java.util.List;

import br.com.user.models.Cliente;

public class Teste {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("joao", true, "123");
		Cliente c2 = new Cliente("maria", true, "123");
		
		List<Cliente> clientes = Arrays.asList(c1, c2);
		
//		for(Cliente cli : clientes) {
//			System.out.println(cli.getNome());
//			System.out.println(cli.getSenha());
//		}
		
		MostraCliente mc = new MostraCliente();
		clientes.forEach(mc);
	}

}
