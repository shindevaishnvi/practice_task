package task_30_10;

public class Product {
	    private double price;
	    private double discount;

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setDiscount(double discount) {
	        this.discount = discount;
	    }

	    public double getDiscount() {
	        return discount;
	    }

	    public double calculateDiscount() {
	        return getPrice() - (getPrice() * getDiscount() / 100);
	    }
	}
