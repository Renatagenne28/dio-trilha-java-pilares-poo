package FuncaoIphone.internet;

public class Internet implements NavegadorInternet{
	public void exibirPagina(String url){
		System.out.println("Exibindo página.");
	}
	public void adicionarNovaAba() {
		System.out.println("Adicionando Aba.");
	}
	public void atualizarPagina() {
		System.out.println("Atualizando página.");
	}
}
