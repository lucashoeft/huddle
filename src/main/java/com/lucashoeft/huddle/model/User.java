package com.lucashoeft.huddle.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @SequenceGenerator(
            name= "user_sequence",
            sequenceName = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_sequence"
    )
    private Long userId;
    private String userName;
    private String userEmail;
    private String userPassword;
    private LocalDateTime userCreationDate;

    @OneToMany
    private List<Event> events;

    public User() {
    }

    public User(String userName, String userEmail, String userPassword, LocalDateTime userCreationDate) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userCreationDate = userCreationDate;
    }

    public User(Long userId, String userName, String userEmail, String userPassword, LocalDateTime userCreationDate, List<Event> events) {
        this.userId = userId;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userPassword = userPassword;
        this.userCreationDate = userCreationDate;
        this.events = events;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public LocalDateTime getUserCreationDate() {
        return userCreationDate;
    }

    public void setUserCreationDate(LocalDateTime userCreationDate) {
        this.userCreationDate = userCreationDate;
    }
}
