package ConnectDb;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class ConnectDb {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String url = "jdbc:mysql://localhost:3306/new_schema";
		String user = "root";
		String password = "KoutaOgura0830";
		
		String sql = " SELECT * FROM language_table ";
		
		
		//接続
		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement stmt = con.createStatement();
				ResultSet res = stmt.executeQuery(sql)) {
			
			System.out.println("\n接続しました。");
			
			while(res.next()) {
				int id = res.getInt("id");
				String language = res.getString("language_nm");
				Date createDate = res.getDate("create_date");
				
				System.out.println(id);
				System.out.println(language);
				System.out.println(createDate);
				
				System.out.println("---------------");
			}
		} catch (SQLException e) {
			System.out.println("\nエラーが発生しました。");
		}
	}

}
