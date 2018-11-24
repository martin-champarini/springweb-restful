package com.springweb.restful.demo.service;

import com.springweb.restful.demo.model.user.Datum;

import java.util.List;

public interface ApiService {

    List<Datum> getUsers(Integer limit);
}
