package com.Project.Final.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="users")
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,length = 30)
    private String name;

    @Column(unique = true,nullable = false,length = 45)
    private String email;

    @Column(nullable = false,length = 30)
    private String password;

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    

    public void setPassword(String password) {
        this.password = password;
    }
    

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }


    
    
}
