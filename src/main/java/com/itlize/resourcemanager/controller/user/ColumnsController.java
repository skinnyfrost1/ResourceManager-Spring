package com.itlize.resourcemanager.controller.user;


import java.util.List;

import com.itlize.resourcemanager.entity.Columns;
import com.itlize.resourcemanager.repository.ColumnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class ColumnsController<Columns> {


    private ColumnRepository columnRepository;

    @Autowired
    public ColumnsController(ColumnRepository theColumnRepository) {
        this.columnRepository = theColumnRepository;
    }



    @GetMapping("columnsall")
//    @Override
    public List<Columns> findAll() {
        return (List<Columns>) columnRepository.findAll();
    }

}