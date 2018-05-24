package exercicio17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {

		JFrame formulario = new JFrame("Lanchonete");
		formulario.setSize(250, 150);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		JLabel numero1 = new JLabel("Informe o 1º número: ");
		numero1.setBounds(10, 10, 140, 20);
		
		JTextField camponumero1 = new JTextField();
		camponumero1.setBounds(140, 10, 70, 20);
		
		JLabel numero2 = new JLabel("Informe o 2º número: ");
		numero2.setBounds(10, 40, 140, 20);
		
		JTextField camponumero2 = new JTextField();
		camponumero2.setBounds(140, 40, 70, 20);
		
		JButton botao = new JButton("Confirmar");
		botao.setBounds(90, 70, 100, 20);
		
		formulario.add(numero1);
		formulario.add(camponumero1);
		formulario.add(numero2);
		formulario.add(camponumero2);
		formulario.add(botao);
		
		botao.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
		
				int n1 = Integer.parseInt(camponumero1.getText());
				int n2 = Integer.parseInt(camponumero2.getText());
				double quociente = 0;
				
				quociente = n1/n2;
				
				JOptionPane.showMessageDialog(null, "1º Número: "+n1+"\n2º Número: "+n2+"\nQuociente: "+quociente);
				
				camponumero1.setText("");
				camponumero2.setText("");
				camponumero1.requestFocus();
				
			}
		});
		
		
		
		
		formulario.setVisible(true);
		
	}

}
