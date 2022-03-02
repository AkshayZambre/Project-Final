package com.app.pojos;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data


@Entity
@Table(name="users")
public class Users extends BaseEntity{

	  @Column(name="firstName",length=30,nullable = false)
	  @JsonProperty("fname")
	  private String firstName;
	  @Column(name="lastName",length=30,nullable = false)
	  @JsonProperty("lname")
	  private String lastName;
	  @Column(name="email" ,length=30 ,unique = true,nullable = false)
	  @JsonProperty("email")
	  private String email;
	  @Column(name="mobileNo" , nullable = false)
	  @JsonProperty("umob")
	  private String mobileNo;
	  @Column(name="password", nullable = false)
	  @JsonIgnore
	  private String password;
	  
	  @Enumerated(EnumType.STRING)
	  @Column(length = 20 ,nullable = false)
	  @JsonIgnore
	  private Role role;
	  
	  @OneToOne(cascade=CascadeType.ALL,orphanRemoval=true)
	  @JoinColumn(name="user_adr",nullable = false)
	  private Address address;
	  
	
	  
}
