package exercicio13;

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
		JFrame formulario = new JFrame("Antecessor e Sucessor");
		formulario.setSize(300, 120);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		JLabel numero = new JLabel("Informe um número:");
		numero.setBounds(10, 20, 180, 20);
		
		JTextField campo = new JTextField();
		campo.setBounds(130, 20, 30, 20);
		
		JButton botao = new JButton("Confirmar");
		botao.setBounds(40, 50, 100, 20);
		
		botao.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				int n = Integer.parseInt(campo.getText());
				int sucessor = n+1;
				int antecessor = n-1;
				
				JOptionPane.showMessageDialog(null, "Numero informado: "+n+"\nSucessor: "+sucessor+"\nAntecessor: "+antecessor);
				
				
				
				campo.setText("");
				campo.requestFocus();
				
			}
		});
		
		
		
		
		formulario.add(numero);
		formulario.add(campo);
		formulario.add(botao);
		
		formulario.setVisible(true);

	}

}
