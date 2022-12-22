package convertidorMoneda;

import javax.swing.JOptionPane;

public class ConvertidorTemperatura {

	public void ConvertirCelsiusAFahrenheit(double valorRecibidoTemperatura) {

		double resultado = 9 / 5.0 * valorRecibidoTemperatura + 32;
		JOptionPane.showMessageDialog(null, "Son " + resultado + " grados Fahrenheit");

		System.out.println(resultado);

	}

	public void ConvertirFahrenheitACelsius(double valorRecibidoTemperatura) {

		double resultado = (valorRecibidoTemperatura - 32) * 5 / 9;
		JOptionPane.showMessageDialog(null, "Son " + resultado + " grados Celsius");

		System.out.println(resultado);
	}

	public void convertirTemperatura() {

		String tipoGrados;

		tipoGrados = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Tipo de grados",
				JOptionPane.QUESTION_MESSAGE, null,
				new Object[] { "Grados Celsius a Fahrenheit", "Grados Fahrenheit a Celsius" }, "Seleccion")).toString();
		System.out.println(tipoGrados);

		switch (tipoGrados) {
		case "Grados Celsius a Fahrenheit": {
			String input = JOptionPane.showInputDialog("Ingrese Temperatura");
			Double temperaturaRecibida = Double.parseDouble(input);
			this.ConvertirCelsiusAFahrenheit(temperaturaRecibida);
			break;

		}
		case "Grados Fahrenheit a Celsius": {
			String input = JOptionPane.showInputDialog("Ingrese Temperatura");
			Double temperaturaRecibida = Double.parseDouble(input);
			this.ConvertirFahrenheitACelsius(temperaturaRecibida);
			break;

		}
		}
	}

}
