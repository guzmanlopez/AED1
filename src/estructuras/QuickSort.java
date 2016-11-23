package estructuras;

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

	public static void quickSort2(int arr[], int left, int right) {
		int index = partition(arr, left, right);
		if (left < index - 1)
			quickSort2(arr, left, index - 1);
		if (index < right)
			quickSort2(arr, index, right);
	}

}
