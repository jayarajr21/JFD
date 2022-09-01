package com.nseit.SpringBootTodoJpa.model;

import lombok.Generated;
import lombok.Getter;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Entity
@Getter
public class ToDo {
   private Integer id;
   @Id
   @Generated
   private String itemName;
    private Boolean isCompleted;

}
