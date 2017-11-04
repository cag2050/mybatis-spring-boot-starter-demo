package com.cag.starter;

import com.cag.entity.UserEntity;
import com.cag.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisSpringBootStarterDemoApplicationTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void select() {
		List<UserEntity> users = userMapper.getAll();
		System.out.println("users ============");
		System.out.println(users.toString());
	}

}
