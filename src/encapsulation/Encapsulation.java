package encapsulation;

public class Encapsulation {
public static void main(String[] args) {
	
	Device d1 = new Device();
	d1.setPrice(13444);
	
}

}

class Device{
	int storage;
	private int price;
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		
		boolean isAdmin = false;
		if(!isAdmin) {
			System.out.println("You cant set price");
		}
		else {
		this.price = price;
		}
	}
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	
	
}
