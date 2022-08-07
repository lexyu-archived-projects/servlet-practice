package util;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DataSourceUtil {
	
	private static final String DB_CONNECTION_URL = "jdbc:mysql://localhost:3306/bookshop?useUnicode=yes&characterEncoding=utf8&useSSL=true&serverTimezone=Asia/Taipei";
	private static final String DB_USER = "hbstudent";
	private static final String DB_PWD = "hbstudent";
	private static DataSourceUtil ds;
	private MysqlDataSource mySqlDS = new MysqlDataSource();
		
	private DataSourceUtil() {
		mySqlDS.setUrl(DB_CONNECTION_URL);
		mySqlDS.setUser(DB_USER);
		mySqlDS.setPassword(DB_PWD);	
	}
	
	public static DataSourceUtil getInstance() {
		if(ds == null){
	        ds = new DataSourceUtil();
	     }
	     return ds;
	}
	

	public MysqlDataSource getMySqlDS() {
		return mySqlDS;
	}

	public void setMySqlDS(MysqlDataSource mySqlDS) {
		this.mySqlDS = mySqlDS;
	}
}
