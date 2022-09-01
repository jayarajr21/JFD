package com.nseit.SpringBootTodoJpa.repositary;

import com.nseit.SpringBootTodoJpa.model.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToDoRepositary extends JpaRepository<ToDo,Integer>  {
}
