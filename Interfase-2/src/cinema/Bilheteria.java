package cinema;

import javax.swing.JOptionPane;

public class Bilheteria {

	public static void main(String[] args) {
		
		double valor;
		int op;
		
		valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor padrão do ingresso: "));

		for(;;) {
			op = Integer.parseInt(JOptionPane.showInputDialog("Qual ingresso deseja? \n"
					+ "1 - Normal \n"
					+ "2 - VIP \n"
					+ "3 - Camarote Inferior \n"
					+ "4 - Camarote superior \n"
					+ "5 - Finalizar"));
			
			if (op == 1) {
				
				Normal no = new Normal(valor);
				no.imprima();
				
			} else if (op == 2) {
				
				VIP vi = new VIP(valor);
				vi.imprima();
				
			}else if (op == 3) {
				
				CamaroteInferior ci = new CamaroteInferior(valor, null);
				ci.imprima();
				
			} else if (op == 4) {
				
				CamaroteSuperior cs = new CamaroteSuperior(valor);
				cs.imprima();
				
			} else if (op == 5) {
				
				JOptionPane.showMessageDialog(null, "Finalizando...");
				break;
				
			} else {
				
				JOptionPane.showMessageDialog(null, "Opção Invalida");
				
			}
			
			
		}
		
		
	}

}
