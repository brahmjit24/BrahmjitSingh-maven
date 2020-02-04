package epam.newYearsGift;


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
	        double compareage=((Sweets)comparestu).getWeight();
	        return (int)(this.getWeight()-compareage);
	    }
	} 
