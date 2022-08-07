package test;

import java.sql.Connection;

import com.mysql.cj.jdbc.MysqlDataSource;

import util.DataSourceUtil;

public class testDSconn {

	public static void main(String[] args) {
		try {
			Connection connection = null; 
			MysqlDataSource basicDS = DataSourceUtil.getInstance().getMySqlDS();
			connection = basicDS.getConnection();
			System.out.println("連線成功!!");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
