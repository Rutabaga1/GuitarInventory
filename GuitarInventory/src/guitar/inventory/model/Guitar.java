package guitar.inventory.model;

public class Guitar {
	private String serialNumber;
	private String gType;//GuitarType的简写
	private Double price;
	private String gSize;
	private String color;
	private String seller;
	private int inventoryNum;//大于0表明仓库中有存货
	
	
	public String getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	
	public String getGSize() {
		return gSize;
	}
	public void setGSize(String gSize) {
		this.gSize = gSize;
	}
	public String getGType() {
		return gType;
	}
	public void setGType(String gType) {
		this.gType = gType;
	}
	public int getInventoryNum() {
		return inventoryNum;
	}
	public void setInventoryNum(int inventoryNum) {
		this.inventoryNum = inventoryNum;
	}
	
}
