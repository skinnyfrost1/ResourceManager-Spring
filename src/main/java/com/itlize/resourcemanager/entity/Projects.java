package com.itlize.resourcemanager.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "projects")
@Getter
@Setter

public class Projects {
    @Id
    int project_id;

    @Column(name = "project_name")
    String project_name;

    @ManyToOne(targetEntity = Users.class)
    Users users;

    @ManyToOne(targetEntity = Project_to_Resource.class)
    Project_to_Resource pr;

    @OneToMany(cascade =CascadeType.DETACH, targetEntity = Columns.class, fetch = FetchType.LAZY)
    List<Columns> columns;


    public Projects() {}

}
