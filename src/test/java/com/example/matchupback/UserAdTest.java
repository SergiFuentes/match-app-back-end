package com.example.matchupback;

import com.example.matchupback.Model.UserAd;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class UserAdTest {

    @Test
    void returnsUserAdPostersId() {
        UserAd userAd = new UserAd(2L, "Carlos Perez", "no-image", "Barcelona", "description", "19h-20h");
        assertThat(userAd.getId(), equalTo(2L));
    }
    @Test
    void returnsUserAdPostersName() {
        UserAd userAd = new UserAd(1L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h");
        assertThat(userAd.getName(), equalTo("Carlos Perez"));
    }
    @Test
    void returnsUserAdPostersImage() {
        UserAd userAd = new UserAd(1L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h");
        assertThat(userAd.getImage(), equalTo("no-image"));
    }
    @Test
    void returnsUserAdPostersLocation() {
        UserAd userAd = new UserAd(1L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h");
        assertThat(userAd.getLocation(), equalTo("Barcelona"));
    }
    @Test
    void returnsUserAdPostersDescription() {
        UserAd userAd = new UserAd(1L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h");
        assertThat(userAd.getDescription(), equalTo("description"));
    }
    @Test
    void returnsUserAdPostersTime() {
        UserAd userAd = new UserAd(1L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h");
        assertThat(userAd.getTime(), equalTo("19h-20h"));
    }
}
