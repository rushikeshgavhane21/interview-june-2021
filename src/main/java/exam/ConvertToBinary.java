
import java.io.*;

class ConvertToBinary {
	 public static String toBinary( int n)
	{
		int[] binary = new int[32];
		int i = 0;
		while (n > 0) {
			binary[i] = n % 2;
			n = n / 2;
			i++;
		}
		for (int j = i - 1; j >= 0; j--)
			System.out.print(binary[j]);
       return "";
	}

	public static void main(String[] args)
	{
		int n = 22;
		toBinary(n);
	}
}

