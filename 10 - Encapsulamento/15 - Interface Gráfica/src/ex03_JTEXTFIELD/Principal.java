package ex03_JTEXTFIELD;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		// Instanciar um objeto da classe JFrame
		JFrame formulario = new JFrame();

		// Especifica�oes do objeto formulario
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setTitle("Trabalhando");
		
		//R�tulo
		JLabel rotulo = new JLabel();
		rotulo.setText("Informe seu nome");
		rotulo.setBounds(30, 30, 130, 20);
		
		//Campo
		JTextField campo = new JTextField();
		campo.setBounds(150, 30, 180, 20);
		
		//Adicionar camponentes ao formul�rio
		formulario.add(rotulo);
		formulario.add(campo);
		
		//Exibir o formul�rio e seus componentes
		formulario.setVisible(true);
	}

}
