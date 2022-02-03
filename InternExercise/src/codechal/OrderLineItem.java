package codechal;
public class OrderLineItem {
	private String itemId;
	private String itemName;
	private double itemCostPerQuantity;
	private int quantity;

	public OrderLineItem(String itemId, String itemName, double itemCostPerQuantity, int quantity) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemCostPerQuantity = itemCostPerQuantity;
		this.quantity = quantity;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemCostPerQuantity() {
		return itemCostPerQuantity;
	}
	public void setItemCostPerQuantity(double itemCostPerQuantity) {
		this.itemCostPerQuantity = itemCostPerQuantity;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
