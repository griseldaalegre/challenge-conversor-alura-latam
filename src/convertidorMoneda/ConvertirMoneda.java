package convertidorMoneda;

import javax.swing.JOptionPane;

public class ConvertirMoneda {

	ConvertirMonedaAPesosArgentinos  convertidorMonedaAPesosArg = new ConvertirMonedaAPesosArgentinos();
	
	public void convertirPesosArgentinosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido * 174.59;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		System.out.println(valorRecibido);
		JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " $ Dolares");
	}
	public void convertirPesosArgentinosAEuros(double valorRecibido) {
		double monedaEuro = valorRecibido * 0.0054;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		System.out.println(valorRecibido);
		JOptionPane.showMessageDialog(null, "Tienes " + monedaEuro + " € Euros");
	}
	public void convertirPesosArgentinosALibras(double valorRecibido) {
		double monedaLibras = valorRecibido * 0.0048;
		monedaLibras = (double) Math.round(monedaLibras * 100d) / 100;
		System.out.println(valorRecibido);
		JOptionPane.showMessageDialog(null, "Tienes " + monedaLibras + " £ Libras");
	}
	public void convertirPesosArgentinosAYen(double valorRecibido) {
		double monedaYen = valorRecibido * 0.79;
		monedaYen = (double) Math.round(monedaYen * 100d) / 100;
		System.out.println(valorRecibido);
		JOptionPane.showMessageDialog(null, "Tienes " + monedaYen + "¥ Yenes");
	}
	public void convertirPesosArgentinosAWonCoreano(double valorRecibido) {
		double monedaWonCoreano = valorRecibido * 7.37;
		monedaWonCoreano = (double) Math.round(monedaWonCoreano * 100d) / 100;
		System.out.println(valorRecibido);
		JOptionPane.showMessageDialog(null, "Tienes ₩" + monedaWonCoreano + " Wones");
	}
	
	
	public void convertirMoneda () {
		// tipo de moneda

					String tipoMoneda;

					tipoMoneda = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Tipo de moneda",
							JOptionPane.QUESTION_MESSAGE, null,
							new Object[] { "Peso Argentino a Dolar", "Peso Argentino a Euros", "Peso Argentino a Libras",
									"Peso Argentino a Yen", "Peso Argentino a Won Coreano", "Dolar a Peso Argentino",
									"Euros a Peso Argentino", "Libras a Peso Argentino", "Yen a Peso Argentino",
									"Won Coreano a Peso Argentino" },
							"Seleccion")).toString();
					System.out.println(tipoMoneda);

					 ;
					switch (tipoMoneda) {
					case "Peso Argentino a Dolar": {
						String input = JOptionPane.showInputDialog("Ingrese el monto a convertir (Dolares $) ");
						Double valorRecibido = Double.parseDouble(input);
						this.convertirPesosArgentinosADolar(valorRecibido);

						System.out.println(input);
						break;
					}
					case "Peso Argentino a Euros": {
						String input = JOptionPane.showInputDialog("Ingrese el monto a convertir (Euros €)");
						Double valorRecibido = Double.parseDouble(input);
						this.convertirPesosArgentinosAEuros(valorRecibido);

						System.out.println(input);
						break;
					}
					case "Peso Argentino a Libras": {
						String input = JOptionPane.showInputDialog("Ingrese el monto a convertir (Euros £)");
						Double valorRecibido = Double.parseDouble(input);
						this.convertirPesosArgentinosALibras(valorRecibido);

						System.out.println(input);
						break;
					}
					case "Peso Argentino a Yen": {
						String input = JOptionPane.showInputDialog("Ingrese el monto a convertir (Yenes ¥)");
						Double valorRecibido = Double.parseDouble(input);
						this.convertirPesosArgentinosAYen(valorRecibido);

						System.out.println(input);
						break;
					}
					case "Peso Argentino a Won Coreano": {
						String input = JOptionPane.showInputDialog("Ingrese el monto a convertir (Wones ₩)");
						Double valorRecibido = Double.parseDouble(input);
						this.convertirPesosArgentinosAWonCoreano(valorRecibido);

						System.out.println(input);
						break;
					}

					// Dolar a pesos

					case "Dolar a Peso Argentino": {
						String input = JOptionPane.showInputDialog("Ingrese el monto a convertir ");
						Double valorRecibido = Double.parseDouble(input);
						convertidorMonedaAPesosArg.convertirDolarAPesosArgentinos(valorRecibido);

						System.out.println(input);
						break;
					}
					case "Euros a Peso Argentino": {
						String input = JOptionPane.showInputDialog("Ingrese el monto a convertir ");
						Double valorRecibido = Double.parseDouble(input);
						convertidorMonedaAPesosArg.convertirDolarAPesosArgentinos(valorRecibido);

						System.out.println(input);
						break;
					}

					case "Libras a Peso Argentino": {
						String input = JOptionPane.showInputDialog("Ingrese el monto a convertir ");
						Double valorRecibido = Double.parseDouble(input);
						convertidorMonedaAPesosArg.convertirDolarAPesosArgentinos(valorRecibido);

						System.out.println(input);
						break;
					}

					case "Yen a Peso Argentino": {
						String input = JOptionPane.showInputDialog("Ingrese el monto a convertir ");
						Double valorRecibido = Double.parseDouble(input);
						convertidorMonedaAPesosArg.convertirDolarAPesosArgentinos(valorRecibido);

						System.out.println(input);
						break;
					}

					case "Won Coreano a Peso Argentino": {
						String input = JOptionPane.showInputDialog("Ingrese el monto a convertir ");
						Double valorRecibido = Double.parseDouble(input);
						convertidorMonedaAPesosArg.convertirDolarAPesosArgentinos(valorRecibido);

						System.out.println(input);
						break;
						}
					}
	}

}
