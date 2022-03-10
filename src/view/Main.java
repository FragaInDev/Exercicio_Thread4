package view;

import controller.sapo_corre;

public class Main {
	static int num_sapos = 3;
	static int distancia = 100;
	
	public static void main(String[] args) {
		for (int i = 1; i <= num_sapos; i++) {
			new sapo_corre("Sapo " + i, distancia).start();
		}

	}

}
