package controller;

public class sapo_corre extends Thread {
	
	//variáveis de corrida
	
	String nome_sapo;
	int disCorrida = 0;
	int disTotal;
	int pulo = 0;
	int contPulos = 0;
	int podio = 0;
	
	public sapo_corre(String nome, int dTotal) {
		this.disTotal = dTotal;
		this.nome_sapo = nome;
	}
	
	public void sapoPula() {
		contPulos++;
		pulo = (int) (Math.random() * 25) + 1; //o sapo pode dar um pulo de até 25cm
		disCorrida += pulo;
		
		if (disCorrida > disTotal) {
			disCorrida = disTotal;
		}
	}
	
	public void sapoDescansa() {
		try {
			sleep (1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void statusCorrida() {
		System.out.println("O " + nome_sapo + " pulou " + pulo + " cm e ja percorreu " + disCorrida +" cm.");
	}
	
	public void podioCorrida() {
		podio++;
		System.out.println(nome_sapo + " foi o " + podio + "º com " + contPulos + " pulos.");
	}
	
	@Override
	public void run() {
		while (disCorrida < disTotal) {
			sapoPula();
			statusCorrida();
			sapoDescansa();
		}
		podioCorrida();
	}
	
}
