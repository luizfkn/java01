package exercicio16;

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
		
		//JFrame
		JFrame formulario = new JFrame("Lanchonete");
		formulario.setSize(400, 150);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		JLabel pedido = new JLabel("Escolha seu pedido: ");
		pedido.setBounds(10, 10, 140, 20);
		
		
		JComboBox<String> escolhaPedido = new JComboBox<>();
		escolhaPedido.setBounds(140, 10, 210, 20);
		escolhaPedido.addItem("Hambúrguer + Suco de Laranja");
		escolhaPedido.addItem("Sanduíche natural + Suco de Uva");
		escolhaPedido.addItem("Prato do dia");
		escolhaPedido.addItem("Pizza");
		escolhaPedido.addItem("Lasanha");
		escolhaPedido.addItem("Pão de queijo");
		escolhaPedido.addItem("Bolo");
		
		JLabel pagamento = new JLabel("Informe o pagamento: ");
		pagamento.setBounds(10, 40, 140, 20);
		
		JTextField campo = new JTextField();
		campo.setBounds(140, 40, 70, 20);
		
		JButton botao = new JButton("Confirmar");
		botao.setBounds(140, 70, 100, 20);
		
		botao.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				String exibir = "";
				double pagamento = Double.parseDouble(campo.getText());
				
				
				if(pagamento < 0){
					JOptionPane.showMessageDialog(null, "Pagamento inválido!! (Deve ser maior de 0)");
				}
				
				if(escolhaPedido.getSelectedItem().equals("Hambúrguer + Suco de Laranja")){
					
					exibir = "Pedido: "+escolhaPedido.getSelectedItem()+"\n";
					exibir += "Valor: R$5,00\n";
					exibir += "Troco: R$"+(pagamento-5);
					
					if(pagamento < 5){
						JOptionPane.showMessageDialog(null, "O cliente deve: R$"+(5-pagamento));
					}
					
					if(pagamento > 5){
					JOptionPane.showMessageDialog(null, exibir);
					}
				}else if(escolhaPedido.getSelectedItem().equals("Sanduíche natural + Suco de Uva")){
					
					exibir = "Pedido: "+escolhaPedido.getSelectedItem()+"\n";
					exibir += "Valor: R$4,50\n";
					exibir += "Troco: R$"+(pagamento-4.5);
					
					if(pagamento < 0){
						JOptionPane.showMessageDialog(null, "O cliente deve: R$"+(4.5-pagamento));
					}
					
					if(pagamento > 4.5){
					JOptionPane.showMessageDialog(null, exibir);
					}
				}else if(escolhaPedido.getSelectedItem().equals("Prato do dia")){
					
					exibir = "Pedido: "+escolhaPedido.getSelectedItem()+"\n";
					exibir += "Valor: R$8,00\n";
					exibir += "Troco: R$"+(pagamento-8);
					
					if(pagamento < 8){
						JOptionPane.showMessageDialog(null, "O cliente deve: R$"+(8-pagamento));
					}
					
					if(pagamento > 8){
					JOptionPane.showMessageDialog(null, exibir);
					}
				}else if(escolhaPedido.getSelectedItem().equals("Pizza")){
					
					exibir = "Pedido: "+escolhaPedido.getSelectedItem()+"\n";
					exibir += "Valor: R$12,00\n";
					exibir += "Troco: R$"+(pagamento-12);
					
					if(pagamento < 12){
						JOptionPane.showMessageDialog(null, "O cliente deve: R$"+(12-pagamento));
					}
					
					if(pagamento > 12){
					JOptionPane.showMessageDialog(null, exibir);
					}
				}else if(escolhaPedido.getSelectedItem().equals("Lasanha")){
					
					exibir = "Pedido: "+escolhaPedido.getSelectedItem()+"\n";
					exibir += "Valor: R$16,50\n";
					exibir += "Troco: R$"+(pagamento-16.5);
					
					if(pagamento < 16.5){
						JOptionPane.showMessageDialog(null, "O cliente deve: R$"+(16.5-pagamento));
					}
					
					if(pagamento > 16.5){
					JOptionPane.showMessageDialog(null, exibir);
					}
				}else if(escolhaPedido.getSelectedItem().equals("Pão de queijo")){
					
					exibir = "Pedido: "+escolhaPedido.getSelectedItem()+"\n";
					exibir += "Valor: R$1,00\n";
					exibir += "Troco: R$"+(pagamento-1);
					
					if(pagamento < 1){
						JOptionPane.showMessageDialog(null, "O cliente deve: R$"+(1-pagamento));
					}
					
					if(pagamento > 1){
					JOptionPane.showMessageDialog(null, exibir);
					}
				}else if(escolhaPedido.getSelectedItem().equals("Bolo")){
					
					exibir = "Pedido: "+escolhaPedido.getSelectedItem()+"\n";
					exibir += "Valor: R$2,50\n";
					exibir += "Troco: R$"+(pagamento-2.5);
					
					if(pagamento < 2.5){
						JOptionPane.showMessageDialog(null, "O cliente deve: R$"+(2.5-pagamento));
					}
					
					if(pagamento > 2.5){
					JOptionPane.showMessageDialog(null, exibir);
					}
				}	
					
				
				
				
				campo.setText("");
				escolhaPedido.setSelectedItem("Hambúrguer + Suco de Laranja");
				
			}
		});
		
		
	
		formulario.add(pedido);
		formulario.add(escolhaPedido);
		formulario.add(pagamento);
		formulario.add(campo);
		formulario.add(botao);

		formulario.setVisible(true);
		
	}

}
