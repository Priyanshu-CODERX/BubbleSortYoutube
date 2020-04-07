public class BubbleSort {
	// This can be optimized
	public static void main(String[] args) {

		int arr[] = { 12, 5, 0, 3, 6, 1 }; // 12 = 0; 5 = 1;
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;

				}
			}
		}

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
