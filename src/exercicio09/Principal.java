package exercicio09;

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
		JFrame formulario = new JFrame("Qual o maior numero");
		formulario.setSize(300, 200);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//JLabel
		JLabel numero1 = new JLabel("Informe o primeiro numero:");
		numero1.setBounds(10, 10, 160, 20);
		
		JTextField campoNumero1 = new JTextField();
		campoNumero1.setBounds(170, 10, 30 , 20);
		
		JLabel numero2 = new JLabel("Informe o segundo numero:");
		numero2.setBounds(10, 40, 160, 20);
		
		JTextField campoNumero2 = new JTextField();
		campoNumero2.setBounds(170, 40, 30 , 20);
		
		JLabel numero3 = new JLabel("Informe o terceiro numero:");
		numero3.setBounds(10, 70, 160, 20);
		
		JTextField campoNumero3 = new JTextField();
		campoNumero3.setBounds(170, 70, 30 , 20);
		
		JButton botao = new JButton("Confirmar");
		botao.setBounds(75, 110, 130, 20);
		
		botao.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				int n1 = Integer.parseInt(campoNumero1.getText());
				int n2 = Integer.parseInt(campoNumero2.getText());
				int n3 = Integer.parseInt(campoNumero3.getText());
				
			if((n1 < n2) && (n1 < n3)) {
				JOptionPane.showMessageDialog(null, "O menor número é "+n1);
			}
				
			if((n2 < n1) && (n2 < n3)) {
				JOptionPane.showMessageDialog(null, "O menor número é "+n2);
			}
			
			if((n3 < n1) && (n3 < n2)) {
				JOptionPane.showMessageDialog(null, "O menor número é "+n3);
			}
			
			campoNumero1.setText("");
			campoNumero2.setText("");
			campoNumero3.setText("");
			campoNumero1.requestFocus();
			
				
			}
		});
		
		
		
		
		formulario.add(numero1);
		formulario.add(campoNumero1);
		formulario.add(numero2);
		formulario.add(campoNumero2);
		formulario.add(numero3);
		formulario.add(campoNumero3);
		formulario.add(botao);
		
		
		formulario.setVisible(true);

	}

}
