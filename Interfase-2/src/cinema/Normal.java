package cinema;

import javax.swing.JOptionPane;

public class Normal extends Ingresso{

public Normal() {
		
	}
	
	public Normal(double valor) {
		super(valor);
	}

    public void imprima() {
    	JOptionPane.showMessageDialog(null, "Ingresso Normal: \n"
    			+"Valor: R$"+this.getValor());
    }
}
