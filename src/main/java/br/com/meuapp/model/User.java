package br.com.meuapp.model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<TimeRecord> timeRecords;


    public User(){}

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
    }


}
