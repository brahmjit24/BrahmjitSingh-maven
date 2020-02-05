package epam.newYearsGift;
import java.util.ArrayList;
import java.util.Collections;
//-------gift class for children possing gifts

class Gifts{
	ArrayList<Sweets> gifts;   //creating arraylist for sweets in gift
	double totalWeight;
	//--------constructor----------------------------------------
    public Gifts(ArrayList<Sweets> gifts){
		this.gifts=gifts;
	}
    //-------function to get total number of items-----------------------------------
    public int getNumberOfItems()
    {
    	return gifts.size();
    }
    //-------function to get total weight--------------------------------------------
    public double getTotalWeight()
    {
    	int n=gifts.size();//size of arraylist
    	for(int i=0;i<n;i++)
    	{
    		totalWeight+=gifts.get(i).getWeight();
    	}
    	return totalWeight;
    }
    //-----function to sort list ----------------------------------------------------
    public void sort() {
    	Collections.sort(gifts);
    	for(Sweets s: gifts)
    		System.out.print(s.getName()+",");
    	System.out.println();
    }
    //-----function to check whether sweets lie within price range or not------------
    public void sweetsInRange(int lowerLimit,int upperLimit)
    {
    	int found=0;
    	for(Sweets s : gifts)
    	{
    		int sweetsPrice=s.getPrice();
    		if(sweetsPrice>lowerLimit&&sweetsPrice<upperLimit)
    			{
    			if(found==0)
    				System.out.print("Items Found : ");
    			System.out.print(s.getName()+" ");
    			found=1;
    			}
    	}
    	if(found==0) // -------display when no such type sweet exsits-----------
    		System.out.print("No Item in this childs gift exists with this price range");
    	System.out.println();
    }
}
