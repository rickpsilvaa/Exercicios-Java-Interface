package cinema;

import javax.swing.JOptionPane;

public class CamaroteSuperior extends VIP{
	
	public CamaroteSuperior() {
		
	}
	
	public CamaroteSuperior(double valor) {
		super(valor);
	}
	
	public double valorCS() {
		return getValor()*1.6;
	}
	
	public void imprima() {
		JOptionPane.showMessageDialog(null, "Ingresso Camarote Superior: /n"
				+"Valor: R$"+valorCS());
	}


}
