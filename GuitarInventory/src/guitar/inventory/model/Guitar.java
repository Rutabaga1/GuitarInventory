package guitar.inventory.model;

public class Guitar {
	private String gSeries;
	private String gType;//GuitarType的简写
	private String gPrice;
	private String gSize;
	private String gColor;
	private String gSeller;
	private String inventoryNum;//大于0表明仓库中有存货
	
	
	
	
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
	public String getInventoryNum() {
		return inventoryNum;
	}
	public void setInventoryNum(String inventoryNum) {
		this.inventoryNum = inventoryNum;
	}
	
	public String getGSeries() {
		return gSeries;
	}
	public void setGSeries(String gSeries) {
		this.gSeries = gSeries;
	}
	public String getGPrice() {
		return gPrice;
	}
	public void setGPrice(String gPrice) {
		this.gPrice = gPrice;
	}
	public String getGColor() {
		return gColor;
	}
	public void setGColor(String gColor) {
		this.gColor = gColor;
	}
	public String getGSeller() {
		return gSeller;
	}
	public void setGSeller(String gSeller) {
		this.gSeller = gSeller;
	}
	
}
