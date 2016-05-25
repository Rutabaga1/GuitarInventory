package guitar.inventory.model;

import java.util.List;


public class SearchService {
	private GuitarDAO guitarDAO;
	private InventoryDAO inventoryDAO;
	
	
	public SearchService(String WORKS,GuitarDAO guitarDAO,InventoryDAO inventoryDAO) {
        this(guitarDAO,inventoryDAO);
    }
    public SearchService(GuitarDAO guitarDAO,InventoryDAO inventoryDAO) {
		this.guitarDAO=guitarDAO;
		this.inventoryDAO=inventoryDAO;
		
	}
    
    
    public Inventory getInventory(){
    	return inventoryDAO.getInventory();
    }
    
    
    public List<Guitar> getGuitars(){
    	return guitarDAO.getGuitars();
	}
    
    public List<Guitar> getGuitars(Guitar userGuitar) {
    	return guitarDAO.getGuitars(userGuitar);
	}
    
    
    
	
}
