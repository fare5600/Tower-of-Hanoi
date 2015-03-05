import java.util.Scanner;


public class Driver 
{
	
	public static void main(String[] args)
	{
		Tower t = new Tower();
		Tower t2= new Tower();
		Tower t3= new Tower();
		System.out.println("Enter number of disks");
		Scanner input = new Scanner(System.in);
		while(true)
		{
		System.out.print("=> ");
		String val = input.nextLine().trim();
		System.out.println("*******");
		t.addDisc(new Disc(2));
		t.addDisc(new Disc(1));
		t.addDisc(new Disc(0));
		t.addDisc(new Disc(2));
		t.display();
		
		System.out.println("Move which disk?");
		Scanner input1 = new Scanner(System.in);
		while(true)
		{
		System.out.print("=> ");
		String val1 = input.nextLine().trim();
		System.out.println("*******");
		//System.out.println(t.removeDisc());
		//System.out.println(t.removeDisc());
		//System.out.println(t.removeDisc());
	}
    
	}
	}}
