package estaciones;

public class combinaciones {

	private int linea_inicio = 0;
	private int linea_fin = 0;
	private int estacion_inicio = 0;
	private int estacion_fin = 0;
	private String linea;

	private String[][] combinaciones = new String[7][30];

	public combinaciones() {

		// combinaciones linea 1
		combinaciones[0][0] = "L5";
		combinaciones[0][1] = "$";
		combinaciones[0][2] = "$";
		combinaciones[0][3] = "$";
		combinaciones[0][4] = "$";
		combinaciones[0][5] = "$";
		combinaciones[0][6] = "$";
		combinaciones[0][7] = "$";
		combinaciones[0][8] = "$";
		combinaciones[0][9] = "$";
		combinaciones[0][10] = "L2";
		combinaciones[0][11] = "$";
		combinaciones[0][12] = "L3";
		combinaciones[0][13] = "$";
		combinaciones[0][14] = "$";
		combinaciones[0][15] = "L5";
		combinaciones[0][16] = "$";
		combinaciones[0][17] = "$";
		combinaciones[0][18] = "$";
		combinaciones[0][19] = "L6";
		combinaciones[0][20] = "L4";
		combinaciones[0][21] = "$";
		combinaciones[0][22] = "$";
		combinaciones[0][23] = "$";
		combinaciones[0][24] = "$";
		combinaciones[0][25] = "$";
		combinaciones[0][26] = "$";
		combinaciones[0][28] = "$";
		combinaciones[0][29] = "$";

		// combinaciones linea 2
		combinaciones[1][0] = "L4A";
		combinaciones[1][1] = "$";
		combinaciones[1][2] = "$";
		combinaciones[1][3] = "$";
		combinaciones[1][4] = "$";
		combinaciones[1][5] = "$";
		combinaciones[1][6] = "$";
		combinaciones[1][7] = "$";
		combinaciones[1][8] = "L6";
		combinaciones[1][9] = "$";
		combinaciones[1][10] = "$";
		combinaciones[1][11] = "$";
		combinaciones[1][12] = "L1";
		combinaciones[1][13] = "L5";
		combinaciones[1][14] = "L3";
		combinaciones[1][15] = "$";
		combinaciones[1][16] = "$";
		combinaciones[1][17] = "$";
		combinaciones[1][18] = "$";
		combinaciones[1][19] = "$";
		combinaciones[1][20] = "$";
		combinaciones[1][21] = "$";
		combinaciones[1][22] = "$";
		combinaciones[1][23] = "$";
		combinaciones[1][24] = "$";
		combinaciones[1][25] = "$";
		combinaciones[1][26] = "$";
		combinaciones[1][27] = "$";
		combinaciones[1][28] = "$";
		combinaciones[1][29] = "$";

		// combinaciones linea 3
		combinaciones[2][0] = "$";
		combinaciones[2][1] = "$";
		combinaciones[2][2] = "$";
		combinaciones[2][3] = "$";
		combinaciones[2][4] = "$";
		combinaciones[2][5] = "$";
		combinaciones[2][6] = "L2";
		combinaciones[2][7] = "L5";
		combinaciones[2][8] = "L1";
		combinaciones[2][9] = "$";
		combinaciones[2][10] = "$";
		combinaciones[2][11] = "L5";
		combinaciones[2][12] = "$";
		combinaciones[2][13] = "L6";
		combinaciones[2][14] = "$";
		combinaciones[2][15] = "$";
		combinaciones[2][16] = "L4";
		combinaciones[2][17] = "$";
		combinaciones[2][18] = "$";
		combinaciones[2][19] = "$";
		combinaciones[2][20] = "$";
		combinaciones[2][21] = "$";
		combinaciones[2][22] = "$";
		combinaciones[2][23] = "$";
		combinaciones[2][24] = "$";
		combinaciones[2][25] = "$";
		combinaciones[2][26] = "$";
		combinaciones[2][27] = "$";
		combinaciones[2][28] = "$";
		combinaciones[2][29] = "$";

		// combinaciones linea 4
		combinaciones[3][0] = "L1";
		combinaciones[3][1] = "$";
		combinaciones[3][2] = "$";
		combinaciones[3][3] = "$";
		combinaciones[3][4] = "$";
		combinaciones[3][5] = "L3";
		combinaciones[3][6] = "$";
		combinaciones[3][7] = "$";
		combinaciones[3][8] = "$";
		combinaciones[3][9] = "$";
		combinaciones[3][10] = "$";
		combinaciones[3][11] = "$";
		combinaciones[3][12] = "L4A";
		combinaciones[3][13] = "L5";
		combinaciones[3][14] = "$";
		combinaciones[3][15] = "$";
		combinaciones[3][16] = "$";
		combinaciones[3][17] = "$";
		combinaciones[3][18] = "$";
		combinaciones[3][19] = "$";
		combinaciones[3][20] = "$";
		combinaciones[3][21] = "$";
		combinaciones[3][22] = "$";
		combinaciones[3][23] = "$";
		combinaciones[3][24] = "$";
		combinaciones[3][25] = "$";
		combinaciones[3][26] = "$";
		combinaciones[3][27] = "$";
		combinaciones[3][28] = "$";
		combinaciones[3][29] = "$";

		// combinaciones linea 5
		combinaciones[4][0] = "$";
		combinaciones[4][1] = "$";
		combinaciones[4][2] = "$";
		combinaciones[4][3] = "$";
		combinaciones[4][4] = "$";
		combinaciones[4][5] = "$";
		combinaciones[4][6] = "$";
		combinaciones[4][7] = "$";
		combinaciones[4][8] = "L1";
		combinaciones[4][9] = "$";
		combinaciones[4][10] = "$";
		combinaciones[4][11] = "$";
		combinaciones[4][12] = "$";
		combinaciones[4][13] = "$";
		combinaciones[4][14] = "L2";
		combinaciones[4][15] = "L3";
		combinaciones[4][16] = "$";
		combinaciones[4][17] = "L1";
		combinaciones[4][18] = "$";
		combinaciones[4][19] = "$";
		combinaciones[4][20] = "L3";
		combinaciones[4][21] = "L6";
		combinaciones[4][22] = "$";
		combinaciones[4][23] = "$";
		combinaciones[4][24] = "$";
		combinaciones[4][25] = "$";
		combinaciones[4][26] = "$";
		combinaciones[4][27] = "$";
		combinaciones[4][28] = "$";
		combinaciones[4][29] = "L4";

		// combinaciones linea 6
		combinaciones[5][0] = "$";
		combinaciones[5][1] = "$";
		combinaciones[5][2] = "$";
		combinaciones[5][3] = "L2";
		combinaciones[5][4] = "$";
		combinaciones[5][5] = "L5";
		combinaciones[5][6] = "$";
		combinaciones[5][7] = "L3";
		combinaciones[5][8] = "$";
		combinaciones[5][9] = "L1";
		combinaciones[5][10] = "$";
		combinaciones[5][11] = "$";
		combinaciones[5][12] = "$";
		combinaciones[5][13] = "$";
		combinaciones[5][14] = "$";
		combinaciones[5][15] = "$";
		combinaciones[5][16] = "$";
		combinaciones[5][17] = "$";
		combinaciones[5][18] = "$";
		combinaciones[5][19] = "$";
		combinaciones[5][20] = "$";
		combinaciones[5][21] = "$";
		combinaciones[5][22] = "$";
		combinaciones[5][23] = "$";
		combinaciones[5][24] = "$";
		combinaciones[5][25] = "$";
		combinaciones[5][26] = "$";
		combinaciones[5][27] = "$";
		combinaciones[5][28] = "$";
		combinaciones[5][29] = "$";

		// combinaciones linea 4a
		combinaciones[6][0] = "L4";
		combinaciones[6][1] = "$";
		combinaciones[6][2] = "$";
		combinaciones[6][3] = "$";
		combinaciones[6][4] = "$";
		combinaciones[6][5] = "L2";
		combinaciones[6][6] = "$";
		combinaciones[6][7] = "$";
		combinaciones[6][8] = "$";
		combinaciones[6][9] = "$";
		combinaciones[6][10] = "$";
		combinaciones[6][11] = "$";
		combinaciones[6][12] = "$";
		combinaciones[6][13] = "$";
		combinaciones[6][14] = "$";
		combinaciones[6][15] = "$";
		combinaciones[6][16] = "$";
		combinaciones[6][17] = "$";
		combinaciones[6][18] = "$";
		combinaciones[6][19] = "$";
		combinaciones[6][20] = "$";
		combinaciones[6][21] = "$";
		combinaciones[6][22] = "$";
		combinaciones[6][23] = "$";
		combinaciones[6][24] = "$";
		combinaciones[6][25] = "$";
		combinaciones[6][26] = "$";
		combinaciones[6][27] = "$";
		combinaciones[6][28] = "$";
		combinaciones[6][29] = "$";

	}

	public void ver_combinacion(int efin, int einicia, int lfin, int linicia) {

		this.linea_inicio = linicia;
		this.linea_fin = lfin;
		this.estacion_inicio = einicia;
		this.estacion_fin = efin;
		System.out.println(this.estacion_inicio + "|| linea inicio " + this.linea_inicio + "||" + this.estacion_fin
				+ "||linea fon " + this.linea_fin);

	}

	public int muestra_combinacion_1() {

		int pos_combi = 0;

		switch (this.linea_fin) {
		case 0:
			linea = "L1";
			break;
		case 1:
			linea = "L2";
			break;
		case 2:
			linea = "L3";
			break;
		case 3:
			linea = "L4";
			break;
		case 4:
			linea = "L5";
			break;
		case 5:
			linea = "L6";
			break;
		case 6:
			linea = "L4A";
			break;
		}

		for (int i = 0; i < 30; i++) {
			if (linea.equals(combinaciones[this.linea_inicio][i])) {
				System.out.println("combinacion " + linea);
				pos_combi = i;

			}
		}
		System.out.println(linea + " posicion: " + pos_combi);

		return pos_combi;
	}

	public int muestra_combinacion_2() {

		int pos_combi = 0;

		switch (this.linea_inicio) {
		case 0:
			linea = "L1";
			break;
		case 1:
			linea = "L2";
			break;
		case 2:
			linea = "L3";
			break;
		case 3:
			linea = "L4";
			break;
		case 4:
			linea = "L5";
			break;
		case 5:
			linea = "L6";
			break;
		case 6:
			linea = "L4A";
			break;
		}

		for (int i = 0; i < 30; i++) {
			if (linea.equals(combinaciones[this.linea_fin][i])) {
				// System.out.println("combinacion " + linea);
				pos_combi = i;

			}
		}
		// System.out.println(linea + " posicion: " + pos_combi);

		return pos_combi;
	}

}
