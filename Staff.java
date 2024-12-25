package pkg;


import javax.persistence.*;

@Entity
public class Staff {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String specialization;

    public Staff() {}

    public Staff(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
