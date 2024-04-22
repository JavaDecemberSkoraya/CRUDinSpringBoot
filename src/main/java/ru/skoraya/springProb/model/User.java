package ru.skoraya.springProb.model;


import jakarta.persistence.*;

@Entity
@Table(name = "user1")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    Long id;

    @Column(name = "firstname", nullable = false)
    String firstname;

    @Column(name = "lastname", nullable = false)
    String lastname;

    @Column(name = "age", nullable = false)
    int age;

    @Column(name = "email", nullable = false)
    String email;

    public User(){

    }

    public User(String firstname, String lastname, int age, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.email = email;
    }


    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString (){
        final StringBuilder sb = new StringBuilder("User{ ");
        sb.append("id=").append(id);
        sb.append("firstname=").append(firstname);
        sb.append("lastname=").append(lastname);
        sb.append("age=").append(age);
        sb.append("email=").append(email);
        sb.append("}");
        return sb.toString();
    }
}
