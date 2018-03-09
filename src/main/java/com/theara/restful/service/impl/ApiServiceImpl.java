package com.theara.restful.service.impl;

import com.theara.restful.domain.User;
import com.theara.restful.domain.UserData;
import com.theara.restful.service.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

/**
 * @author Theara Seng
 * Created on Mar 09, 2018
 */

@Service
public class ApiServiceImpl implements ApiService {

    private RestTemplate restTemplate;

    @Value("${api.url}")
    private String apiUrl;

    @Autowired
    public ApiServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public List<User> getUsers(Integer limit) {

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder
                .fromUriString(apiUrl)
                .queryParam("limit", limit);

        UserData userData = restTemplate.getForObject(uriComponentsBuilder.toUriString(), UserData.class);

        return userData.getData();
    }
}
