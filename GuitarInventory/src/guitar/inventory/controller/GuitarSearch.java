package guitar.inventory.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String gType=request.getParameter("gType");//分开存储为数组
		 String price=request.getParameter("price");
		 String gSize=request.getParameter("gSize");
		 String color=request.getParameter("color");
		
		 String seller=request.getParameter("seller");
		 //String thetime=request.getParameter("oldtime");
		 //String reason=request.getParameter("newsection");
		 Guitar userGuitar=new Guitar();
		 userGuitar.setColor(color);
		 userGuitar.setGSize(gSize);
		 userGuitar.setGType(gType);
		 userGuitar.setPrice(Double.valueOf(price));
		 userGuitar.setSeller(seller);
		
		SearchService userService = (SearchService) getServletContext().getAttribute("searchService");
		if(search.equals("01")){
			userService.getGuitars();
		}else{
			userService.getGuitars(userGuitar);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
