package com.itlize.resourcemanager.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter

public class Projects {
    @Id
    int project_id;

    @Column(name = "project_name")
    String project_name;

    @ManyToOne(targetEntity = User.class)
    User user;


    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "projects", targetEntity = Project_to_Resource.class, fetch = FetchType.LAZY)
    List<Project_to_Resource> pr;

    @OneToMany(cascade =CascadeType.DETACH, mappedBy = "projects", targetEntity = Columns.class, fetch = FetchType.LAZY)
    List<Columns> columns;


    public Projects() {}

}
