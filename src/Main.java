import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);              // make scanner object
		System.out.print("Enter amount of Data: ");             // prompt user to Enter total amount of data
		int n = scanner.nextInt();
		double[] user_data = new double[n];                     //making Dynamic Array
		System.out.print("Enter Data: ");                       // prompt user to enter Data
		for (int i = 0; i < n; i++) {
			user_data[i] = scanner.nextInt();                   // Getting Data in array
		}
		Arrays.sort(user_data);
		double median;
		if (user_data.length % 2 == 0) {
			double mid1 = user_data[user_data.length / 2 - 1];
			double mid2 = user_data[user_data.length / 2];
			median = (mid1 + mid2) / 2;
		} else {
			median = user_data[user_data.length / 2];
		}
		System.out.println(median);
	}
}
