package Ventanas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Calculadora extends JFrame {
	
	double numero1;
	double numero2;
	double resultado;
	String operacion;
	

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPantalla;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 340, 411);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(55, 55, 55));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		
		txtPantalla = new JTextField();
		txtPantalla.setForeground(new Color(55, 55, 55));
		txtPantalla.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		txtPantalla.setBounds(10, 14, 224, 60);
		contentPane.add(txtPantalla);
		txtPantalla.setColumns(10);
		
		JButton btnBorrar = new JButton("C");
		btnBorrar.setForeground(new Color(215, 215, 215));
		btnBorrar.setBackground(new Color(33, 33, 33));
		btnBorrar.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtPantalla.setText("");
			}
		});
		btnBorrar.setBounds(88, 297, 68, 60);
		contentPane.add(btnBorrar);
		
		JButton btnSumar = new JButton("+");
		btnSumar.setForeground(new Color(215, 215, 215));
		btnSumar.setBackground(new Color(33, 33, 33));
		btnSumar.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnSumar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Suma 
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				operacion = "+";
			}
		});
		btnSumar.setBounds(244, 84, 68, 60);
		contentPane.add(btnSumar);
		
		JButton btn9 = new JButton("9");
		btn9.setForeground(new Color(215, 215, 215));
		btn9.setBackground(new Color(33, 33, 33));
		btn9.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Numero 9
				String IngresaNumero = txtPantalla.getText() + btn9.getText();
				txtPantalla.setText(IngresaNumero);
			}
		});
		btn9.setBounds(166, 84, 68, 60);
		contentPane.add(btn9);
		
		JButton btn8 = new JButton("8");
		btn8.setForeground(new Color(215, 215, 215));
		btn8.setBackground(new Color(33, 33, 33));
		btn8.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Numero 8
				String IngresaNumero = txtPantalla.getText() + btn8.getText();
				txtPantalla.setText(IngresaNumero);
			}
		});
		btn8.setBounds(88, 84, 68, 60);
		contentPane.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.setForeground(new Color(215, 215, 215));
		btn7.setBackground(new Color(33, 33, 33));
		btn7.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Numero 7
				String IngresaNumero = txtPantalla.getText() + btn7.getText();
				txtPantalla.setText(IngresaNumero);
			}
		});
		btn7.setBounds(10, 84, 68, 60);
		contentPane.add(btn7);
		
		JButton btn4 = new JButton("4");
		btn4.setForeground(new Color(215, 215, 215));
		btn4.setBackground(new Color(33, 33, 33));
		btn4.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Numero 4
				String IngresaNumero = txtPantalla.getText() + btn4.getText();
				txtPantalla.setText(IngresaNumero);
			}
		});
		btn4.setBounds(10, 155, 68, 60);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.setForeground(new Color(215, 215, 215));
		btn5.setBackground(new Color(33, 33, 33));
		btn5.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Numero 5
				String IngresaNumero = txtPantalla.getText() + btn5.getText();
				txtPantalla.setText(IngresaNumero);
			}
		});
		btn5.setBounds(88, 155, 68, 60);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.setForeground(new Color(215, 215, 215));
		btn6.setBackground(new Color(33, 33, 33));
		btn6.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Numero 6
				String IngresaNumero = txtPantalla.getText() + btn6.getText();
				txtPantalla.setText(IngresaNumero);
			}
			
		});
		btn6.setBounds(166, 155, 68, 60);
		contentPane.add(btn6);
		
		JButton btnRestar = new JButton("-");
		btnRestar.setForeground(new Color(215, 215, 215));
		btnRestar.setBackground(new Color(33, 33, 33));
		btnRestar.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnRestar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Resta 
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				operacion = "-";
			}
		});
		btnRestar.setBounds(244, 155, 68, 60);
		contentPane.add(btnRestar);
		
		JButton btn1 = new JButton("1");
		btn1.setForeground(new Color(215, 215, 215));
		btn1.setBackground(new Color(33, 33, 33));
		btn1.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Numero1
				String IngresaNumero = txtPantalla.getText() + btn1.getText();
				txtPantalla.setText(IngresaNumero);
			}
		});
		btn1.setBounds(10, 226, 68, 60);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.setForeground(new Color(215, 215, 215));
		btn2.setBackground(new Color(33, 33, 33));
		btn2.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				//Numero 2
				String IngresaNumero = txtPantalla.getText() + btn2.getText();
				txtPantalla.setText(IngresaNumero);
			}
		});
		btn2.setBounds(88, 226, 68, 60);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.setForeground(new Color(215, 215, 215));
		btn3.setBackground(new Color(33, 33, 33));
		btn3.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Numero 3
				String IngresaNumero = txtPantalla.getText() + btn3.getText();
				txtPantalla.setText(IngresaNumero);
			}
		});
		btn3.setBounds(166, 226, 68, 60);
		contentPane.add(btn3);
		
		JButton btnMultiplicar = new JButton("x");
		btnMultiplicar.setForeground(new Color(215, 215, 215));
		btnMultiplicar.setBackground(new Color(33, 33, 33));
		btnMultiplicar.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnMultiplicar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//multiplicar 
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				operacion = "x";
			}
		});
		btnMultiplicar.setBounds(244, 226, 68, 60);
		contentPane.add(btnMultiplicar);
		
		JButton btn0 = new JButton("0");
		btn0.setForeground(new Color(215, 215, 215));
		btn0.setBackground(new Color(33, 33, 33));
		btn0.setFont(new Font("Tahoma", Font.BOLD, 24));
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Numero 0
				String IngresaNumero = txtPantalla.getText() + btn0.getText();
				txtPantalla.setText(IngresaNumero);
			}
		});
		btn0.setBounds(10, 297, 68, 60);
		contentPane.add(btn0);
		
		JButton btnIgual = new JButton("=");
		btnIgual.setForeground(new Color(215, 215, 215));
		btnIgual.setBackground(new Color(33, 33, 33));
		btnIgual.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String seleccionar;
				numero2 = Double.parseDouble(txtPantalla.getText());
				
				if(operacion == "+") {
					resultado = numero1 + numero2;
					seleccionar = String.format("%.2f", resultado);
					txtPantalla.setText(seleccionar);
				} else if (operacion == "-") {
					resultado = numero1 - numero2;
					seleccionar = String.format("%.2f", resultado);
					txtPantalla.setText(seleccionar);
				} else if (operacion == "x") {
					resultado = numero1 * numero2;
					seleccionar = String.format("%.2f", resultado);
					txtPantalla.setText(seleccionar);
			} else if (operacion == "/"){
					resultado = numero1 / numero2;
					seleccionar = String.format("%.2f", resultado);
					txtPantalla.setText(seleccionar);
				
			}
			}
		});
		btnIgual.setBounds(166, 297, 68, 60);
		contentPane.add(btnIgual);
		
		JButton btnDividir = new JButton("/");
		btnDividir.setForeground(new Color(215, 215, 215));
		btnDividir.setBackground(new Color(33, 33, 33));
		btnDividir.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnDividir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			//Dividir 
				numero1 = Double.parseDouble(txtPantalla.getText());
				txtPantalla.setText("");
				operacion = "/";
			}
		});
		btnDividir.setBounds(244, 297, 68, 60);
		contentPane.add(btnDividir);
		
		JButton btnOff = new JButton("OFF");
		btnOff.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
		    System.exit(0);
		  }
		});
		btnOff.setForeground(new Color(215, 215, 215));
		btnOff.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnOff.setBackground(new Color(33, 33, 33));
		btnOff.setBounds(244, 14, 68, 60);
		contentPane.add(btnOff);
	}
}
