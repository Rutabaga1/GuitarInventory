package guitar.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.ArrayList;
import guitar.inventory.model.Guitar;
import guitar.inventory.model.SearchService;

/**
 * Servlet implementation class GuitarSearch
 */
@WebServlet("/GuitarSearch")
public class GuitarSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GuitarSearch() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		String search=request.getParameter("search");
		//String gType=request.getParameter("gType"); 
		char gType[]=request.getParameter("gType").toCharArray();//分开存储为数组
		 String price=request.getParameter("price");
		 String gSize=request.getParameter("gSize");
		 //String color=request.getParameter("color");
		 char color[]=request.getParameter("gType").toCharArray();
		 String seller=request.getParameter("seller");
		 //String inventory=request.getParameter("inventory");
		 
		 /*Guitar userGuitar=new Guitar();
		 userGuitar.setColor(color);
		 userGuitar.setGSize(gSize);
		 userGuitar.setGType(gType);
		 userGuitar.setPrice(Double.valueOf(price));
		 userGuitar.setSeller(seller);*/
		
		SearchService userService = (SearchService) getServletContext().getAttribute("searchService");
		List<Guitar> GuitarList=userService.getGuitars();//考虑到店铺库存数据量不大，返回全部有存货的吉他
		List<Guitar> theGuitars=new ArrayList<Guitar>();//返回最终结果
		List<Guitar> SellertheGuitars=new ArrayList<Guitar>();//接收各层筛选结果List
		List<Guitar> GSizetheGuitars=new ArrayList<Guitar>();
		List<Guitar> pricetheGuitars=new ArrayList<Guitar>();
		List<Guitar> GTypetheGuitars=new ArrayList<Guitar>();
		//List<Guitar> colortheGuitars=new ArrayList<Guitar>();
		
		if(search.equals("02")){
			if(!seller.equals("7")){                               //筛选品牌
				for (int i = 0; i < GuitarList.size(); i++) {
					Guitar guitar=GuitarList.get(i);
					if(guitar.getSeller().equals(seller)){
						SellertheGuitars.add(guitar);
					}
				}
			}else{
						SellertheGuitars=GuitarList;
			}
			if(!gSize.equals("4")){                               //筛选大小
				for (int i = 0; i < SellertheGuitars.size(); i++) {
					Guitar guitar=SellertheGuitars.get(i);
					if(guitar.getGSize().equals(gSize)){
						GSizetheGuitars.add(guitar);
					}
				}	
			}else{
				GSizetheGuitars=SellertheGuitars;
			}
			if(!price.equals("6")){                               //筛选价格
				for (int i = 0; i < GSizetheGuitars.size(); i++) {
					Guitar guitar=GSizetheGuitars.get(i);
					if(guitar.getPrice().equals(price)){
						pricetheGuitars.add(guitar);
					}
				}
			}else{
				pricetheGuitars=GSizetheGuitars;
			}
			if(gType.length!=0){                               //筛选类型
				for (int i = 0; i < pricetheGuitars.size(); i++) {
					Guitar guitar=pricetheGuitars.get(i);
					char IType[]=guitar.getGType().toCharArray();
					labe:for (int j = 0; j < gType.length; j++) {
						for (int k = 0; k < IType.length; k++) {
							if(IType[k]==color[j]){//
								GTypetheGuitars.add(guitar);
								break labe;
							}
						}
					}
				}
			}else{
				GTypetheGuitars=pricetheGuitars;
			}
			if(color.length!=0){                               //筛选颜色
				for (int i = 0; i < GTypetheGuitars.size(); i++) {
					Guitar guitar=GTypetheGuitars.get(i);
					char Icolor[]=guitar.getColor().toCharArray();
					labe:for (int j = 0; j < color.length; j++) {
						for (int k = 0; k < Icolor.length; k++) {
							if(Icolor[k]==color[j]){//
								theGuitars.add(guitar);
								break labe;
							}
						}
					}
				}
			}else{
				theGuitars=GTypetheGuitars;
			}
		}else{
			theGuitars=GuitarList;//显示全部吉他
		}
		
		request.getRequestDispatcher("GuitarSearch.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public List<Guitar> match(List<Guitar> inventoryGuitars,String search){
		List<Guitar> theGuitars=new ArrayList<Guitar>();
		
		if(search.equals("01")){
			theGuitars=inventoryGuitars;
		}else{
			
		}
		
		return theGuitars;
	}

}
