package com.springweb.restful.demo.service;

import com.springweb.restful.demo.model.Datum;
import com.springweb.restful.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ApiService {

    List<Datum> getUsers(Integer limit);
}
