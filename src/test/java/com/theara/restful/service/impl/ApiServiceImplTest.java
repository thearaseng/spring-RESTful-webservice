package com.theara.restful.service.impl;

import com.theara.restful.domain.User;
import com.theara.restful.service.ApiService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author Theara Seng
 * Created on Mar 09, 2018
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImplTest {

    @Autowired
    private ApiService apiService;

    @Test
    public void testGetUsers() throws Exception {

        List<User> users = apiService.getUsers(3);

        assertEquals(4, users.size());
    }

}