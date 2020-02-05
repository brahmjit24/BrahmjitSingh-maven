package epam.newYearsGift;
//-----------Children class-----------------------------------------
class Children{
	String name;
	Gifts mygift;
	Children(String name) {
        this.name = name;
    }
	//--------taking gift and storing data--------------------------
    public void giveGift(Gifts gift)
    {
    	this.mygift=gift;
    }
    //-------func. to display name----------------------------------
    public void displayName()
    {
    	System.out.println("Name : "+name);
    }
    //-------function to display base data--------------------------
    public void displayMyData()
    {
        System.out.println(this.name+" : ");
        System.out.println("     Total Weight in Gift " + this.mygift.getTotalWeight());
        System.out.println("     Total Items in Gift "+this.mygift.getNumberOfItems());
        System.out.println(); 
    }
    //-------function to sort sweets by weight and display-----------
    public void sortSweetsByWeightAndDisplay()
    {
        this.mygift.sort();
    }
    //-------function to return weight of childs gift----------------
    public double weightOfMyGift()
    {
    	return this.mygift.getTotalWeight();
    }
    //-------function to display sweets in gifts in given range-------
    public void displaySweetsInGift(int lowerLimit,int upperLimit)
    {
    	this.mygift.sweetsInRange(lowerLimit,upperLimit);
    }
}