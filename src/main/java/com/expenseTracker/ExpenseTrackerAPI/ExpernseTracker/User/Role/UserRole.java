package com.expenseTracker.ExpenseTrackerAPI.ExpernseTracker.User.Role;

import javax.persistence.*;

@Entity
@Table(name="et_role")
public class UserRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ROLE_ID")
    private Integer role_id;
    @Column(name = "name",nullable = false,unique = true)
    private String name;

    public UserRole() {
    }

    public UserRole(String role_name) {
        this.name = name;
    }

    public UserRole(Integer role_id) {
        this.role_id = role_id;
    }

    public UserRole(Integer role_id, String name) {
        this.role_id = role_id;
        this.name = name;
    }
    @Override
    public String toString() {
        return this.name;
    }

    public Integer getRole_id() {
        return role_id;
    }

    public void setRole_id(Integer role_id) {
        this.role_id = role_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
