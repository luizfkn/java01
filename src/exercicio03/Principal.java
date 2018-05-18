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
		
		JFrame formulario = new JFrame("Médias e Situação");
		formulario.setSize(250, 200);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		JLabel nota1 = new JLabel("Informe a 1º nota: ");
		nota1.setBounds(10, 10, 150, 20);
	
		JTextField campoNota1 = new JTextField();
		campoNota1.setBounds(120, 10, 50, 20);
		
		JLabel nota2 = new JLabel("Informe a 2º nota: ");
		nota2.setBounds(10, 40, 150, 20);
	
		JTextField campoNota2 = new JTextField();
		campoNota2.setBounds(120, 40, 50, 20);
		
		JLabel nota3 = new JLabel("Informe a 3º nota: ");
		nota3.setBounds(10, 70, 150, 20);
	
		JTextField campoNota3 = new JTextField();
		campoNota3.setBounds(120, 70, 50, 20);
		
		JLabel nota4 = new JLabel("Informe a 3º nota: ");
		nota4.setBounds(10, 100, 150, 20);
	
		JTextField campoNota4 = new JTextField();
		campoNota4.setBounds(120, 100, 50, 20);
		
		JButton botao = new JButton("Confirmar Notas");
		botao.setBounds(27, 130, 180, 20);
		
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				double n1 = Double.parseDouble(campoNota1.getText());
				double n2 = Double.parseDouble(campoNota2.getText());
				double n3 = Double.parseDouble(campoNota3.getText());
				double n4 = Double.parseDouble(campoNota4.getText());
				
				if((n1 < 0) || (n1 > 10) || (n2 < 0) || (n2 > 10) || (n3 < 0) || (n3 > 10) || (n4 < 0) || (n4 > 10)){
					JOptionPane.showMessageDialog(null, "Nota invalida! (Deve ser entre 0 e 10)");
				}
				
				
				double media = (n1+n2+n3+n4)/4;
				
				String situacao = "";
				
				if(media >= 7){
					situacao = "Aprovado";
				}
				if(media < 7){
					situacao = "Em exame";
				}
				if(media < 5){
					situacao = "Reprovado";
				}
				
				
				String texto = "*****NOTAS E MEDIAS*****\n";
					   texto += "1º Nota: "+campoNota1.getText()+"\n";
					   texto += "2º Nota: "+campoNota2.getText()+"\n";
					   texto += "3º Nota: "+campoNota3.getText()+"\n";
					   texto += "4º Nota: "+campoNota4.getText()+"\n";
					   texto += "Media: "+media;
					   texto += "\nSituação: "+situacao;
				
				if((n1 > 0) && (n1 <= 10) && (n2 > 0) && (n2 <= 10) && (n3 > 0) && (n3 <= 10) && (n4 > 0) && (n4 <= 10)){
				JOptionPane.showMessageDialog(null, texto);
				}
				
				campoNota1.setText("");
				campoNota2.setText("");
				campoNota3.setText("");
				campoNota4.setText("");
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
		formulario.add(botao);
		
		
		formulario.setVisible(true);
		

	}

}
