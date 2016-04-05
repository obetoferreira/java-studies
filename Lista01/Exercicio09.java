class Exercicio09 {
	public static void main(String[] args) {
		
		int n = 3;
		int[][] myArray = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				myArray[i][j] = myFunc.randInt(0, n * n);
				System.out.print(myArray[i][j] + " ");
				if ((j + 1) % 3 == 0) {
					System.out.print("\n");
				}
			}
		}

		System.out.println("-----");
		
		for (int i = 0; i < n; i++) {
			System.out.print(myArray[i][i] + " " );
		}

	}
}