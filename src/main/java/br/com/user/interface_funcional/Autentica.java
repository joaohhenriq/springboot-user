package br.com.user.interface_funcional;

@FunctionalInterface
public interface Autentica {
	public abstract boolean autenticaSenha(String senha);
}
