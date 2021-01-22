package com.farnetworks.authservice.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "User", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
            "username"
        }),
        @UniqueConstraint(columnNames = {
            "email"
        })
})
@Getter
@Setter 
@NoArgsConstructor @AllArgsConstructor 
@EqualsAndHashCode(callSuper = true)
public class User extends BaseModel{

	private static final long serialVersionUID = 1L;

	@NotBlank
    @Size(max = 40)
    private String name;

    @NotBlank
    @Size(max = 15)
    private String username;

    @NaturalId
    @NotBlank
    @Size(max = 40)
    @Email
    private String email;

	// NB: Codificare password sul db da questo sito https://bcrypt-generator.com/
    @NotBlank
    @Size(max = 100)
    private String password;

}
