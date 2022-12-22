package convertidorMoneda;

import javax.swing.JOptionPane;

public class ConvertirMonedaAPesosArgentinos {
	
	double valorPesoArgentino = 174.59;
	
	public void convertirDolarAPesosArgentinos(double valorRecibido) {	
		double monedaPeso = valorPesoArgentino * valorRecibido;
		monedaPeso = (double) Math.round(monedaPeso * 100d) / 100;
		System.out.println(valorRecibido);
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + "Pesos Argentinos");
	}
	
	public void convertirEuroAPesosArgentinos(double valorRecibido) {	
		double monedaPeso = valorPesoArgentino * valorRecibido ;
		monedaPeso = (double) Math.round(monedaPeso * 100d) / 100;
		System.out.println(valorRecibido);
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + "Pesos Argentinos");
	}
	
	public void convertirLibrasAPesosArgentinos(double valorRecibido) {	
		double monedaPeso = valorPesoArgentino * valorRecibido ;
		monedaPeso = (double) Math.round(monedaPeso * 100d) / 100;
		System.out.println(valorRecibido);
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + "Pesos Argentinos");
	}
	
	public void convertirYenAPesosArgentinos(double valorRecibido) {	
		double monedaPeso = valorPesoArgentino * valorRecibido ;
		monedaPeso = (double) Math.round(monedaPeso * 100d) / 100;
		System.out.println(valorRecibido);
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaPeso + "Pesos Argentinos");
	}

}
