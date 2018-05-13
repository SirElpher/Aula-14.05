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

		// Especificaçoes do objeto formulario
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setTitle("Trabalhando com botoes");
		
		//Criando um botão
		JButton botao = new JButton();
		botao.setText("Clique em mim");
		botao.setBounds(20, 20, 290, 30);
		
		//Adicionando uma ação ao botao
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, "Você clicou no botão.");
				
			}
		});
		
		//Adicionar botão no formulário
		formulario.add(botao);
		
		//Exibir o formulário e os componetes
		formulario.setVisible(true);
		
	}

}
