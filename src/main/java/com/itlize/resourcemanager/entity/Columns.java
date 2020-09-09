package com.itlize.resourcemanager.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "columns")
@Getter
@Setter
public class Columns {
    @Id
    int column_id;

    @Column
    String column_name;

    @Column
    String column_type;

    @Column
    String column_content;

    @ManyToOne(targetEntity = Projects.class)
    Projects projects;

    @OneToMany(targetEntity = ColumnValue.class, mappedBy = "column", cascade = CascadeType.REMOVE, fetch = FetchType.LAZY)
    List<ColumnValue> ColumnValue;

    public Columns() {
    }
}
