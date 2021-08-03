package com.example.testtaskforevotor.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // У меня в бд автоувеличение айдишника GenerationType.IDENTITY
    private long id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "last_name")
    private String surname;

    @Column(name = "patronymic")
    private String patronymic;

    @Column(name = "borndate")
    private String borndate;

}



