package com.nseit.SpringBootTodoJpa.service;

import com.nseit.SpringBootTodoJpa.model.ToDo;
import com.nseit.SpringBootTodoJpa.repositary.ToDoRepositary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.metrics.jfr.FlightRecorderApplicationStartup;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.swing.plaf.ListUI;
import java.util.List;

@Service

public class ToDoService {
    @Autowired
    private ToDoRepositary toDoRepositary;

    public void add(ToDo toDo) {
        toDoRepositary.save(toDo);
    }

    public void update(ToDo toDo) {
         toDoRepositary.save(toDo);
    }

    public List<ToDo> view() {
       return toDoRepositary.findAll();
    }

    public void delete(int id) {
        for(ToDo toDo : toDoRepositary.findAll() )
                if(toDo.getId() == id) {
                    toDoRepositary.delete(toDo);
                }

    }
}
