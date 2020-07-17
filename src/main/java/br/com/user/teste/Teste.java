package br.com.user.teste;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import br.com.user.models.Cliente;

public class Teste {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("joao", true, "123", 1);
		Cliente c2 = new Cliente("maria", true, "123", 1);
		c1.autenticaSenha("1234");

		List<Cliente> clientes = Arrays.asList(c1, c2);

//		for(Cliente cli : clientes) {
//			System.out.println(cli.getNome());
//			System.out.println(cli.getSenha());
//		}

//		MostraCliente mc = new MostraCliente();

//		Consumer<Cliente> consumidor = new Consumer<Cliente>() {
//
//			@Override
//			public void accept(Cliente t) {
//				System.out.println(t.getNome());
//			}
//		};
		
		// como é uma interface funcional, ou seja, só tem um método, o compilador já sabe que deve inferir 
		// essa função ao método accept
//		Consumer<Cliente> consumidor = (Cliente c) -> {System.out.println(c.getNome());};

//		clientes.forEach(consumidor);
		
		// ou pode fazer desse jeito, ainda mais simplificado e direto
//		clientes.forEach(c -> System.out.println(c.getNome()));
		
		//apenas dá pra utilizar uma expressão lambda quando é implementado uma interface funcional
		
		//-------------------------------------
		
		// Runnable é uma interface funcional, possui apenas o método run sem parâmetros
		Runnable r = () -> System.out.println("Olá mundo");
		new Thread(r).start();
		
		//------------------------------------------------
		
		// Referência ao metodo: apenas em interfaces funcionais
		clientes.forEach(Cliente::getNome);
		
		Cliente c3 = new Cliente("Ana", false, "333", 1);
		
		Consumer<Cliente> consumidor1 = Cliente::getNome;
		consumidor1.accept(c3);
		
		Runnable r1 = c3::getNome;
		r1.run();
	}

}
