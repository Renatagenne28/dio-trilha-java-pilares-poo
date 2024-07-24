package FuncaoIphone.telefone;

public class Phone implements AparelhoTelefonico {
	public void  ligar(String numero) {
		System.out.println("Ligando.");
	}
	public void atender() {
		System.out.println("Alô!");
	}
	public void iniciarCorreioVoz() {
		System.out.println("Gravando mensagem.");
	}
}
