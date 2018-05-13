package exemplo01;

import javax.swing.JOptionPane;

public class Pessoa {

	// Atributo da classe
	private int idade;

	// Metodo para informar se � maior de idade
	private void maiorIdade() {
		
		//THIS -> Referencia a variavek fora do metodo.

		// Vari�vel local
		int idade = 0;
		JOptionPane.showMessageDialog(null, this.idade >= 18 ? "Maior de idade" : "Menor de idade");
	}

	// Construtor
	public Pessoa() {
		idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));
		maiorIdade();
	}
}
