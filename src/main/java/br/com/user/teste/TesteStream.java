package br.com.user.teste;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.user.models.Cliente;

public class TesteStream {

	public static void main(String[] args) {

		Cliente c1 = new Cliente("joao", true, "123", 5);
		Cliente c2 = new Cliente("maria", true, "123", 10);
		Cliente c3 = new Cliente("jose", true, "123", 20);
		
		List<Cliente> clientes = Arrays.asList(c1, c2, c3);
//		clientes.forEach(c -> System.out.println(c.getPontos()));
		
		Stream<Cliente> stream = clientes.stream().filter(c -> c.getPontos() > 5);
//		IntStream stream1 = clientes.stream().mapToInt(c -> c.getPontos());
		
		List<Cliente> pontosMaiorQueCinco = stream.collect(Collectors.toList());
//		pontosMaiorQueCinco.forEach(c -> System.out.println(c.getPontos()));
		
		List<Cliente> pontosMaiorQue10 = clientes.stream().filter(c -> c.getPontos() > 10).collect(Collectors.toList());
		pontosMaiorQue10.forEach(c -> System.out.println(c.getPontos()));
	
	}

}
