package Model;

public class ProductDetails
{
   private  String id;
   private String name;
   private  int cost;
    private int delivery;
    
    
	public ProductDetails(String id, String name, int cost, int delivery) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.delivery = delivery;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public int getDelivery() {
		return delivery;
	}

	public void setDelivery(int delivery) {
		this.delivery = delivery;
	}
	
    
}
