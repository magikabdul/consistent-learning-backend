package com.cholewa.consistency.user.account;

import com.cholewa.consistency.service.DataBaseService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserTestSuite {

    @Autowired
    private DataBaseService service;

    @Test
    public void createUser() {
        //Given
        User user = new User("Krzysztof", "Cholewa", true);

        //When
        service.saveUser(user);
        long id = user.getId();

        //Then
        Assert.assertEquals(3L, id);

        //CleanUp
    }
}
