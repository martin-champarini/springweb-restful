package com.springweb.restful.demo.service;

import com.springweb.restful.demo.model.user.Datum;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiServiceImpTest {

    @Autowired
    private ApiServiceImp apiServiceImp;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getUsers() {

        List<Datum> datumList= apiServiceImp.getUsers(3);
        assertEquals(4, datumList.size());
    }
}