import java.util.Scanner;
public class DigitCount{
	public static void main(String args[]){
		Scanner snr=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=snr.nextInt();
		int count=0;
		int num=number;
		while(num>0){
			num=num/10;
			count++;
		}
		System.out.println("The number of digits are: " + count);
	}
}