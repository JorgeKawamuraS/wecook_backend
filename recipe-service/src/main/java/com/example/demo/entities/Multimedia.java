package com.example.demo.entities;


import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "multimedias")
@Data
public class Multimedia{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String url;


    public Long getId() {
        return id;
    }

    public Multimedia setId(Long id) {
        this.id = id;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public Multimedia setUrl(String url) {
        this.url = url;
        return this;
    }

}
