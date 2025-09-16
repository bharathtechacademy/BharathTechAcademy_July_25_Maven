package scripts;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import utilities.DBUtil;

public class DBTest {

	public static void main(String[] args) throws SQLException {
		
		List<Map<String,String>> data = DBUtil.readData(Queries.TOP_10_HORROR_MOVIES);		
		System.out.println(data);
		
		//Print movie names
		for(Map<String,String> row : data) {
			System.out.println(row.get("movie_name"));
		}

	}

}
