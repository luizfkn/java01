package exercicio01;

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
				formulario.setSize(400, 200);
				formulario.setLocationRelativeTo(null);
			    formulario.setTitle("Adicione seus dados");
				formulario.setLayout(null);
			

				//Rotulo
					JLabel rotulo = new JLabel();
			        rotulo.setText("Informe seu nome ");
					rotulo.setBounds(30, 30, 130, 20);
					
					JLabel rotulo1 = new JLabel();
					rotulo1.setText("Informe sua cidade ");
					rotulo1.setBounds(30, 60, 130, 20);
					
					JLabel rotulo2 = new JLabel();
					rotulo2.setText("Informe sua idade ");
					rotulo2.setBounds(30, 90, 130, 20);
				
				//Campo
				JTextField campo = new JTextField();
				campo.setBounds(150, 30, 180, 20);
				
				JTextField campo1 = new JTextField();
				campo1.setBounds(150, 60, 180, 20);
				
				JTextField campo2 = new JTextField();
				campo2.setBounds(150, 90, 180, 20);
				
			    
				//Criando um botão
				JButton botao = new JButton();
				botao.setText("verificar ");
				botao.setBounds(150, 120, 180, 20);
				
				//Adicionando ação
				botao.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						JOptionPane.showMessageDialog(null, "seu nome é "+ campo.getText()+ " mora na cidade de "+campo1.getText()+ " e sua idade é "+campo2.getText());
						
					}
				});
				
				//Adicionar botão no formulário
				formulario.add(botao);
				formulario.add(rotulo);
				formulario.add(rotulo1);
				formulario.add(rotulo2);
				formulario.add(campo);
				formulario.add(campo1);
				formulario.add(campo2);
			    
				//Exibir o formulario e seus componentes
				formulario.repaint();
				formulario.setVisible(true);
        
	}

}
