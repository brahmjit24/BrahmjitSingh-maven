package epam.newYearsGift;
import java.util.ArrayList;
import java.util.Collections;

class Gifts{
	ArrayList<Sweets> gifts;   //creating new generic arraylist  
	double totalWeight;
    public Gifts(ArrayList<Sweets> gifts){
		this.gifts=gifts;
	}
    public int getNumberOfItems()
    {
    	return gifts.size();
    }
    public double getTotalWeight()
    {
    	int n=gifts.size();//size of arraylist
    	for(int i=0;i<n;i++)
    	{
    		totalWeight+=gifts.get(i).getWeight();
    	}
    	return totalWeight;
    }
    public void sort() {
    	Collections.sort(gifts);
    	for(Sweets s: gifts)
    		System.out.print(s.getName()+",");
    	System.out.println();
    }
}
