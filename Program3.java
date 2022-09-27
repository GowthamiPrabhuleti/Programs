import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the 'n' value");
		int n =scan.nextInt();
		for(int i=1;i<=n-1;i++)
		{
			for(int j=1;j<=i;j+=2)
			{
				System.out.print(j);
				
			}
			System.out.println();
		}
		

	}

}
