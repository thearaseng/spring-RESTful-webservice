package com.theara.restful.service.impl;

import com.theara.restful.domain.User;
import com.theara.restful.domain.UserData;
import com.theara.restful.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author Theara Seng
 * Created on Mar 09, 2018
 */

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    @Autowired
    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {
        UserData userData = restTemplate.getForObject("http://apifaketory.com/api/user?limit=" + limit, UserData.class);

        return userData.getData();
    }
}
