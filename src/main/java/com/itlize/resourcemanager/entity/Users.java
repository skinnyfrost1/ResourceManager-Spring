package com.itlize.resourcemanager.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Getter
@Setter
public class Users {
    @Id
    int user_id;

    @Column(name = "first_name")
    String first_name;

    @Column(name = "last_name")
    String last_name;

    @Column(name = "email")
    String email;

    @Column(name = "password")
    String password;

    @Column(name = "roles")
    String roles;

    @OneToMany(cascade =CascadeType.DETACH, targetEntity = Projects.class, fetch = FetchType.LAZY)
    List<Projects> projects;

    public Users() {
    }

}