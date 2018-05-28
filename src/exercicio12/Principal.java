package exercicio12;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Principal {

	//JFRAME
	public static void main(String[] args) {
		
	JFrame formulario = new JFrame("Velocidade Máxima");
		formulario.setSize(300, 200);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		JLabel VelocidadePerm = new JLabel("Informe a velocidade permitida:");
		VelocidadePerm.setBounds(10, 20, 180, 20);
		
		JTextField campoPerm = new JTextField();
		campoPerm.setBounds(195, 20, 30, 20);
		
		JLabel velocidadeV = new JLabel("Informe a velocidade do veículo:");
		velocidadeV.setBounds(10, 50, 185, 20);
		
		JTextField campoVelocidade = new JTextField();
		campoVelocidade.setBounds(195, 50, 30, 20);
		
		JButton botao = new JButton("Confirmar");
		botao.setBounds(60, 90, 130, 20);
		
		botao.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				double perm = Double.parseDouble(campoPerm.getText());
				double velo = Double.parseDouble(campoVelocidade.getText());
				
				if((perm < 0) || (velo < 0)){
					JOptionPane.showMessageDialog(null, "Informação inválida!! (Deve ser maior de 0)");
				}
				
				if((velo <= perm)){
					JOptionPane.showMessageDialog(null, "Bom motorista!");
				}else if(velo-perm <= 10){
					JOptionPane.showMessageDialog(null, "Ultrapassou "+(velo-perm)+"km/h da velocidade permitida\nMulta de 50 reais!");
				}else if((velo-perm <= 30)){
					JOptionPane.showMessageDialog(null, "Ultrapassou "+(velo-perm)+"km/h da velocidade permitida\nMulta de 100 reais!");
				}else{
					JOptionPane.showMessageDialog(null, "Ultrapassou "+(velo-perm)+"km/h da velocidade permitida\nMulta de 200 reais!");
				}
				
				
				
				
				campoPerm.setText("");
				campoVelocidade.setText("");
				campoPerm.requestFocus();
				
			}
		});
		
		
		
		
		
		formulario.add(VelocidadePerm);
		formulario.add(campoPerm);
		formulario.add(velocidadeV);
		formulario.add(campoVelocidade);
		formulario.add(botao);
		
		
		
		formulario.setVisible(true);

	}

}
