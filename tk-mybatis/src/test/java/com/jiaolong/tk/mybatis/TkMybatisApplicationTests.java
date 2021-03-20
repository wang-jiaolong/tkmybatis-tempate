package com.jiaolong.tk.mybatis;

import com.jiaolong.demo.domain.User;
import com.jiaolong.demo.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest(classes = TkMybatisApplication.class)
@RunWith(SpringRunner.class)
@Rollback
class TkMybatisApplicationTests {
    @Autowired
    private UserMapper userMapper;


    /**
     * 测试查询集合
     */
    @Test
    public void testSelect() {

        List<User> users = userMapper.selectAll();
        for (User user : users) {
            System.out.println(user.getUsername());
        }
    }

}
