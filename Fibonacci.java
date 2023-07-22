package week1.day1Assignments;

public class Fibonacci {

	public static void main(String[] args) {
		int firstnum = 0, secnum = 1, sum=0,i;
		System.out.println("Fibbinocci series for first 11 numbers:");
		System.out.print( " "+firstnum);
		System.out.print( " "+secnum);
		for (i = 0; i <=11 ; i++)
		{
			sum = firstnum + secnum;
			System.out.print(" " +sum);
			firstnum = secnum;
			secnum = sum;
		}

	}
}