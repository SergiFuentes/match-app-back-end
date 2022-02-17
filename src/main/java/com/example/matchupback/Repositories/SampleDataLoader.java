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

                new UserAd(1L,"Carlos Perez", "https://thumbs.dreamstime.com/b/selfie-man-blogger-talks-subscribers-sea-beach-waves-hand-smiles-video-young-tourist-background-greets-portrait-159428734.jpg", "Bilbao", "Hola soy Carlos, me gusta ir a correr los lunes y martes después del trabajo, si tienes tiempo podríamos ir a correr. Suelo correr en la zona de Abando y Linares.", "19h-20h","Lunes y Martes", true),
                new UserAd(2L,"Juan Gonzalez", "https://images.unsplash.com/photo-1644994141078-4f60ef42aa78?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=436&q=80", "Colombia", "Soy estudiante de ingeniería Multimedia, y voy a la Biblioteca publica a estudiar. También voy al parque a dar paseos con perro Goku, soy un amante a los animales!", "18h-20h", "De Jueves a Domingo", true),
                new UserAd(3L,"Miquel Casas", "https://thumbs.dreamstime.com/b/photo-portrait-young-man-smiling-cheerful-happy-showing-v-sign-two-fingers-taking-selfie-isolated-bright-yellow-color-okay-216318488.jpg", "Bilbao", "Me encanta aprender de culturas y arte! Voy todos los miércoles a museos, galerías o eventos de este tipo, si también te gusta este tipo de cosas no dudes en contactarme!", "14h-16h", "Miércoles", false),
                new UserAd(4L,"Juana Rodriguez", "https://images.unsplash.com/photo-1644944693376-de2411390a44?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80", "Gijón", "Me gusta conocer gente nueva, de diferentes culturas, se varios idiomas como Francés, Ingles, Alemán y un poco de Chino. Si eres extranjero y quieres conocer la ciudad o ir a tomar un cafe y compartir un poco de culturas, me encantaría conectar contigo.", "10h-13h", "Fin de semana", true),
                new UserAd(5L,"Anastasio Pijoan", "https://media.istockphoto.com/photos/living-that-urban-life-picture-id1165314750?k=20&m=1165314750&s=612x612&w=0&h=QcN0aTHS8IpSbNEnSU9Vno8vUjCEFQs4gbZ72dG6yvM=", "Barcelona", "Paseo mis perros Lara y Toby, dos Border Collie. Son muy amigables y juguetones. Voy los Lunes y Martes en el parque Ignasium, te unes?", "19h-20h","Lunes y Martes", false),
                new UserAd(6L,"Romualdo Romualdez", "https://images.unsplash.com/photo-1644994141078-4f60ef42aa78?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=436&q=80", "Barcelona", "Me encanta ir de pinchos! voy en la tarde-noche  un rato a probar pinchos y varios bares, no suelo beber alcohol, y me gusta hablar mucho de política.", "18h-20h", "De Jueves a Domingo", true),
                new UserAd(7L,"Angelina Jolín", "https://media.istockphoto.com/photos/young-woman-with-dog-picture-id1060529042?b=1&k=20&m=1060529042&s=170667a&w=0&h=2IqOza6nlPfHw_w0877B-I6ROr0SZsx5n9BxNMum5Tk=", "Bilbao", "Soy una amante de los te y los mate. Me encanta compartir un te con una buena compañía y una conversación agradable.", "14h-18h", "Miércoles", true),
                new UserAd(8L,"Pedro Picachu", "https://images.unsplash.com/photo-1644944693376-de2411390a44?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=387&q=80", "Gijón", "Mis semanas son súper ocupadas y sedentarias, así que me gustaría hacer deporte pero no me gusta ir solo a correr, me gustaría ir con alguien o algún grupo, y así apoyarnos entre todos.", "10h-13h", "Fin de semana", false)

        ));
    }
}
