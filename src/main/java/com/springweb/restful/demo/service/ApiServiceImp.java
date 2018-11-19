package com.springweb.restful.demo.service;

import com.springweb.restful.demo.model.Datum;
import com.springweb.restful.demo.model.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Service
public class ApiServiceImp implements ApiService{

    private RestTemplate restTemplate;
    private String userUri;


    public ApiServiceImp(RestTemplate restTemplate, @Value("${user.uri}") String userUri) {
        this.restTemplate = restTemplate;
        this.userUri = userUri;
    }

    @Override
    public List<Datum> getUsers(Integer limit) {

        UriComponentsBuilder uriComponentsBuilder = UriComponentsBuilder
                .fromUriString(userUri)
                .queryParam("limit", limit);
        User users = restTemplate.getForObject(uriComponentsBuilder.toUriString(), User.class);
        return users.getData();
    }
}
