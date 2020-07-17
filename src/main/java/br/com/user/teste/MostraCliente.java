package br.com.user.teste;

import java.util.function.Consumer;

import br.com.user.models.Cliente;

public class MostraCliente implements Consumer<Cliente>{

	@Override
	public void accept(Cliente t) {
		System.out.println(t.getNome());
		System.out.println(t.getSenha());
	}
}
