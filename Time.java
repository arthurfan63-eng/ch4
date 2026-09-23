
import java.util.Scanner;

public class Time{

public static void euTime( int day, String month, int year, String date){
	System.out.print(date +" "+ day +" " + month + ", " + year);
	
}

public static void americaTime(int day, String month, int year, String date){
	System.out.print(date +", "+ month +" " + day + ", " + year);
	
}



public static void main(String[] args){
	Scanner in = new Scanner(System.in);
	
	System.out.println("enter month, day, year, and date respectivly");
	
	int day;
	int year;
	String month;
	
	month = in.nextLine();
	day = in.nextInt();
	 year = in.nextInt();
     in.nextLine();
	String date = in.nextLine();

	System.out.println("What flavor? American or European");
	
	String flavor = in.nextLine();
	
	if (flavor == "American"){
		americaTime(day,month,year,date);	
	}else{
		americaTime(day,month,year,date);	
	}
	
	







}
}

