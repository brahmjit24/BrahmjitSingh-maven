package epam.newYearsGift;

class Children{
	String name;
	Gifts mygift;
	Children(String name) {
        this.name = name;
    }
    public void giveGift(Gifts gift)
    {
    	this.mygift=gift;
    }
    public void displayMyData()
    {
        System.out.println(this.name+" : ");
        System.out.println("     Total Weight in Gift " + this.mygift.getTotalWeight());
        System.out.println("     Total Items in Gift "+this.mygift.getNumberOfItems());
        System.out.println(); 
    }
    public void sortSweetsByWeightAndDisplay()
    {
        this.mygift.sort();
    }
}