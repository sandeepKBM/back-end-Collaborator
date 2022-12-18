package com.annauniv.server.relational;

import javax.persistence.*;

import com.annauniv.server.authority.UserAccountDepartment;
import com.annauniv.server.authority.UserAccountDesignation;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;

@Entity(name = "User")
@NoArgsConstructor
@AllArgsConstructor
public class UserAccount implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private UserAccountDesignation designation;
    @Enumerated(EnumType.STRING)
    private UserAccountDepartment department;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return designation.getGrantedAuthorities();
    }

    @Override
    public String getUsername() {
        return Long.toString(id);
    }

    public Long getId() {
        return id;
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

    public void setPassword(String password) {
        this.password = password;
    }

    public UserAccountDesignation getDesignation() {
        return designation;
    }

    public void setDesignation(UserAccountDesignation designation) {
        this.designation = designation;
    }

    public UserAccountDepartment getDepartment() {
        return department;
    }

    public void setDepartment(UserAccountDepartment department) {
        this.department = department;
    }

    public Set<GrantedAuthority> getGrantedAuthorities () {
        return Collections.emptySet();
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}