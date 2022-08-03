package IG;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class rkk extends JFrame {

	private JPanel contentPane;
	private JTextField tfNum1;
	private JTextField tfNum2;
	private JTextField tfResultado;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rkk frame = new rkk();
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
	public rkk() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tfNum1 = new JTextField();
		tfNum1.setBounds(104, 27, 86, 20);
		contentPane.add(tfNum1);
		tfNum1.setColumns(10);
		
		tfNum2 = new JTextField();
		tfNum2.setBounds(104, 80, 86, 20);
		contentPane.add(tfNum2);
		tfNum2.setColumns(10);
		
		tfResultado = new JTextField();
		tfResultado.setBounds(104, 181, 86, 20);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
		
		JButton btnNewButton = new JButton("Somar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1;
				double num2;
				double resultado;
				
				num1 = Double.parseDouble(tfNum1.getText());
				num2 = Double.parseDouble(tfNum2.getText());
				
				resultado = num1 + num2;
				
				tfResultado.setText(""+resultado);
				
			}
		});
		btnNewButton.setBounds(211, 125, 100, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("Numero 1");
		lblNewLabel.setBounds(35, 30, 59, 14);
		contentPane.add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Numero 2");
		lblNewLabel_1.setBounds(35, 83, 59, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Resultado:");
		lblNewLabel_2.setBounds(35, 184, 70, 14);
		contentPane.add(lblNewLabel_2);
		
		btnNewButton_1 = new JButton("Subtra\u00E7\u00E3o");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(tfNum1.getText());
				double num2 = Double.parseDouble(tfNum2.getText());
				
				double resultado = num1 - num2;
				tfResultado.setText(""+resultado);
			}
		});
		btnNewButton_1.setBounds(321, 125, 99, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Subtra\u00E7\u00E3o");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num1 = Double.parseDouble(tfNum1.getText());
				double num2 = Double.parseDouble(tfNum2.getText());
				
				double resultado = num1 * num2;
				tfResultado.setText(""+resultado);
			}
		});
		btnNewButton_2.setBounds(211, 159, 100, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Divis\u00E3o");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1 = Double.parseDouble(tfNum1.getText());
				double num2 = Double.parseDouble(tfNum2.getText());
				
				if (num2 < 0) {
					tfResultado.setText("Não é possivel realizar a divisão");
				} else {
					double resultado = num1 / num2;
					tfResultado.setText(""+resultado);
				}
			}
		});
		btnNewButton_3.setBounds(321, 159, 99, 23);
		contentPane.add(btnNewButton_3);
	}
}
