package ConnectDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class registSubject {
	public void regist(String subjectName) {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/new_schema";
		String user = "root";
		String password = "KoutaOgura0830";
		
		String sql = "";
		
		sql += "INSERT INTO language_table ";
		sql += "( ";
		sql += "  language_nm, ";
		sql += "  create_date ";
		sql += ") ";
		sql += "VALUES ( ";
		sql += " '" + subjectName + "', " ;
		sql += "  sysdate() )";
		
		//接続
		try  {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			
			int count = stmt.executeUpdate(sql);
			
			System.out.println(count +"件 追加しました。");
			
		} catch (SQLException | ClassNotFoundException e) {
			String mess = e.getMessage();
			System.out.println("\nエラーが発生しました。" + mess);
		}
	}
}
