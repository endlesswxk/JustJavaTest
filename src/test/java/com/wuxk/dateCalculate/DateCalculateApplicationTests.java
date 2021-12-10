package com.wuxk.dateCalculate;

import com.wuxk.dateCalculate.entity.User;
import com.wuxk.dateCalculate.service.userService.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.UUID;

@SpringBootTest
class DateCalculateApplicationTests {

	@Autowired
	DataSource dataSource;

	@Autowired
	UserService userService;

	@Test
	void contextLoads() throws SQLException {
		System.out.println(dataSource.getClass());
		Connection connection = dataSource.getConnection();
		System.out.println(connection);

		//template模板，拿来即用
		connection.close();
	}

	@Test
	void addUser() {
		User user = new User();
		user.setUserId(UUID.randomUUID().toString().replaceAll("-", ""));
		user.setUserName("康康");
		user.setLogicDelete(0);
		userService.addUser(user);
	}

}
