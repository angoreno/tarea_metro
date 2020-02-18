package estaciones;

public class metro {

	private int nEstacion;
	private String estacion;
	private int nLinea;
	private String[][] estaciones = new String[7][30];

	public metro() {

		// estaciones linea 1
		estaciones[0][0] = "san pablo";
		estaciones[0][1] = "neptuno";
		estaciones[0][2] = "pajaritos";
		estaciones[0][3] = "las rejas";
		estaciones[0][4] = "ecuador";
		estaciones[0][5] = "san alberto hurtado";
		estaciones[0][6] = "universidad de santiago";
		estaciones[0][7] = "estacion central";
		estaciones[0][8] = "ula";
		estaciones[0][9] = "republica";
		estaciones[0][10] = "los heroes";
		estaciones[0][11] = "la moneda";
		estaciones[0][12] = "universidad de chile";
		estaciones[0][13] = "santa lucia";
		estaciones[0][14] = "universidad catolica";
		estaciones[0][15] = "baquedano";
		estaciones[0][16] = "salvador";
		estaciones[0][17] = "manuel montt";
		estaciones[0][18] = "pedro de valdivia";
		estaciones[0][19] = "los leones";
		estaciones[0][20] = "tobalaba";
		estaciones[0][21] = "el golf";
		estaciones[0][22] = "alcantara";
		estaciones[0][23] = "escuela militar";
		estaciones[0][24] = "manquehue";
		estaciones[0][25] = "hernando de magallanes";
		estaciones[0][26] = "los dominicos";
		estaciones[0][28] = "$";
		estaciones[0][29] = "$";

		// estaciones linea 2
		estaciones[1][0] = "la cisterna";
		estaciones[1][1] = "el parron";
		estaciones[1][2] = "lo ovalle";
		estaciones[1][3] = "ciudad del niño";
		estaciones[1][4] = "departamental";
		estaciones[1][5] = "lo vial";
		estaciones[1][6] = "san miguel";
		estaciones[1][7] = "el llano";
		estaciones[1][8] = "franklin";
		estaciones[1][9] = "rondizzoni";
		estaciones[1][10] = "parque ohiggins";
		estaciones[1][11] = "toesca";
		estaciones[1][12] = "los heroes";
		estaciones[1][13] = "santa ana";
		estaciones[1][14] = "puente cal y canto";
		estaciones[1][15] = "patronato";
		estaciones[1][16] = "cerro blanco";
		estaciones[1][17] = "cementerios";
		estaciones[1][18] = "einstein";
		estaciones[1][19] = "dorsal";
		estaciones[1][20] = "zapadores";
		estaciones[1][21] = "vespicio norte";
		estaciones[1][22] = "$";
		estaciones[1][23] = "$";
		estaciones[1][24] = "$";
		estaciones[1][25] = "$";
		estaciones[1][26] = "$";
		estaciones[1][27] = "$";
		estaciones[1][28] = "$";
		estaciones[1][29] = "$";

		// estaciones linea 3
		estaciones[2][0] = "los libertadores";
		estaciones[2][1] = "cardenal caro";
		estaciones[2][2] = "vivaceta";
		estaciones[2][3] = "conchali";
		estaciones[2][4] = "plaza chacabuco";
		estaciones[2][5] = "hospitales";
		estaciones[2][6] = "puente cal y canto";
		estaciones[2][7] = "plaza de armas";
		estaciones[2][8] = "universidad de chile";
		estaciones[2][9] = "parque almagro";
		estaciones[2][10] = "matta";
		estaciones[2][11] = "irarrazaval";
		estaciones[2][12] = "monseñor eyzaguirre";
		estaciones[2][13] = "ñuñoa";
		estaciones[2][14] = "chile españa";
		estaciones[2][15] = "villa frei";
		estaciones[2][16] = "plaza egaña";
		estaciones[2][17] = "fernando castillo velasco";
		estaciones[2][18] = "$";
		estaciones[2][19] = "$";
		estaciones[2][20] = "$";
		estaciones[2][21] = "$";
		estaciones[2][22] = "$";
		estaciones[2][23] = "$";
		estaciones[2][24] = "$";
		estaciones[2][25] = "$";
		estaciones[2][26] = "$";
		estaciones[2][27] = "$";
		estaciones[2][28] = "$";
		estaciones[2][29] = "$";

		// estaciones linea 4
		estaciones[3][0] = "tobalaba";
		estaciones[3][1] = "cristobal colon";
		estaciones[3][2] = "francisco bilbao";
		estaciones[3][3] = "principe de gales";
		estaciones[3][4] = "simon bolivar";
		estaciones[3][5] = "plaza egaña";
		estaciones[3][6] = "los orientales";
		estaciones[3][7] = "grecia";
		estaciones[3][8] = "los presidentes";
		estaciones[3][9] = "quilin";
		estaciones[3][10] = "las torres";
		estaciones[3][11] = "macul";
		estaciones[3][12] = "vicuña mackenna";
		estaciones[3][13] = "vicente valdes";
		estaciones[3][14] = "rojas magallanes";
		estaciones[3][15] = "trinidad";
		estaciones[3][16] = "san jose de la estrella";
		estaciones[3][17] = "los quillayes";
		estaciones[3][18] = "elisa correa";
		estaciones[3][19] = "hospital sotero del rio";
		estaciones[3][20] = "protectora de la infancia";
		estaciones[3][21] = "las mercedes";
		estaciones[3][22] = "plaza de puente alto";
		estaciones[3][23] = "$";
		estaciones[3][24] = "$";
		estaciones[3][25] = "$";
		estaciones[3][26] = "$";
		estaciones[3][27] = "$";
		estaciones[3][28] = "$";
		estaciones[3][29] = "$";

		// estaciones linea 5
		estaciones[4][0] = "plaza de maipu";
		estaciones[4][1] = "santiago bueras";
		estaciones[4][2] = "del sol";
		estaciones[4][3] = "monte tabor";
		estaciones[4][4] = "las parcelas";
		estaciones[4][5] = "laguna sur";
		estaciones[4][6] = "barrancas";
		estaciones[4][7] = "pudahuel";
		estaciones[4][8] = "san pablo";
		estaciones[4][9] = "lo prado";
		estaciones[4][10] = "blanqueado";
		estaciones[4][11] = "gruta de lourdes";
		estaciones[4][12] = "quinta normal";
		estaciones[4][13] = "cumming";
		estaciones[4][14] = "santa ana";
		estaciones[4][15] = "plaza de armas";
		estaciones[4][16] = "bellas artes";
		estaciones[4][17] = "baquedano";
		estaciones[4][18] = "parque bustamante";
		estaciones[4][19] = "santa isabel";
		estaciones[4][20] = "irarrazaval";
		estaciones[4][21] = "ñuble";
		estaciones[4][22] = "rodrigo de araya";
		estaciones[4][23] = "carlos valdovinos";
		estaciones[4][24] = "camino agricola";
		estaciones[4][25] = "san joaquin";
		estaciones[4][26] = "pedrero";
		estaciones[4][27] = "mirador";
		estaciones[4][28] = "bellavista de la florida";
		estaciones[4][29] = "vicente valdes";

		// estaciones linea 6
		estaciones[5][0] = "cerrillos";
		estaciones[5][1] = "lo valledor";
		estaciones[5][2] = "presidente pedro aguirre cerda";
		estaciones[5][3] = "franklin";
		estaciones[5][4] = "bio bio";
		estaciones[5][5] = "ñuble";
		estaciones[5][6] = "estadio nacional";
		estaciones[5][7] = "ñuñoa";
		estaciones[5][8] = "inez de suarez";
		estaciones[5][9] = "los leones";
		estaciones[5][10] = "$";
		estaciones[5][11] = "$";
		estaciones[5][12] = "$";
		estaciones[5][13] = "$";
		estaciones[5][14] = "$";
		estaciones[5][15] = "$";
		estaciones[5][16] = "$";
		estaciones[5][17] = "$";
		estaciones[5][18] = "$";
		estaciones[5][19] = "$";
		estaciones[5][20] = "$";
		estaciones[5][21] = "$";
		estaciones[5][22] = "$";
		estaciones[5][23] = "$";
		estaciones[5][24] = "$";
		estaciones[5][25] = "$";
		estaciones[5][26] = "$";
		estaciones[5][27] = "$";
		estaciones[5][28] = "$";
		estaciones[5][29] = "$";

		// estaciones linea 4a
		estaciones[6][0] = "vicuña mackenna";
		estaciones[6][1] = "santa julia";
		estaciones[6][2] = "la granja";
		estaciones[6][3] = "santa rosa";
		estaciones[6][4] = "san ramon";
		estaciones[6][5] = "la cisterna";
		estaciones[6][6] = "$";
		estaciones[6][7] = "$";
		estaciones[6][8] = "$";
		estaciones[6][9] = "$";
		estaciones[6][10] = "$";
		estaciones[6][11] = "$";
		estaciones[6][12] = "$";
		estaciones[6][13] = "$";
		estaciones[6][14] = "$";
		estaciones[6][15] = "$";
		estaciones[6][16] = "$";
		estaciones[6][17] = "$";
		estaciones[6][18] = "$";
		estaciones[6][19] = "$";
		estaciones[6][20] = "$";
		estaciones[6][21] = "$";
		estaciones[6][22] = "$";
		estaciones[6][23] = "$";
		estaciones[6][24] = "$";
		estaciones[6][25] = "$";
		estaciones[6][26] = "$";
		estaciones[6][27] = "$";
		estaciones[6][28] = "$";
		estaciones[6][29] = "$";
	}

	public void buscar_estacion(String estacion) {// asigna la estacion a la variable

		this.estacion = estacion;
	}

	public int muestra_estacion() {// busca la estacion dentro de la matriz
		nEstacion = 0;
		nLinea = 9;

		for (int i = 0; i < 30; i++) {
			for (int j = 0; j < 7; j++) {
				if (this.estacion.equals(estaciones[j][i])) {
					nEstacion = i;
					nLinea = j;
			//cuando encuentra coincidencia, fuerzo el termino de busqueda
					i = 30;
					j = 7;
				}
			}
		}
		return nEstacion;

	}

	public int muestra_linea() {// duvuelve la linea

		
		return nLinea;
	}

	public String imprime_estacion(int e_inicio, int e_fin, int l_inicio) {

		for (int i = e_inicio; i < e_fin; i++) {
			System.out.println(estaciones[l_inicio][i]);
		}
		return "i";

	}

	public String imprime_estacion_rev(int e_inicio, int e_fin, int l_inicio) {

		for (int i = e_inicio; i > e_fin; i--) {

			System.out.println(estaciones[l_inicio][i]);
		}
		return "i";

	}

}
