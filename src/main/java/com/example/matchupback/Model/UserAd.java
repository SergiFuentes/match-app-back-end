package com.example.matchupback.Model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "ads")
public class UserAd implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String image;
    private String location;
    private String description;
    private String time;
    private String days;
    private boolean verified;


    public UserAd() {}

    public UserAd(Long id, String name, String image, String location, String description, String time, String days, boolean verified) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.location = location;
        this.description = description;
        this.time = time;
        this.days = days;
        this.verified = verified;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}
