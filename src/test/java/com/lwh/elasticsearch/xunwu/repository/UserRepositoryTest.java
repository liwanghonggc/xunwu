package com.lwh.elasticsearch.xunwu.repository;

import com.lwh.elasticsearch.xunwu.ApplicationTests;
import com.lwh.elasticsearch.xunwu.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


/**
 * @author lwh
 * @date 2020-02-06
 * @desp
 */
public class UserRepositoryTest extends ApplicationTests {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindOne(){
        User user = userRepository.findOne(1L);
        Assert.assertEquals("wali", user.getName());
    }
}