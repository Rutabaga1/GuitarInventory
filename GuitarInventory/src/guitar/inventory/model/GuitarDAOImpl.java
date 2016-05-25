package guitar.inventory.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


public class GuitarDAOImpl implements GuitarDAO{
	private DataSource datasource;
	public GuitarDAOImpl(DataSource datasource){
		this.datasource=datasource;
	}
	
	
	@Override
	public List<Guitar> getGuitars() {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<Guitar> administrators=null;
		Guitar administrator=null;
		//int cccc=0;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT Cname,Cplace FROM Guitar");
			/*stmt.setString(1, admin.getCname());
			stmt.setString(2, admin.getCplace());*/
			ResultSet rs=stmt.executeQuery();
			administrators=new ArrayList<Guitar>();
			while(rs.next()){
				administrator=new Guitar();
				administrator.setColor(rs.getString("color"));
				//administrator.setCplace(rs.getString("Cplace"));
				//administrator.setDate(admin.getDate());
				//administrator.setWorkTime(rs.getString("workTime"));
				//administrator.setShift(rs.getString("shift"));
				administrators.add(administrator);
				
			}
			}catch(SQLException e){
				ex=e;
			}finally{
				if(conn!=null){
					try{
						conn.close();
					}catch(SQLException e){
						if(ex==null){
							ex=e;
						}
					}
				}
			if(ex!=null){
				throw new RuntimeException(ex);
			}
			}
		return administrators;
	}
	
	@Override
	public List<Guitar> getGuitars(Guitar userGuitar) {
		Connection conn=null;
		PreparedStatement stmt=null;
		SQLException ex=null;
		List<Guitar> administrators=null;
		Guitar administrator=null;
		//int cccc=0;
		try{
			conn=datasource.getConnection();
			stmt=conn.prepareStatement("SELECT Cname,Cplace FROM Guitar");
			/*stmt.setString(1, admin.getCname());
			stmt.setString(2, admin.getCplace());*/
			ResultSet rs=stmt.executeQuery();
			administrators=new ArrayList<Guitar>();
			while(rs.next()){
				administrator=new Guitar();
				administrator.setColor(rs.getString("color"));
				//administrator.setCplace(rs.getString("Cplace"));
				//administrator.setDate(admin.getDate());
				//administrator.setWorkTime(rs.getString("workTime"));
				//administrator.setShift(rs.getString("shift"));
				administrators.add(administrator);
				
			}
			}catch(SQLException e){
				ex=e;
			}finally{
				if(conn!=null){
					try{
						conn.close();
					}catch(SQLException e){
						if(ex==null){
							ex=e;
						}
					}
				}
			if(ex!=null){
				throw new RuntimeException(ex);
			}
			}
		return administrators;
	}
}
