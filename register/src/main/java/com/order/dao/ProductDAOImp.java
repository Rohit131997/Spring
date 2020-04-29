package com.order.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import com.order.model.Product;

@Component
public class ProductDAOImp implements ProductDAO {
	
	 JdbcTemplate jdbcTemplate;

	public ProductDAOImp(DriverManagerDataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}


	@Override
	public int addProduct(Product p) {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO product_data VALUES(?,?,?,?)";

		try {

			int counter = jdbcTemplate.update(sql,
					new Object[] { p.getPid(), p.getPname(), p.getPrice(), p.getFinalPrice() });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
		
	}


