package epam.newYearsGift;
import java.util.*;
/*
 * Contains Main Program of Java Project 
 * 
 * */


public class App 
{
	//------function to display messages--------------------------------------------
	static void print(String message)
	{
		System.out.println(message);
	}
	
	
	//------function to calculate total weight -------------------------------------
	static void takeGiftsAndDisplayTotalWeight(Vector<Children> childrens)
	{
	  double totalWeight=0;
	  for(Children child : childrens)
	  {
		  totalWeight+=child.weightOfMyGift();
	  }
	  System.out.println("Total Weight of All Gifts : "+totalWeight);
	}
	
	
	//-------function to display data of children ----------------------------------
	static void displayDataOfChildrens(Vector<Children> childrens)
	{
		int numberOfChildren=childrens.size();
		for(int i=0;i<numberOfChildren;i++)
		{
			childrens.get(i).displayMyData();
			print("List After sorting : ");
			childrens.get(i).sortSweetsByWeightAndDisplay();
		}
	}
	
	
	//------function to find candies based on price range----------------------------
	static void findSweetsByPrice(Vector<Children> childrens)
	{
		Scanner sc = new Scanner(System.in);
		print("We will find sweets based on range of price ");
		print("Enter lower limit of price range");
		int lowerLimit=sc.nextInt();
		print("Enter upper limit of price range");
		int upperLimit=sc.nextInt();
		for(Children child : childrens)
		{
			child.displayName();
			child.displaySweetsInGift(lowerLimit, upperLimit);
		}
		sc.close();
	}
	
	
	//-------main driver function---------------------------------------------------
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	try {
    		print("Enter Number of Children");
    		int numberOfChildren=scan.nextInt();
    		Vector<Children> childrens=new Vector<Children>();//....storing children objects....
    		while(numberOfChildren!=0) //-----getting data for each child and their gift-------------
    		{
    			print("Enter Name Of Child ");
    			String name=scan.next();
                print("Enter Number of items in gift");
                int itemCount=scan.nextInt();
                ArrayList<Sweets> sweetsList=new ArrayList<Sweets>();//.....storing list of sweets.... 
                while(itemCount!=0)
                {
                	print("\nPress 1 to add Chocolate. \nPress 2 to add Candy. \nPress 3 to add Cookie \nPress 4 to add Barfi");
                	int type=scan.nextInt();
                	if(type<=0 || type>4)
                		{print("\nEnter Correct Value Again\n");continue;}
                	print("Enter Name of the sweet");
                	String nameSweet=scan.next();
                	print("Enter Price");
                	int price=scan.nextInt();
                	print("Enter Quantity");
                	int quantity=scan.nextInt();
                	print("Enter Weight");
                	double weight=scan.nextDouble();
                	switch(type) {
                	case 1: Sweets s1=new Chocolate(nameSweet,price,quantity,weight);
                	        sweetsList.add(s1);
                	        break;
                	case 2:Sweets s2=new Candies(nameSweet,price,quantity,weight);
                			sweetsList.add(s2);
                			break;
                	case 3:Sweets s3=new Cookies(nameSweet,price,quantity,weight);
                			sweetsList.add(s3);
                			break;
                	case 4:Sweets s4=new Barfi(nameSweet,price,quantity,weight);
                			sweetsList.add(s4);
                			break;
                	default:print("Err");
                	}
                	itemCount--;
                }
                Children child=new Children(name);
                Gifts myGift=new Gifts(sweetsList);
                child.giveGift(myGift);
                childrens.add(child);
    			numberOfChildren--;
    		}
    		displayDataOfChildrens(childrens);
    		print("\n");
    		takeGiftsAndDisplayTotalWeight(childrens);
    		print("\n");
    		findSweetsByPrice(childrens);
    	}
    	catch(Exception e)
    	{
    		System.out.print("ERROR :  ");
    		System.out.println(e.getMessage());
    	}  
    	scan.close();
    }
}
