package project;

public class Implementacion {

	private int n;
	private int[] k;
	// campos necesarios para computar y reconstruir la solución
	private int[][] comparaciones;
	private int[][] solucion;

	public Implementacion(int[] k) {
		this.n = k.length;
		this.k = k;
		this.comparaciones = new int[n + 1][n + 1];
		this.solucion = new int[n + 1][n + 1];
	}

	// Debe devolver un int con el costo para un árbol binario de búsqueda
	// optimal
	public int costoOptimal() {
		int[][] m = new int[n + 1][n + 1];
		for (int i = 0; i < n + 1; i++) {
			comparaciones[i][i] = 0;
			m[i][i] = 0;
			for (int j = i + 1; j < n + 1; j++) {
				m[i][j] = m[i][j - 1] + k[j - 1];
			}
		}
		for (int d = 1; d < n + 1; d++) {
			for (int j = d; j < n + 1; j++) {
				int i = j - d;
				int min = Integer.MAX_VALUE;
				for (int x = i + 1; x < j + 1; x++) {
					int aux = comparaciones[i][x - 1] + comparaciones[x][j];
					if (aux < min) {
						min = aux;
						solucion[i][j] = x;
					}
				}
				comparaciones[i][j] = m[i][j] + min;
			}
		}
		return comparaciones[0][n];
	}

	// Se llama luego de haber invocado a costoOptimal
	// Debe devolver un árbol binario optimal representado con la clase
	// ArbolBinario
	public ArbolBinario reconstruirSolucion() {
		return reconstruirSolucionAux(0, n);
	}

	private ArbolBinario reconstruirSolucionAux(int i, int j) {
		if (i == j)
			return null;
		else {
			ArbolBinario hijoIzq = reconstruirSolucionAux(i, solucion[i][j] - 1);
			ArbolBinario hijoDer = reconstruirSolucionAux(solucion[i][j], j);
			int raiz = solucion[i][j];
			return new ArbolBinario(raiz, hijoIzq, hijoDer);
		}
	}
}
