package epam.newYearsGift;
import java.util.*;



public class App 
{

	static void print(String message)
	{
		System.out.println(message);
	}
	
    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	try {
    		print("Enter Number of Children");
    		int numberOfChildren=scan.nextInt();
    		Vector<Children> childrens=new Vector<Children>();
    		while(numberOfChildren!=0) 
    		{
    			print("Enter Name Of Child ");
    			String name=scan.next();
                print("Enter Number of items in gift");
                int itemCount=scan.nextInt();
                ArrayList<Sweets> sweetsList=new ArrayList<Sweets>();
                while(itemCount!=0)
                {
                	print("\nPress 1 to add Chocolate. \nPress 2 to add Candy. \nPress 3 to add Cookie \nPress 4 to add Barfi");
                	int type=scan.nextInt();
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
    		
    		numberOfChildren=childrens.size();
    		for(int i=0;i<numberOfChildren;i++)
    		{
    			childrens.get(i).displayMyData();
    			print("List After sorting : ");
    			childrens.get(i).sortSweetsByWeightAndDisplay();
    		}
    	}
    	catch(Exception e)
    	{
    		System.out.print("ERROR :  ");
    		System.out.println(e.getMessage());
    	}  
    	scan.close();
    }
}
