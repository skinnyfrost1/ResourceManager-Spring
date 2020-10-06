package com.itlize.resourcemanager.entity;



import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Integer user_id;

    @Column(name = "first_name")
    String first_name;

    @Column(name = "last_name")
    String last_name;

    @Column(name = "email")
    String email;

    @Column(name = "username")
    String username;

    @Column(name = "password")
    String password;

    @Column(name = "roles")
    String roles;

    @Column(name = "active")
    boolean active;

    @OneToMany(cascade =CascadeType.DETACH,  mappedBy = "user", targetEntity = Projects.class, fetch = FetchType.LAZY)
    List<Projects> projects;

    public User() {
    }

}
