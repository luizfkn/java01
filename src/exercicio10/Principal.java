package exercicio10;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		JFrame formulario = new JFrame("Contagem de moedas");
		formulario.setSize(300, 300);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		JLabel moeda1 = new JLabel("Moedas de 1 centavo:");
		moeda1.setBounds(10, 10, 160, 20);
		
		JTextField campomoeda1 = new JTextField();
		campomoeda1.setBounds(170, 10, 30 , 20);
		
		JLabel moeda5 = new JLabel("Moedas de 5 centavos:");
		moeda5.setBounds(10, 40, 160, 20);
		
		JTextField campomoeda5 = new JTextField();
		campomoeda5.setBounds(170, 40, 30 , 20);
		
		JLabel moeda10 = new JLabel("Moedas de 10 centavos:");
		moeda10.setBounds(10, 70, 160, 20);
		
		JTextField campomoeda10 = new JTextField();
		campomoeda10.setBounds(170, 70, 30 , 20);
		
		JLabel moeda25 = new JLabel("Moedas de 25 centavos:");
		moeda25.setBounds(10, 100, 160, 20);
		
		JTextField campomoeda25 = new JTextField();
		campomoeda25.setBounds(170, 100, 30 , 20);
		
		JLabel moeda50 = new JLabel("Moedas de 50 centavos:");
		moeda50.setBounds(10, 130, 160, 20);
		
		JTextField campomoeda50 = new JTextField();
		campomoeda50.setBounds(170, 130, 30 , 20);
		
		JLabel moeda1real = new JLabel("Moedas de 1 real:");
		moeda1real.setBounds(10, 160, 160, 20);
		
		JTextField campomoeda1real = new JTextField();
		campomoeda1real.setBounds(170, 160, 30 , 20);
		
		JButton botao = new JButton("Contar");
		botao.setBounds(95, 190, 90, 20);
		
		botao.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				double m1 = Double.parseDouble(campomoeda1.getText());
				double m5 = Double.parseDouble(campomoeda5.getText());
				double m10 = Double.parseDouble(campomoeda10.getText());
				double m25 = Double.parseDouble(campomoeda25.getText());
				double m50 = Double.parseDouble(campomoeda50.getText());
				double m1real = Double.parseDouble(campomoeda1real.getText());
				double total = 0;
				
				total = (m1*0.01)+(m5*0.05)+(m10*0.10)+(m25*0.25)+(m50*0.50)+(m1real*1);
				
				
				JOptionPane.showMessageDialog(null, "Total de R$"+total);
				
			campomoeda1.setText("");
			campomoeda5.setText("");	
			campomoeda10.setText("");	
			campomoeda25.setText("");	
			campomoeda50.setText("");	
			campomoeda1real.setText("");
			campomoeda1.requestFocus();
				
				
			}
		});
		
		
		
		
		
		formulario.add(moeda1);
		formulario.add(campomoeda1);
		formulario.add(moeda5);
		formulario.add(campomoeda5);
		formulario.add(moeda10);
		formulario.add(campomoeda10);
		formulario.add(moeda25);
		formulario.add(campomoeda25);
		formulario.add(moeda50);
		formulario.add(campomoeda50);
		formulario.add(moeda1real);
		formulario.add(campomoeda1real);
		formulario.add(botao);
		
		formulario.setVisible(true);
		

	}

}
