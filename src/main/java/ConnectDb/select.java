package ConnectDb;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import model.subject;

public class select {

	public static subject main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String url = "jdbc:mysql://localhost:3306/new_schema";
		String user = "root";
		String password = "KoutaOgura0830";
		
		String sql = " SELECT * FROM language_table ";
		subject subjectList = new subject(null);
		ArrayList<subject> list = new ArrayList<subject>();
		
		
		//接続
		try (Connection con = DriverManager.getConnection(url, user, password);
				Statement stmt = con.createStatement();
				ResultSet res = stmt.executeQuery(sql)) {
			
			System.out.println("\n接続しました。");

			while(res.next()) {
				String id = res.getString("id");
				String language = res.getString("language_nm");
				
				subjectList.setId(id);
				subjectList.setSubject(language);
				list.add(subjectList);
				
				subjectList.setSubjectList(list);
				
			}
			
		} catch (SQLException e) {
			System.out.println("\nエラーが発生しました。");
		}
		return subjectList;
	}

}
