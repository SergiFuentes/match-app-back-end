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
                new UserAd(1L,"Carlos Perez", "no-image", "Barcelona", "description", "19h-20h","Lunes y Martes"),
                new UserAd(2L,"Juan Gonzalez", "https://images.unsplash.com/photo-1644994141078-4f60ef42aa78?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=436&q=80", "Colombia", "Me encanta pasear por el parque y hacer tai-chi", "18h-20h", "De Jueves a Domingo"),
                new UserAd(3L,"Miquel Casas", "https://images.unsplash.com/photo-1644896026815-76216723bb47?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwxMzd8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", "Bilbao", "Soy mucho de ir a bares, pero a tomar café ehh!", "14h-18h", "Miércoles"),
                new UserAd(4L,"Juana Rodriguez", "https://images.unsplash.com/photo-1644944693376-de2411390a44?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80", "Gijón", "Me chifla la cultura egipcia, museos y arte en general", "10h-13h", "Fin de semana")
                new UserAd(5L,"Anastasio Pijoan", "no-image", "Barcelona", "description", "19h-20h","Lunes y Martes"),
                new UserAd(6L,"Romualdo Romualdez", "https://images.unsplash.com/photo-1644994141078-4f60ef42aa78?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=436&q=80", "Barcelona", "Tomar un mate en compañía es mi mejor momento", "18h-20h", "De Jueves a Domingo"),
                new UserAd(7L,"Angelina Jolín", "https://images.unsplash.com/photo-1644896026815-76216723bb47?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwxMzd8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", "Bilbao", "Pinchos, pinchos y más pinchos!", "14h-18h", "Miércoles"),
                new UserAd(8L,"Pedro Picachu", "https://images.unsplash.com/photo-1644944693376-de2411390a44?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80", "Gijón", "Necesito hacer deporte cada semana, correr sobre todo...", "10h-13h", "Fin de semana")

        ));
    }
}
