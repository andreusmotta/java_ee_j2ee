package model;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	/** Módulo de Conexão **/
	// Parametros de conexão:
	private String driver = "org.mariadb.jdbc.Driver";
	private String url = "jdbc:mariadb://127.0.0.1:3306/dbagenda?useTimezone-true$serverTimezone=UTC";
	private String user = "root";
	private String password = "";
	
	// Método de conexão:
	private Connection conectar() {
		Connection con = null;
		try {
			Class.forName(driver);
			con  = DriverManager.getConnection(url, user, password);
			return con;
		} catch (Exception e) {
			 System.out.println(e);
			 return null;
		}
	}
		// teste de conexão
//		public void testeConexao() {
//			try {
//				Connection con = conectar();
//				System.out.println(con);
//				con.close();
//			} catch (Exception e) {
//				System.out.println(e);
//			}
//		}
}
