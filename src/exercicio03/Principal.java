package exercicio03;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciar um onjeto da classe JFRAME
		JFrame formulario = new JFrame();
		formulario.setVisible(true);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 300);
		formulario.setLocationRelativeTo(null);
	    formulario.setTitle("Obter dados");
	    formulario.setLayout(null);
		
		//Obter notas do aluno
		JLabel nota = new JLabel();
        nota.setText("Nota");
		nota.setBounds(30, 30, 130, 20);
		
		JLabel nota1 = new JLabel();
		nota1.setText("Nota");
		nota1.setBounds(30, 60, 130, 20);
		
		JLabel nota2 = new JLabel();
		nota2.setText("Nota");
		nota2.setBounds(30, 90, 130, 30);
		
		JLabel nota3 = new JLabel();
		nota3.setText("Nota");
		nota3.setBounds(30, 120, 130, 30);
		
		//Campo
		JTextField campo = new JTextField();
		campo.setBounds(150, 30, 180, 20);
		
		JTextField campo1 = new JTextField();
		campo1.setBounds(150, 60, 180, 20);
		
		JTextField campo2 = new JTextField();
		campo2.setBounds(150, 90, 180, 20);
		
		JTextField campo3 = new JTextField();
		campo3.setBounds(150, 120, 180, 20);
		
		//Criando butão
		JButton botao = new JButton();
		botao.setText("Calcular ");
		botao.setBounds(150, 150, 180, 20);
		
		//Adicionando ação
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double nota = Double.parseDouble(campo.getText());
				double nota1 = Double.parseDouble(campo1.getText());
				double nota2 = Double.parseDouble(campo2.getText());
				double nota3 = Double.parseDouble(campo3.getText());
				
				if ( nota < nota2)
				
			}
		});
		
		//Adicionar botão no formulário
		formulario.add(botao);
		formulario.add(nota);
		formulario.add(nota1);
		formulario.add(nota2);
		formulario.add(nota3);
		formulario.add(campo);
		formulario.add(campo1);
		formulario.add(campo2);
		formulario.add(campo3);
		
		//Exibir o formulario e seus componentes
		formulario.repaint();
		formulario.setVisible(true);
	}

}
