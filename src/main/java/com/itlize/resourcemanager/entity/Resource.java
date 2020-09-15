package com.itlize.resourcemanager.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter

public class Resource {

    @Id
    int resource_id;

    @Column(name = "resource_code")
    String code;

    @Column(name = "resource_name")
    String resource_name;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "resource", targetEntity = Project_to_Resource.class, fetch =
            FetchType.LAZY)
    List<Project_to_Resource> rp;

    @OneToMany(targetEntity = ColumnValue.class, mappedBy = "resource", cascade = CascadeType.DETACH, fetch =
            FetchType.LAZY)
    List<ColumnValue> ColumnValue;

    public Resource() {
    }
}

