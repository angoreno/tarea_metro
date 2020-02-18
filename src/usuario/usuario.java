package usuario;

import javax.swing.*;
import estaciones.*;

public class usuario {

	public static void main(String[] args) {
		// TODO Apéndice de método generado automáticamente

		String lineai = "";
		String lineaf = "";

		int estacion_i = 0;
		int estacion_f = 0;
		int linea_i = 0;
		int linea_f = 0;
		int combi1 = 0;
		int combi2 = 0;

		boolean muestra = true;

		metro estacion = new metro();
		combinaciones combinacion = new combinaciones();

		JOptionPane.showMessageDialog(null, "Ingresar estacion de inicio y estacion de fin para entregar el recorrido");

		// solicita el ingreso de la estacion de inicio
		lineai = JOptionPane.showInputDialog("Ingrese estacion de inicio");

		// busca la estacion y trae el numero de la estacion y la linea
		estacion.buscar_estacion(lineai);

		// trae el numero de la estacion y la linea
		estacion_i = estacion.muestra_estacion();
		linea_i = estacion.muestra_linea();

		// solicita el ingreso de la estacion de fin
		lineaf = JOptionPane.showInputDialog("Ingrese estacion de termino");

		// busca la estacion y trae el numero de la estacion y la linea
		estacion.buscar_estacion(lineaf);

		// trae el numero de la estacion y la linea
		estacion_f = estacion.muestra_estacion();
		linea_f = estacion.muestra_linea();

		if (linea_i == linea_f) {
			if (estacion_i < estacion_f) {
				estacion.imprime_estacion(estacion_i, estacion_f + 1, linea_i);

			} else {
				estacion.imprime_estacion_rev(estacion_i, estacion_f - 1, linea_i);

			}

		} else {

			// busca la combinacion mas cercana de la linea
			combinacion.ver_combinacion(estacion_f, estacion_i, linea_f, linea_i);
			combi1 = combinacion.muestra_combinacion_1();
			combi2 = combinacion.muestra_combinacion_2();

			if (estacion_i < combi1) {
				estacion.imprime_estacion(estacion_i, combi1 + 1, linea_i);

			} else {
				estacion.imprime_estacion_rev(estacion_i, combi1 - 1, linea_i);
			}

			if (combi2 < estacion_f) {
				estacion.imprime_estacion(combi2, estacion_f + 1, linea_f);

			} else {
				estacion.imprime_estacion_rev(combi2, estacion_f - 1, linea_f);
			}

		}

	}

}
