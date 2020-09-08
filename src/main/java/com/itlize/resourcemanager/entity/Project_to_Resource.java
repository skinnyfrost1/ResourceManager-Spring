package com.itlize.resourcemanager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "projects")
@Getter
@Setter
public class Project_to_Resource {
    @Id
    int id;

    @OneToMany(targetEntity = Projects.class, cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    List<Projects> projects;

    @OneToMany(targetEntity = Resource.class, cascade = CascadeType.DETACH, fetch = FetchType.LAZY)
    List<Resource> Resource;

    public Project_to_Resource() {}
}
