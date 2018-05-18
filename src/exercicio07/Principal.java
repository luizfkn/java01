package exercicio07;

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
		JFrame formulario = new JFrame("");
		formulario.setSize(300, 120);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//JLabel
		JLabel numero = new JLabel("Informe o número:");
		numero.setBounds(10, 10, 150, 20);

		//JTextField
		JTextField obterNumero = new JTextField();
		obterNumero.setBounds(140, 10, 30, 20);
		
		//Butao
		JButton botao = new JButton("Confirmar");
		botao.setBounds(100, 50, 150, 20);
		
		//Ação
		botao.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				int n = Integer.parseInt(obterNumero.getText());
				String conta = "Numero informado "+n+"\n";

				for(int i = 0; i < 31; i++){
					
				conta += n+" x "+i+" = "+(n*i)+"\n";
					
				}
				
			JOptionPane.showMessageDialog(null, conta);
			
			obterNumero.setText("");			
			
			}
		});
		
		
		//Ver
		formulario.add(botao);
		formulario.add(numero);
		formulario.add(obterNumero);
		formulario.setVisible(true);
		
	}

}
