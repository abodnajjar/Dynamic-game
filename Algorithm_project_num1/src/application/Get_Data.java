package application;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;


public class Get_Data {

	// no parameter constructor
	public Get_Data() {
		super();
		// TODO Auto-generated constructor stub
	}

	// to get the data random from 0 to 99
	public static int[] Random_Data(int n) {
		int [] array=new int[n];
		Random random = new Random();
		for(int i=0;i<n;i++) {
			// make a random number between 0 and 99
			array [i] = random.nextInt(100);  
		}
		return array;
	}

	// to get the data from file 
	public int[] File_Data(File file , int x ) throws FileNotFoundException {
		Scanner re = new Scanner(new FileInputStream (file));
		int[] array =new int[x];
		if (file.exists()!=false) {
			String first_line =re.nextLine();
			String[] a =first_line.split(",");
			try {
				int n=Integer.parseInt(a[0]);
				if (isEven(x)==true && x <= n ) {	
					for (int i=0;i<x;i++) {
						String line =re.nextLine();
						String[] b =line.split(",");
						array[i]=Integer.parseInt(b[0]);

					}
					re.close();
				}

			} catch (NumberFormatException e) {
				System.out.println("Error: Invalid input string for parsing integer: " + e.getMessage());
			}
		}
		return array;
	}

	// this method to check if the num is even or odd
	public static boolean isEven(int n) {
		if (n%2==0) {
			return true;
		}
		return false;
	} 


}
