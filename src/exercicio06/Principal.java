package exercicio06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
	JFrame formulario = new JFrame();
	formulario.setSize(200, 150);
	formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	formulario.setLocationRelativeTo(null);
	formulario.setLayout(null);
	
	JLabel numero1 = new JLabel("Informe o 1º número:");
	numero1.setBounds(10, 10, 150, 20);
	
	JTextField obterNumero1 = new JTextField();
	obterNumero1.setBounds(140, 10, 30, 20);
	
	JLabel numero2 = new JLabel("Informe o 2º número:");
	numero2.setBounds(10, 40, 150, 20);
	
	JTextField obterNumero2 = new JTextField();
	obterNumero2.setBounds(140, 40, 30, 20);
	
	JButton botao = new JButton("Confirmar números");
	botao.setBounds(15, 70, 150, 20);
	
	botao.addActionListener(new ActionListener() {
		
		
		public void actionPerformed(ActionEvent e) {
			
			int n1 = Integer.parseInt(obterNumero1.getText());
			int n2 = Integer.parseInt(obterNumero2.getText());
			int soma = 0;
			int multiplicacao = 0;
			
			if(n1 == n2){
				soma = n1+n2;
				JOptionPane.showMessageDialog(null, "Os número são iguais!! Soma: "+soma);
			}else{
				multiplicacao = n1*n2;
				JOptionPane.showMessageDialog(null, "Os número são diferentes!! Multiplicação: "+multiplicacao);
			}
			
			obterNumero1.setText("");
			obterNumero2.setText("");
			obterNumero1.requestFocus();
			
		}
	});
	
	
	
	
	
	formulario.add(numero1);
	formulario.add(obterNumero1);
	formulario.add(numero2);
	formulario.add(obterNumero2);
	formulario.add(botao);
	
	formulario.setVisible(true);

	}

}