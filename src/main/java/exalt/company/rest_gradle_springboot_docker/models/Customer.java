package exalt.company.rest_gradle_springboot_docker.models;




import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * This Class will be a Document that store in DataBase Automatically
 */
@Entity
public class Customer {

    @Id
    private Integer id ;
    private String firstName ;
    private String lastName ;

    public Customer() {

    }

    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
