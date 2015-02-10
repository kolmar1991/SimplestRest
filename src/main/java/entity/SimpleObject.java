package entity;


import javax.persistence.*;

@Entity
public class SimpleObject {

    @SequenceGenerator(name="simple_object_seq", sequenceName="simple_object_id_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "simple_object_seq")
    @Id
    private long id;

    private String name;

    public SimpleObject(String name) {
        this.name = name;
    }

    public SimpleObject() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
