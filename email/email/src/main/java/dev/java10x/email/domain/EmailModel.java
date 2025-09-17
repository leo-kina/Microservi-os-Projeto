package dev.java10x.email.domain;

import dev.java10x.email.enums.EmailStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "TB_EMAIL")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailModel {

    private String emailId;
    private String userId;
    private String emailFrom;
    private String emailTo;
    private String emailSubject;
    @Column(columnDefinition = "BODY")
    private String Body;
    private LocalDateTime sendDateTime;
    private EmailStatus statusEmail;
}
