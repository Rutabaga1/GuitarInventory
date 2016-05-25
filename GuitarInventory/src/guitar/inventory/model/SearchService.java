package guitar.inventory.model;

import java.util.List;


public class SearchService {
	private GuitarDAO guitarDAO;
	
	
	public SearchService(String WORKS,GuitarDAO guitarDAO) {
        this(guitarDAO);
    }
    public SearchService(GuitarDAO guitarDAO) {
		this.guitarDAO=guitarDAO;
		
		
	}
    
    
    public List<Guitar> getGuitars(){
    	return guitarDAO.getGuitars();
	}
    
    
    
    
	
}
