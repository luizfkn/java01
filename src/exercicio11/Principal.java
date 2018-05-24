package exercicio11;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		//JFrame
		JFrame formulario = new JFrame("Média");
		formulario.setSize(250, 250);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		JLabel nota1 = new JLabel("Informe a 1º nota:");
		nota1.setBounds(10, 20, 140, 20);
		
		JTextField campoNota1 = new JTextField();
		campoNota1.setBounds(120, 20, 30, 20);
		
		JLabel nota2 = new JLabel("Informe a 2º nota:");
		nota2.setBounds(10, 50, 140, 20);
		
		JTextField campoNota2 = new JTextField();
		campoNota2.setBounds(120, 50, 30, 20);
		
		JLabel nota3 = new JLabel("Informe a 3º nota:");
		nota3.setBounds(10, 80, 140, 20);
		
		JTextField campoNota3 = new JTextField();
		campoNota3.setBounds(120, 80, 30, 20);
		
		JLabel nota4 = new JLabel("Informe a 4º nota:");
		nota4.setBounds(10, 110, 140, 20);
		
		JTextField campoNota4 = new JTextField();
		campoNota4.setBounds(120, 110, 30, 20);
		
		JLabel faltas = new JLabel("Quantidade de faltas:");
		faltas.setBounds(10, 140, 140, 20);
		
		JTextField campofaltas= new JTextField();
		campofaltas.setBounds(135, 140, 30, 20);
		
		JButton botao = new JButton("Confirmar aluno");
		botao.setBounds(60, 170, 130, 20);
		
		botao.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				int faltas = Integer.parseInt(campofaltas.getText());
				double n1 = Double.parseDouble(campoNota1.getText());
				double n2 = Double.parseDouble(campoNota2.getText());
				double n3 = Double.parseDouble(campoNota3.getText());
				double n4 = Double.parseDouble(campoNota4.getText());
				double media = (n1+n2+n3+n4)/4;
				
				
			if((n1 < 0) || (n1 > 10) || (n2 < 0) || (n2 > 10) || (n3 < 0) || (n3 > 10) || (n4 < 0) || (n4 > 10)){
				JOptionPane.showMessageDialog(null, "Nota inválida!! (Deve ser entre 0 e 10)");
			}
				
			if(media == 10){
				JOptionPane.showMessageDialog(null, "Média: "+media+"\nParabéns!");
			}else if(media >= 9){
				JOptionPane.showMessageDialog(null, "Média: "+media+"\nÓtimo!");
			}else if(media >= 7){
				JOptionPane.showMessageDialog(null, "Média: "+media+"\nBom!");
			}else if(media >= 5.1){
				JOptionPane.showMessageDialog(null, "Média: "+media+"\nEm exame!");
			}else if(media >= 1){
				JOptionPane.showMessageDialog(null, "Média: "+media+"\nReprovado!");
			}
				
				
				
			if(faltas > 15){
				JOptionPane.showMessageDialog(null, "Reprovado");
			}
						
						
			campoNota1.setText("");	
			campoNota2.setText("");	
			campoNota3.setText("");	
			campoNota4.setText("");
			campofaltas.setText("");
			campoNota1.requestFocus();
				
				
				
			}
		});
		
				
		
		
		
		
		
		formulario.add(nota1);
		formulario.add(campoNota1);
		formulario.add(nota2);
		formulario.add(campoNota2);
		formulario.add(nota3);
		formulario.add(campoNota3);
		formulario.add(nota4);
		formulario.add(campoNota4);
		formulario.add(faltas);
		formulario.add(campofaltas);
		formulario.add(botao);
		
		formulario.setVisible(true);

	}

}
