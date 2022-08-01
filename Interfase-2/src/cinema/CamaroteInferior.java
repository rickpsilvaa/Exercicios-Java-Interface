package cinema;

import javax.swing.JOptionPane;

public class CamaroteInferior extends VIP{
	
	public CamaroteInferior() {
		
	}
	
	public CamaroteInferior(double valor, String localização) {
		super(valor);
	}
	
	public double valorCI() {
		return getValor() * 1.4;
	}
	
	public void imprima() {
		JOptionPane.showMessageDialog(null, "Ingresso no camarote Inferior: \n"
				+ "Valor: R$ "+valorCI());
	}
	
	

}
