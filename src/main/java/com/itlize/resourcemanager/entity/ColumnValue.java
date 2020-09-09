package com.itlize.resourcemanager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class ColumnValue {
    @Id
    int id;

    @Column
    String column_value;

    @ManyToOne(targetEntity = Columns.class)
    Columns column;

    @ManyToOne(targetEntity = Resource.class)
    Resource resource;

    public ColumnValue() {}
}
