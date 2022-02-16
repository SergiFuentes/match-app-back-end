package com.example.matchupback.Repositories;

import com.example.matchupback.Model.UserAd;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SampleDataLoader {

    private final UserAdRepository userAdRepository;

    @Autowired
    public SampleDataLoader(UserAdRepository userAdRepository) {
        this.userAdRepository = userAdRepository;
    }

    @PostConstruct
    public void loadSampleData() {
        userAdRepository.saveAll(List.of(
                new UserAd(1L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h"),
                new UserAd(2L,"Juan Gonzalez", "no-image", "Colombia", "description", "18h-20h"),
                new UserAd(3L,"Carolta Perez", "no-image", "Bilbao", "description", "14h-18h"),
                new UserAd(4L,"Juana Perez", "no-image", "Gijón", "description", "10h-13h")

        ));
    }
}
