package com.example.matchupback;

import com.example.matchupback.Model.UserAd;
import com.example.matchupback.Repositories.UserAdRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Objects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class UserAdTest {

    @Test
    void returnsUserAdPostersName() {
        UserAd userAd = new UserAd(1L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h");
        assertThat(userAd.getName(), equalTo("Carlos Perez"));
    }
}
