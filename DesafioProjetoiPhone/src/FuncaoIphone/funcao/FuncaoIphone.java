package FuncaoIphone.funcao;
import FuncaoIphone.internet.NavegadorInternet;
import FuncaoIphone.musica.ReprodutorMusical;
import FuncaoIphone.telefone.AparelhoTelefonico;

public class FuncaoIphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
public void  ligar(String numero) {
	System.out.println("Ligando.");
}
public void atender() {
	System.out.println("Alô!");
}
public void iniciarCorreioVoz() {
	System.out.println("Gravando mensagem.");
}

public void exibirPagina(String url){
	System.out.println("Exibindo página.");
}
public void adicionarNovaAba() {
	System.out.println("Adicionando Aba.");
}
public void atualizarPagina() {
	System.out.println("Atualizando página.");
}

public void tocar(){
	System.out.println("Tocando música.");
}
public void pausar(){
	System.out.println("Pausando música.");
}
public void selecionarMusica(String musica){
	System.out.println("Selecionando música.");
}
}
