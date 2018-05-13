package ex02_JLABEL;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Principal {

	public static void main(String[] args) {

		// Instanciar um objeto da classe JFrame
		JFrame formulario = new JFrame();

		// Especifica�oes do objeto formulario
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setTitle("Meu primeiro formul�rio");

		//Criando um R�tulo
		JLabel rotulo = new JLabel();
		rotulo.setText("Uma mensagem qualquer...");
		rotulo.setBounds(0, 0, 300, 20);
		
		//Criando outro R�tulo
		JLabel rotulo2 = new JLabel();
		rotulo2.setText("Uma mensagem qualquer...");
		rotulo2.setBounds(0, 30, 300, 20);
		
		//Adicionar componentes ao formul�rio
		formulario.add(rotulo);
		formulario.add(rotulo2);
		
	}

}
