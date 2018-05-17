package exercicio02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		
	      //Instanciar um onjeto da classe JFRAME
					JFrame formulario = new JFrame();
					
					formulario.setVisible(true);
					formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					formulario.setSize(500, 200);
					formulario.setLocationRelativeTo(null);
				    formulario.setTitle("Obter dados do produto");
					formulario.setLayout(null);

					//Obter preço pago pelo produto
						
					    //Rotulo
					    JLabel rotulo = new JLabel();
				        rotulo.setText("Informe valor do produto ");
						rotulo.setBounds(30, 30, 150, 20);
						
						//Campo
						JTextField campo = new JTextField();
						campo.setBounds(200, 30, 200, 20);
						
			
						
						//Criando butão
						JButton botao = new JButton();
						botao.setText("Calcular ");
						botao.setBounds(150, 120, 180, 20);
						
						
						//Adicionando ação
						botao.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								
								double valor = Double.parseDouble(campo.getText());
								
								JOptionPane.showMessageDialog(null, "O valor do produto com 10% de desconto fica: "+(valor*0.90));
								
							}
						});
						
						
						
						//Adicionar botão no formulário
						formulario.add(botao);
						formulario.add(rotulo);
						formulario.add(campo);
						
					    
						//Exibir o formulario e seus componentes
						formulario.repaint();
						formulario.setVisible(true);
						
					
	}

}
