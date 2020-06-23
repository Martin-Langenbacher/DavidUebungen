package com.wcs.java.tx.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager
				.getConnection("jdbc:mysql://my_stuff:my_stuff@localhost:3306/my_stuff?serverTimezone=CET");
		
		// 3 Konten anlegen:
		//SetupUtil.setup();
		
		try {
			
		con.setAutoCommit(false);
		AccountService accountService = new AccountService(con);
		TransferService transferService = new TransferService(accountService, con );
		transferService.transferMoney("andre", "david", new BigDecimal(500));
//		Statement st = con.createStatement();
//		st.execute("UPDATE bankaccounts SET balance=1000 WHERE user='david'");
//		st.execute("UPDATE bankaccounts SET balance=2000 WHERE user='andre'");
		con.commit(); 
		// erst nach dem commit sind die Daten in der Datenbank!
		} catch(Exception ex) {
			con.rollback();
		}finally {
			con.close();
		}

	}

}
