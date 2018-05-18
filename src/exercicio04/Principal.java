package exercicio04;

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
		
		JFrame formulario = new JFrame("Desconto de Produtos");
		formulario.setSize(350, 200);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		JLabel nomeProduto = new JLabel("Informe o nome do produto:");
		nomeProduto.setBounds(10, 10, 170, 20);
		
		JTextField campoProduto = new JTextField();
		campoProduto.setBounds(170, 10, 100, 20);
		
		JLabel valorProduto = new JLabel("Informe o valor: ");
		valorProduto.setBounds(10, 40, 170, 20);
		
		JTextField campoValor = new JTextField();
		campoValor.setBounds(170, 40, 100, 20);
		
		JLabel FormaPagamento = new JLabel("Informe o método de pagamento:");
		FormaPagamento.setBounds(10, 70, 200, 20);
		
		
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(200, 70, 90, 30);
		combo.addItem("À Vista");
		combo.addItem("Outra maneira");
		
		JButton botao = new JButton("Confirmar");
		botao.setBounds(120, 110, 100, 20);
		
		botao.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				double valor = Double.parseDouble(campoValor.getText());
				double desconto = 0;
				
				if((valor > 500) && (combo.getSelectedItem().equals("À Vista"))){
					desconto = valor*0.9;
					JOptionPane.showMessageDialog(null, "O produto "+campoProduto.getText()+" custará R$"+desconto);
				}else{
					JOptionPane.showMessageDialog(null, "O produto "+campoProduto.getText()+" custará R$"+valor);
				}
				
				campoProduto.setText("");
				campoValor.setText("");
				campoProduto.requestFocus();
				
			}
		});
		
		
		
		
		
		
		formulario.add(nomeProduto);
		formulario.add(campoProduto);
		formulario.add(valorProduto);
		formulario.add(campoValor);
		formulario.add(FormaPagamento);
		formulario.add(combo);
		formulario.add(botao);
		
		
		
		formulario.setVisible(true);

	}

}
