package epam.newYearsGift;

//------base class sweets being inherited in several classes-------------------
/*
 * implementing comparable so as to sort sweets based on weight
 * in linear order*/
class Sweets implements Comparable<Sweets> {
	    String name;
	    int price;
	    int quantity;
	    double weight;
	    Sweets(){}
	    Sweets(String name,int price,int quantity,double weight){
	    	this.name=name;
	    	this.price=price;
	    	this.quantity=quantity;
	    	this.weight=weight;
	    }
	    String getName() {
	    	return name;
	    }
	    double getWeight() {
	    	return weight;
	    } 
	    int getPrice() {
	    	return price;
	    }
	    public int compareTo(Sweets comparestu) {
	        double compareWeight=((Sweets)comparestu).getWeight();
	        return (int)(this.getWeight()-compareWeight);
	    }
	} 
