package com.order.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.order.model.Product;

public class ProductDAOImp implements ProductDAO {
	
	private JdbcTemplate jdbcTemplate;

	public ProductDAOImp(DriverManagerDataSource driverManagerDataSource) {
		jdbcTemplate = new JdbcTemplate(driverManagerDataSource);
	}


	@Override
	public int registerUser(Product p) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO USER_DATA VALUES(?,?)";

		try {
			
			int counter = jdbcTemplate.update(sql, new Object[] { p.getPid(), p.getPassword() });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	@Override
	public String loginUser(Product p) {
String sql = "SELECT USER_ID FROM USER_DATA WHERE USER_ID=? AND USER_PASS=?";
		
		try {

			String userId = jdbcTemplate.queryForObject(sql, new Object[] {
					p.getPid(), p.getPassword() }, String.class);

			return userId;
			
		} catch (Exception e) {
			return null;
		}
	}


	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		
	}

}
