package exercicio05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
	JFrame formulario = new JFrame("Mês de fevereiro");
	formulario.setSize(300, 120);
	formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	formulario.setLocationRelativeTo(null);
	formulario.setLayout(null);
	
	JLabel dia = new JLabel("Informe um dia do mês de fevereiro: ");
	dia.setBounds(10, 10, 210, 20);
	
	JTextField campo = new JTextField();
	campo.setBounds(220, 10, 30, 20);
	
	JButton botao = new JButton("Confirmar dia");
	botao.setBounds(80, 40, 130, 20);
	
	botao.addActionListener(new ActionListener() {
		
		
		public void actionPerformed(ActionEvent e) {
			
			double dia = Double.parseDouble(campo.getText());
			
			if((dia < 1) || (dia > 28)){
				JOptionPane.showMessageDialog(null, "Dia inválido! (Deve ser um dia entra 1 e 28)");
			}
			
			
			if((dia >= 1) && (dia <= 28)){
			if((dia == 3) || (dia == 4) || (dia == 10) || (dia == 11) || (dia == 17) || (dia == 18) || (dia == 24) || (dia == 25)){
				JOptionPane.showMessageDialog(null, "Final de Semana!");
			}else{
				JOptionPane.showMessageDialog(null, "Dia de Semana!");
			}
			}
			
			campo.setText("");
			campo.requestFocus();
			
		}
	});
	
	
	
	
	formulario.add(dia);
	formulario.add(campo);
	formulario.add(botao);
	
	formulario.setVisible(true);
		

	}

}