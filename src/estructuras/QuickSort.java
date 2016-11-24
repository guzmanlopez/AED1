package estructuras;

import dominio.Hotel;

public class QuickSort {

	// public static void quickSort(int[] vector, int primero, int ultimo) {
	//
	// int i = primero;
	// int j = ultimo;
	// int pivote = (primero + ultimo) / 2;
	// int auxiliar;
	//
	// while (i <= j) {
	// while (vector[i] < pivote)
	// i++;
	// while (vector[j] > pivote)
	// j--;
	// if (i <= j) {
	// auxiliar = vector[j];
	// vector[j] = vector[i];
	// vector[i] = auxiliar;
	// i++;
	// j--;
	// }
	// }
	//
	// if (primero < j)
	// quickSort(vector, primero, j);
	// if (ultimo > i)
	// quickSort(vector, i, ultimo);
	//
	// System.out.println(i);
	// }

	public static int partition(int arr[], int primero, int ultimo) {
		int i = primero, j = ultimo;
		int auxiliar;
		int pivote = arr[(primero + ultimo) / 2];

		while (i <= j) {
			while (arr[i] < pivote)
				i++;
			while (arr[j] > pivote)
				j--;
			if (i <= j) {
				auxiliar = arr[i];
				arr[i] = arr[j];
				arr[j] = auxiliar;
				i++;
				j--;
			}
		}
		;

		return i;
	}

	public static void quickSort(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort(arr, left, index - 1);
		if (index < right)
			quickSort(arr, index, right);
	}

	public static int partition2(ILista lista, int primero, int ultimo) {
		int i = primero, j = ultimo;
		Object auxiliar;
		int pivote = (primero + ultimo) / 2;

		while (i <= j) {

			while (((Hotel) lista.obtenerElementoI(i)).getRanking() < ((Hotel) lista.obtenerElementoI(pivote))
					.getRanking())
				i++;

			while (((Hotel) lista.obtenerElementoI(j)).getRanking() > ((Hotel) lista.obtenerElementoI(pivote))
					.getRanking())
				j--;

			if (i <= j) {
				auxiliar = lista.obtenerElementoI(i);
				lista.agregarI(lista.obtenerElementoI(j), i);
				lista.agregarI(auxiliar, j);
				i++;
				j--;
			}
		}
		;

		return i;
	}

	public static void quickSort2(ILista lista, int left, int right) {
		int index = partition2(lista, left, right);
		if (left < index - 1)
			quickSort2(lista, left, index - 1);
		if (index < right)
			quickSort2(lista, index, right);
	}

}
