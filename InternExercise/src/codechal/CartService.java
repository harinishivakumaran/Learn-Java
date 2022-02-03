package codechal;
public class CartService {
	int totalOrderAmount = 0;
	double discount = 0;
	public int countOfBulkOrderLineItems(OrderLineItem[] orderLineItems) {
		int count = 0;
		for (int i = 0; i < orderLineItems.length; i++) {
			if (this.isBulkOrder(orderLineItems[i])) {
				count += 1;
			}
		}
		return count;
	}
	public boolean isBulkOrder(OrderLineItem oli) {
		if (oli.getQuantity()< 5)
			return false;
		else
			return true;
	}
	public double calculateOrderTotalAmount(OrderLineItem[] oiarray) {
		for (int i = 0; i < oiarray.length; i++) {
			totalOrderAmount += oiarray[i].getItemCostPerQuantity() * oiarray[i].getQuantity();
		}
		return totalOrderAmount;
	}
	public double calculateDiscount(double TotalOrderAmount) {
		if (TotalOrderAmount < 1000) {
			discount = totalOrderAmount * 0.1;
		}
		if (TotalOrderAmount < 10000) {
			discount = totalOrderAmount * 0.2;
		}
		if (TotalOrderAmount > 10000) {
			discount = totalOrderAmount * 0.3;
		}
		return discount;
	}
}
