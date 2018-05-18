package exercicio08;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
	
		////JFrame
		JFrame formulario = new JFrame("Calculadora Simples");
		formulario.setSize(250, 200);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		
		//Rotulo
		JLabel numero = new JLabel();
        numero.setText("1 número: ");
		numero.setBounds(30, 30, 130, 20);
		
		JLabel numero1 = new JLabel();
		numero1.setText("2 numero: ");
		numero1.setBounds(30, 60, 130, 20);
		
		JComboBox<String> combo = new JComboBox<>();
		combo.setBounds(100, 90, 60, 20);
		combo.addItem("Soma");
		combo.addItem("Subtração");
		combo.addItem("Multiplicação");
		combo.addItem("Divisao");
		
		JButton botao = new JButton("Confirmar");
		botao.setBounds(100, 130, 100, 20);
		
		//Campo
		JTextField campo = new JTextField();
		campo.setBounds(100, 30, 60, 20);
		
		JTextField campo1 = new JTextField();
		campo1.setBounds(100, 60, 60, 20);
		
	
		
		
			
				//Formulario
				formulario.add(numero);
				formulario.add(numero1);
				formulario.add(campo);
				formulario.add(campo1);
				formulario.add(combo);
				formulario.add(botao);
				formulario.setVisible(true);
	}

}
