import java.util.*;
public class idk {

	public static void main(String[] args) {
		// Declaration of Variables
		int total=0;
		double highest=0, lowest=9999999;
		String highest_name="", lowest_name="";
		
		//Declaration of arrays
		String[]titles= {"Name", "Grade1", "Grade2", "Grade3", "Grade4", "GPA", "Letter"};
		String[]name=new String[20]; 
		int[]grade1=new int[20];
		int[]grade2=new int[20];
		int[]grade3=new int[20];
		int[]grade4=new int[20];
		double[]avg=new double[20];
		String[]letter=new String[20];
		
		//allow input
		Scanner n=new Scanner(System.in);
		
		//Loop to ask for info
		for (int i=0; i<3; i++)
		{
			total=0;
			System.out.println("Name:");
			name[i]=n.next();
			System.out.println("First grade:");
			grade1[i]=n.nextInt();
			total=(total+grade1[i]);
			System.out.println("Second grade:");
			grade2[i]=n.nextInt();
			total=(total+grade2[i]);
			System.out.println("Third grade:");
			grade3[i]=n.nextInt();
			total=(total+grade3[i]);
			System.out.println("Fourth grade:");
			grade4[i]=n.nextInt();
			total=(total+grade4[i]);
			
			//to get the average
			avg[i]=total/4;
			
			//to determine the highest and lowest
			if (avg[i]>highest)
			{
				highest=avg[i];
				highest_name=name[i];
			}
			if (avg[i]<lowest)
			{
				lowest=avg[i];
				lowest_name=name[i];
			}
			
			//to determine the letter grade
			if (avg[i]<60)
			{
				letter[i]="F";
			}
			if (avg[i]<70)
			{
				letter[i]="D";
			}
			if (avg[i]<80)
			{
				letter[i]="C";
			}
			if (avg[i]<90)
			{
				letter[i]="B";
			}
			if (avg[i]>89)
			{
				letter[i]="A";
			}
			System.out.println();
			System.out.println();
			
		}
		System.out.println();
		System.out.println();
		
		//loop to display titles
		for (int i=0; i<7; i++)
		{
			System.out.printf("%-10s", titles[i]);
		}
		System.out.println();
		
		//loop to display names and grades
		for (int i=0; i<3; i++)
		{
			System.out.printf("%-10s", name[i]);
			System.out.printf("%-10d", grade1[i]);
			System.out.printf("%-10d", grade2[i]);
			System.out.printf("%-10d", grade3[i]);
			System.out.printf("%-10d", grade4[i]);
			System.out.printf("%-10.1f", avg[i]);
			System.out.printf("%-10s", letter[i]);
			System.out.println();
		}
		
		//to display highest and lowest grades
		System.out.printf("The highest grade is %-10.1f", highest);
		System.out.printf("received by %-10s", highest_name);
		System.out.println();
		System.out.printf("The lowest grade is %-10.1f", lowest);
		System.out.printf("received by %-10s", lowest_name);
		
		
		
	}

}
