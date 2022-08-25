package model;

import lombok.Data;
import lombok.Generated;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Data
public class Student {
    @Id
    @Generated
    private Integer id;
    private String studentName;
    private Integer rollNo;
    private Integer age;

}
