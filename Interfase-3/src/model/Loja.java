package model;

import javax.swing.JOptionPane;

public class Loja {

	public static void main(String[] args) {
		
		String nome, autor;
		double preco;
		int faixa, minutos, op;
		
		
		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"--- CADASTRO DOS PRODUTOS ---\n"
					+ "--- 1 CD \n"
					+ "--- 2 DVD \n"
					+ "--- 3 Livro \n"
					+ "--- 4 Finalizar"));
			
			if (op == 1) {
				
				nome = JOptionPane.showInputDialog("Nome do CD: ");
				preco = Double.parseDouble(JOptionPane.showInputDialog("Pre�o do CD: "));
				faixa = Integer.parseInt(JOptionPane.showInputDialog("Faixas do CD: "));
				
				CD cd = new CD(nome, preco, faixa);
				cd.Imprime();
				
			} else if (op == 2) {
				
				nome = JOptionPane.showInputDialog("Nome do filme: ");
				preco = Double.parseDouble(JOptionPane.showInputDialog("Pre�o do filme: "));
				minutos = Integer.parseInt(JOptionPane.showInputDialog("Minutos do filme: "));
				
				DVD dvd = new DVD(nome, preco, minutos);
				dvd.Imrpime();
				
			} else if (op == 3) {
				
				nome = JOptionPane.showInputDialog("Nome do Livro: ");
				autor = nome = JOptionPane.showInputDialog("Nome do autor: ");
				preco = Double.parseDouble(JOptionPane.showInputDialog("pre�o do Livro: "));
				
				Livro livro = new Livro(nome, preco, autor);
				livro.Imprime();
				
			} else if (op == 4) {
				
				JOptionPane.showMessageDialog(null, "Encerrando...");
				break;
				
			} else {
				
				JOptionPane.showMessageDialog(null, "Op��o invalida");
				
		}

	}

}
}