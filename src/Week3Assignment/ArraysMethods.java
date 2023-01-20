package Week3Assignment;
import java.util.Scanner;
public class ArraysMethods {
	public static void main(String [] args) {
		
		//1.	Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages= {3, 9, 23, 64, 2, 8, 28, 93};
		
	//	a.	Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		//(i.e. do not use ages[7] in your code). Print the result to the console.  
		
		System.out.println(ages[ages.length-1]-ages[ages.length-ages.length]);
		
		//b.	Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int [] ages2= {3, 9, 23, 64, 2, 8, 28, 93,82};
		System.out.println(ages2[ages2.length-1]-ages2[ages2.length-ages2.length]);
		

	//	c.	Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int avgage=0;
		for(int age:ages){
			age += age;
			avgage=age/ages.length;
		}
		System.out.println("Average age is: " +avgage);
		
		//2.	Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};
		
		//a.	Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		int sumLet=0;
		int avgLet=0;
		for(String name:names) {
			sumLet +=name.length();	
		}
		avgLet=sumLet/names.length;
		System.out.println("Average number of Letter in string is : " +avgLet);
		
	//	b.	Use a loop to iterate through the array again and concatenate all the names  together, separated by spaces, and print the result to the console.
		String nameConcat="";
		for(String name:names) {
			nameConcat += name + " ";
		}
		System.out.println(nameConcat);
		
		
	//	3.	How do you access the last element of any array?
		System.out.println("Last element of array can be traversed by array[array.length-1] : "+names[names.length-1]);
	
				
	 // 4.	How do you access the first element of any array?
	  System.out.println("First element of array can be traversed by array[array.length-array.length] or array[0] : "+names[0]);
	  
	  //5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array
		 //*  and add the length of each name to the nameLengths array.
	  int[] nameLengths= new int[names.length];
	  for(int i=0;i<names.length;i++) {
		  nameLengths[i]=names[i].length();
	  }
	  
	  //6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
	  int sumNameLengths=0;
	  for(int length:nameLengths) {
		  sumNameLengths += length;
	  }
	  System.out.println("sum of Namelengths array is : " +sumNameLengths);
	  
//	  7.	Write a method that takes a String word, and an int n, as arguments and returns the word concatenated to itself n number of times. 
//		(i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
	  String word="hello";
	  int n=3;
	  String res=stringMultiplier(word,n);
	  System.out.println(word +" concatenated " +n +" times" +" is " +res);
	  
	  //8.	Write a method that takes two Strings, firstName and lastName, and returns a full name 
		//(the full name should be the first and the last name as a String separated by a space).
	  String firstName="John";
	  String lastName="Roy";
	  String fullName=stringConcat(firstName,lastName);
	  System.out.println(firstName +"+" +lastName +" is " +fullName);
	  
	  //9.	Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
	  int [] intnbrs= {23,2,4,5,8,10,26,32};
	  boolean value=sumArray(intnbrs);
	  System.out.println(value);
	  
	  //	10.	Write a method that takes an array of double and returns the average of all the elements in the array.
	 double [] dnbrs= {2.9,24.8,30,45,60,43};
	 double avg=average(dnbrs);
	 System.out.println("Average of double elements given is : " +avg);
	 
	 //11.	Write a method that takes two arrays of double and 
		//returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
	  double [] nbr1= {12,34.6,45,32,12};
	  double [] nbr2= {1,34,56,78,23.8};
	  boolean avgValue=doubleArray(nbr1,nbr2);
	  System.out.println("Average of first Array is greater than second array : " +avgValue);
	  
	//  12.	Write a method called willBuyDrink that takes a boolean isHotOutside, 
	 // and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
	  double moneyInPocket=11.50;
	  boolean isHotOutside=true;
	  boolean willBuy=willBuyDrink(isHotOutside,moneyInPocket);
	  System.out.println("Is hot " +isHotOutside  + " and " +moneyInPocket +" is greatern than 10.50 " +willBuy);
	  
	/*	
		13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
*/
	Scanner s = new Scanner(System.in);	
	int loop=1;
	while(loop>0) {
	display();
	int x=s.nextInt();
	if(x>0 &&x<5) {
	System.out.println("enter number1");
	int y=s.nextInt();
	System.out.println("enter number2");
	int z=s.nextInt();
	  calculator(x,y,z);
	}
	else if(x==0) {
		System.out.println("Exiting calculator app");
		loop=-1;
	}
	else {
		System.out.println("Please enter valid number");
		loop =-1;
	}
	}
	s.close();
	  
	}

	private static void calculator(int x, int y, int z) {
		switch (x) {
			case 1:
			System.out.println(y+z);
			break;
			case 2:
				System.out.println(y-z);
				break;
				
			case 3:
				System.out.println(y*z);
				break;
				
			case 4:
				System.out.println(y/z);
				break;
			default:
					break;
				
		}
		
	}

	private static void display() {
		System.out.println("Let us know what operation you would like to perform ");
		System.out.println("1.Add");
		System.out.println("2.Subtract");
		System.out.println("3.Multiply");
		System.out.println("4.Division");
		System.out.println("0.Exit");
		
	}

	private static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside && moneyInPocket>10.50) {
			return true;
		}
		return false;
	}

	private static boolean doubleArray(double[] nbr1, double[] nbr2) {
		double sum1=0;
		double sum2=0;
		for(double n1 : nbr1) {
			sum1 += n1;
		}
		for(double n2 : nbr2) {
			sum2 += n2;
		}
		if((sum1/nbr1.length) > (sum2/nbr2.length)){
			return true;
		}
		
		return false;
	}

	private static double average(double[] dnbrs) {
		double sum=0;
		for(double nbrs:dnbrs) {
			sum += nbrs;
		}
		return sum/dnbrs.length;
	}

	private static boolean sumArray(int[] nbrs) {
		int sum=0;
		for(int nbr:nbrs) {
			sum += nbr;
			if(sum>100) {
				return true;
			}
		}
		return false;
	}

	private static String stringConcat(String firstName, String lastName) {
		String fullName = firstName +" " + lastName;
		return fullName;
	}

	private static String stringMultiplier(String word, int n) {
		String multiplier="";
		for(int i=0;i<n;i++) {
			multiplier += word;
		}
		return multiplier;
	} 
	
	

}
