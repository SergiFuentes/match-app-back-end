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
                new UserAd(1L,"Carlos Perez", "https://images.unsplash.com/photo-1644896026815-76216723bb47?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwxMzd8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", "Barcelona", "description", "19h-20h","Lunes y Martes"),
                new UserAd(2L,"Juan Gonzalez", "https://images.unsplash.com/photo-1644994141078-4f60ef42aa78?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=436&q=80", "Colombia", "Me encanta pasear por el parque y hacer tai-chi", "18h-20h", "De Jueves a Domingo"),
                new UserAd(3L,"Miquel Casas", "https://images.unsplash.com/photo-1644896026815-76216723bb47?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxlZGl0b3JpYWwtZmVlZHwxMzd8fHxlbnwwfHx8fA%3D%3D&auto=format&fit=crop&w=500&q=60", "Bilbao", "Soy mucho de ir a bares, pero a tomar café ehh!", "14h-18h", "Miércoles"),
                new UserAd(4L,"Juana Rodriguez", "https://images.unsplash.com/photo-1644944693376-de2411390a44?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80", "Gijón", "Me chifla la cultura egipcia, museos y arte en general", "10h-13h", "Fin de semana"),
                new UserAd(5L,"Anastasio Pijoan", "https://media.istockphoto.com/photos/living-that-urban-life-picture-id1165314750?k=20&m=1165314750&s=612x612&w=0&h=QcN0aTHS8IpSbNEnSU9Vno8vUjCEFQs4gbZ72dG6yvM=", "Barcelona", "description", "19h-20h","Lunes y Martes"),
                new UserAd(6L,"Romualdo Romualdez", "https://images.unsplash.com/photo-1644994141078-4f60ef42aa78?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=436&q=80", "Barcelona", "Tomar un mate en compañía es mi mejor momento", "18h-20h", "De Jueves a Domingo"),
                new UserAd(7L,"Angelina Jolín", "https://media.istockphoto.com/photos/young-woman-with-dog-picture-id1060529042?b=1&k=20&m=1060529042&s=170667a&w=0&h=2IqOza6nlPfHw_w0877B-I6ROr0SZsx5n9BxNMum5Tk=", "Bilbao", "Pinchos, pinchos y más pinchos!", "14h-18h", "Miércoles"),
                new UserAd(8L,"Pedro Picachu", "https://images.unsplash.com/photo-1644944693376-de2411390a44?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80", "Gijón", "Necesito hacer deporte cada semana, correr sobre todo...", "10h-13h", "Fin de semana")

        ));
    }
}
