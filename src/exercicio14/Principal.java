package exercicio14;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
		//JFRAME
		JFrame formulario = new JFrame("Venda de carro");
		formulario.setSize(300, 120);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		JLabel valor = new JLabel("Informe o valor do carro:");
		valor.setBounds(10, 20, 180, 20);
		
		JTextField campo = new JTextField();
		campo.setBounds(155, 20, 50, 20);
		
		JButton botao = new JButton("Confirmar");
		botao.setBounds(40, 50, 100, 20);
		
		botao.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
			
				double valor = Double.parseDouble(campo.getText());
				String exibir = "";
				
				if(valor < 0){
					JOptionPane.showMessageDialog(null, "Valor inválido! (Deve ser maior que 0)");
				}
				
				if(valor < 12000){
					exibir = "Valor informado: R$"+valor+"\n";
					exibir += "Valor sem impostos e percentual do distribuidor: R$"+(valor*0.95)+"\n";
					exibir += "Valor repassado ao distribuidor: R$"+(valor*0.05);
				}else if(valor < 25000){
					exibir = "Valor informado: R$"+valor+"\n";
					exibir += "Valor sem impostos e percentual do distribuidor: R$"+(valor*0.75)+"\n";
					exibir += "Valor repassado ao distribuidor: R$"+(valor*0.10)+"\n";
					exibir += "Valor de impostos: R$"+(valor*0.15)+"\n";
				}else{
					exibir = "Valor informado: R$"+valor+"\n";
					exibir += "Valor sem impostos e percentual do distribuidor: R$"+(valor*0.65)+"\n";
					exibir += "Valor repassado ao distribuidor: R$"+(valor*0.15)+"\n";
					exibir += "Valor de impostos: R$"+(valor*0.10)+"\n";
				}
				
				
				JOptionPane.showMessageDialog(null, exibir);
				campo.setText("");
				campo.requestFocus();
				
				
			}
		});
		
		
		
		
		
		formulario.add(valor);
		formulario.add(campo);
		formulario.add(botao);
		
		
		formulario.setVisible(true);

	}

}
