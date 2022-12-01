package com.anno.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int addCustomer(Customer c) {
		// TODO Auto-generated method stub
		String insertQuery = "insert into customer values(?,?)";
		int rows = jdbcTemplate.update(insertQuery, c.getCustomerId(), c.getCustomerName());
		return rows;
	}

	@Override
	public int updateCustomer(Customer c) {
		// TODO Auto-generated method stub
		String updateQuery = "update customer set customerName = ? where customerId = ?";
		int rows = jdbcTemplate.update(updateQuery, c.getCustomerName(), c.getCustomerId());
		return rows;
	}

	@Override
	public int deleteCustomer(Customer c) {
		// TODO Auto-generated method stub
		String deleteQuery = "delete from customer where customerId = ?";
		int rows = jdbcTemplate.update(deleteQuery, c.getCustomerId());
		return rows;
	}

}
