package com.jsp.ecommerce.entity;

import com.jsp.ecommerce.enums.UserRole;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity

public class User {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id;
@Column(nullable = false)
private String username;
@Column(nullable = false,unique = true)
private String email;
@Column(nullable = false,unique = true)
private Long mobile;
@Column(nullable = false)
private String password;
@Enumerated 
@Column(nullable = false)
private UserRole role;
private boolean isActive;
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public UserRole getRole() {
	return role;
}
public void setRole(UserRole role) {
	this.role = role;
}
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
}
