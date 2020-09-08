package com.itlize.resourcemanager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "projects")
@Getter
@Setter

public class ColumnValue {
    @Id
    int id;

    @Column
    String column_value;

    @ManyToOne(targetEntity = Column.class)
    Column column;

    @ManyToOne(targetEntity = Resource.class)
    Resource resource;

    public ColumnValue() {}
}
