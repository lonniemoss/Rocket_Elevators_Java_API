package com.glory.app.rest.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.sql.Date;
import java.util.Collection;


@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "users")
public class User implements UserDetails {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String email;
    @Column
    private String encrypted_password;
    @Column
    private Integer emp;
    @Column
    private String title;
    @Column
    private String firstname;
    @Column
    private String lastname;
    @Column
    private Date create_at;
    @Column
    private Date update_at;

    public User(long id, String email, String encrypted_password, String title, String firstname, String lastname, Date create_at, Date update_at) {
        this.id = Math.toIntExact(id);
        this.email = email;
        this.encrypted_password = encrypted_password;
        this.title = title;
        this.firstname = firstname;
        this.lastname = lastname;
        this.create_at = create_at;
        this.update_at = update_at;
    }



    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = Math.toIntExact(id);
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEncrypted_password() {
        return this.encrypted_password;
    }

    public void setEncrypted_password(String encrypted_password) {
        this.encrypted_password = encrypted_password;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getCreate_at() {
        return this.create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return this.update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    @Override

    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' + ", encrypted_password='" + encrypted_password + '\'' + ", title='" + title + '\'' + ", firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' + ", create_at='" + create_at + '\'' + ", update_at='" + update_at + '\'' + '}';

    }


    @JsonIgnore
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @JsonIgnore
    @Override
    public String getPassword() {
        return encrypted_password;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @JsonIgnore
    @Override
    public boolean isEnabled() {
        return true;
    }
}
