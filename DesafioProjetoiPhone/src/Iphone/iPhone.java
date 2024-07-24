package Iphone;

import FuncaoIphone.funcao.FuncaoIphone;

public class iPhone {
private static final String String = null;

public static void main (String[]args) {
	FuncaoIphone em = new FuncaoIphone();
	
	FuncaoIphone reprodutorMusical = em;
	FuncaoIphone aparelhoTelefonico = em;
	FuncaoIphone navegadorInternet = em;
	
	reprodutorMusical.tocar();
	reprodutorMusical.pausar();
	reprodutorMusical.selecionarMusica(String);

	aparelhoTelefonico.ligar(String);
	aparelhoTelefonico.atender();
	aparelhoTelefonico.iniciarCorreioVoz();
	
	navegadorInternet.adicionarNovaAba();
	navegadorInternet.atualizarPagina();
	navegadorInternet.exibirPagina(String);
	
}
}
