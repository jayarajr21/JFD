package model;

import lombok.Generated;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Course {
    @Id
    @Generated
    private Integer cId;
    private String cName;
    private Integer duration;
}
