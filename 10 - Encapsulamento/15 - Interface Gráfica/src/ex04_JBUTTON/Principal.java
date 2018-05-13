package ex04_JBUTTON;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub// Instanciar um objeto da classe JFrame
		JFrame formulario = new JFrame();

		// Especifica�oes do objeto formulario
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setTitle("Trabalhando com botoes");
		
		//Criando um bot�o
		JButton botao = new JButton();
		botao.setText("Clique em mim");
		botao.setBounds(20, 20, 290, 30);
		
		//Adicionando uma a��o ao botao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Voc� clicou no bot�o.");
				
			}
		});
		
		//Adicionar bot�o no formul�rio
		formulario.add(botao);
		
		//Exibir o formul�rio e os componetes
		formulario.setVisible(true);
		
	}

}
