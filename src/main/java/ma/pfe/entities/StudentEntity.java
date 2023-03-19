package ma.pfe.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class StudentEntity {
    @Id
    public long id;
    public String name;


}
