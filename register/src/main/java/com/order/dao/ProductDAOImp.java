package com.order.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;
import com.order.model.Product;

@Component
public class ProductDAOImp implements ProductDAO {

	JdbcTemplate jdbcTemplate;

	@Autowired
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

	@Override
	public List<Product> getProducts() {
		return jdbcTemplate.query("select * from product_data", new RowMapper<Product>() {

			public Product mapRow(ResultSet rs, int row) throws SQLException {
				Product product = new Product();
				product.setPid(rs.getInt(1));
				product.setPname(rs.getString(2));
				product.setPrice(rs.getDouble(3));
				product.setFinalPrice(rs.getDouble(4));
				return product;
			}
		});
	}

	@Override
	public int editProduct(Product p) {
		String sql = "update product_data set pname='" + p.getPname() + "', price=" + p.getPrice() + ",finalPrice='"
				+ p.getFinalPrice() + "' where pid=" + p.getPid() + "";
		return jdbcTemplate.update(sql);
	}

	@Override
	public Product getProductById(int pid) {
		String sql = "select * from product_data where pid=?";
		return jdbcTemplate.queryForObject(sql, new Object[] { pid },
				new BeanPropertyRowMapper<Product>(Product.class));
	}
}
