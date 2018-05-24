package exercicio15;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Principal {

	public static void main(String[] args) {
		
		JFrame formulario = new JFrame("Hotel");
		formulario.setSize(300, 140);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		JLabel apts = new JLabel("Escolha sua opção: ");
		apts.setBounds(10, 10, 140, 20);
		
		
		JComboBox<String> escolhaApts = new JComboBox<>();
		escolhaApts.setBounds(130, 10, 100, 20);
		escolhaApts.addItem("Apto Simples");
		escolhaApts.addItem("Apto Duplo");
		escolhaApts.addItem("Suíte Luxo");
		
		JLabel dias = new JLabel("Quantadade de dias: ");
		dias.setBounds(10, 40, 140, 20);
		
		JTextField campoDias = new JTextField();
		campoDias.setBounds(130, 40, 40, 20);
		
		JButton botao = new JButton("Confirmar");
		botao.setBounds(100, 70, 100, 20);
		
		botao.addActionListener(new ActionListener() {
			
		
			public void actionPerformed(ActionEvent e) {
				
				int n = Integer.parseInt(campoDias.getText());
				
				if(n < 0){
					JOptionPane.showMessageDialog(null, "Dia inválido! (Deve ser maior de 0)");
				}
				
				if(n > 0){
				if(escolhaApts.getSelectedItem().equals("Apto Simples")){
					JOptionPane.showMessageDialog(null, "Hospedagem: "+escolhaApts.getSelectedItem()+"\nDias: "+n+"\nTotal: R$"+(n*45));
				}else if(escolhaApts.getSelectedItem().equals("Apto Duplo")){
					JOptionPane.showMessageDialog(null, "Hospedagem: "+escolhaApts.getSelectedItem()+"\nDias: "+n+"\nTotal: R$"+(n*65));
				}else if(escolhaApts.getSelectedItem().equals("Suíte Luxo")){
					JOptionPane.showMessageDialog(null, "Hospedagem: "+escolhaApts.getSelectedItem()+"\nDias: "+n+"\nTotal: R$"+(n*110));
				}
				}
				
				campoDias.setText("");
				escolhaApts.setSelectedItem("Apto Simples");
				
			}
		});
		
		
		
		
		formulario.add(apts);
		formulario.add(escolhaApts);
		formulario.add(dias);
		formulario.add(campoDias);
		formulario.add(botao);
		
		
		formulario.setVisible(true);

	}

}
