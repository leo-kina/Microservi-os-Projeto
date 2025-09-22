package dev.java10x.user.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "TB_USERS")
public class UserModel {
    private final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID UserID;
    private String name;
    private String email;

    public long getSerialVersionUID() {
        return serialVersionUID;
    }

    public UUID getUserID() {
        return UserID;
    }

    public void setUserID(UUID userID) {
        UserID = userID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
