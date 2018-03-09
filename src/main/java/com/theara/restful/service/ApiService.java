package com.theara.restful.service;

import com.theara.restful.domain.User;

import java.util.List;

/**
 * @author Theara Seng
 * Created on Mar 09, 2018
 */

public interface ApiService {

    List<User> getUsers(Integer limit);

}
