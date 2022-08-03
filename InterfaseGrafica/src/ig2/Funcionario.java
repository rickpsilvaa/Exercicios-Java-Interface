package ig2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Funcionario extends JFrame {

	private JPanel contentPane;
	private JTextField tfNome;
	private JTextField tfCargo;
	private JTextField tfSalario;
	private JTextField tfResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Funcionario frame = new Funcionario();
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
	public Funcionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel.setBounds(10, 11, 46, 20);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cargo:");
		lblNewLabel_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 47, 46, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Salario");
		lblNewLabel_2.setFont(new Font("SansSerif", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 83, 46, 20);
		contentPane.add(lblNewLabel_2);
		
		tfNome = new JTextField();
		tfNome.setBounds(66, 13, 86, 20);
		contentPane.add(tfNome);
		tfNome.setColumns(10);
		
		tfCargo = new JTextField();
		tfCargo.setBounds(66, 49, 86, 20);
		contentPane.add(tfCargo);
		tfCargo.setColumns(10);
		
		tfSalario = new JTextField();
		tfSalario.setBounds(66, 85, 86, 20);
		contentPane.add(tfSalario);
		tfSalario.setColumns(10);
		
		JButton btnNewButton = new JButton("AUMENTAR SALARIO");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = tfNome.getText();
				String cargo = tfCargo.getText();
				double salario = Double.parseDouble(tfSalario.getText());
				double sal;
				
				if (salario <= 1500) {
					sal = salario * 1.3;
				} else if (salario <= 2000) {
					sal = salario * 1.2;
				} else {
					sal = salario * 1.1;
				}
				
				tfResultado.setText(""+nome+"\nCargo: "+cargo+"\nNovo Salario: R$"+sal);
				
			}
		});
		btnNewButton.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnNewButton.setBounds(10, 132, 207, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("DIMINUIR SALARIO");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = tfNome.getText();
				String cargo = tfCargo.getText();
				double salario = Double.parseDouble(tfSalario.getText());
				double sal;
				
				if (salario <= 1500) {
					sal = salario * 0.9;
				} else if (salario <= 2000) {
					sal = salario * 0.8;
				} else {
					sal = salario * 0.7;
				}
				
				tfResultado.setText(""+nome+" Cargo: "+cargo+" Novo Salario: R$"+sal);
			}
		});
		btnNewButton_1.setFont(new Font("SansSerif", Font.PLAIN, 15));
		btnNewButton_1.setBounds(253, 132, 171, 23);
		contentPane.add(btnNewButton_1);
		
		tfResultado = new JTextField();
		tfResultado.setBounds(10, 166, 414, 84);
		contentPane.add(tfResultado);
		tfResultado.setColumns(10);
	}
}
