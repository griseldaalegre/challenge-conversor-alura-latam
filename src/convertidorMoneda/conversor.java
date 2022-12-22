package convertidorMoneda;

//import java.awt.Component;

import javax.swing.JOptionPane;

public class conversor {
	private static String menu;

	public static void main(String[] args) {

		var convertidor2 = new ConvertirMoneda();

		var ConvertidorTemperatura1 = new ConvertidorTemperatura();

		menu = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu",
				JOptionPane.QUESTION_MESSAGE, null, new Object[] { "Conversor de Moneda", "Conversor de Temperatura" },
				"Seleccion")).toString();
		System.out.println(menu);

		switch (menu) {
		case "Conversor de Moneda": {

			convertidor2.convertirMoneda();
			break;
		}

		case "Conversor de Temperatura": {

			ConvertidorTemperatura1.convertirTemperatura();
			break;

		}
		}

	}

}
