package com.itlize.resourcemanager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Project_to_Resource {
    @Id
    int id;

    @ManyToOne(targetEntity = Projects.class)
    Projects projects;

    @ManyToOne(targetEntity = Resource.class)
    Resource resource;

    public Project_to_Resource() {}
}
