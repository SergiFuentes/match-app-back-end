package com.example.matchupback.Controllers;

import com.example.matchupback.Model.UserAd;
import com.example.matchupback.Repositories.UserAdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ads")

public class UserAdController {

    private final UserAdRepository userAdRepository;

    @Autowired
    public UserAdController(UserAdRepository userAdRepository) {
        this.userAdRepository = userAdRepository;
    }

    @GetMapping
    public List<UserAd> allUserAds() {
        return userAdRepository.findAll();
    }

    @GetMapping("/{id}")
    public UserAd findUserAd(@PathVariable Long id){
        return userAdRepository.findById(id).orElseThrow(null);
    }


}
