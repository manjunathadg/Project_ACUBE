/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 28.01.2018
* 
* Model class that has been mapped to USERS table
*/
package io.acube.security.acubesecurityauthserver.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;


@Data @NoArgsConstructor
@Entity
@Table(name = "users")
public class Users {
	
	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "first_name")
	private String first_name;

	@Column(name = "last_name")
	private String last_name;

	@Column(name = "country_code")
	private String country_code;

	@Column(name = "mobile")
	private String mobile;

	@Column(name = "profile_pic")
	private String profile_pic;

	@Column(name = "gender")
	private int gender;

	@Column(name = "dob")
	private Date dob;

	@Column(name = "email")
	private String email;

	@Column(name = "created_by")
	private String created_by;

	@Column(name = "created_on")
	private Date created_on;

	@Column(name = "modified_by")
	private String modified_by;

	@Column(name = "modified_on")
	private Date modified_on;

	@Column(name = "deleted_by")
	private String deleted_by;

	@Column(name = "deleted_on")
	private Date deleted_on;

	@Column(name = "is_deleted")
	private int is_deleted;
	
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinTable(name="user_roles", joinColumns=@JoinColumn(name="user_id"),inverseJoinColumns=@JoinColumn(name="role_id"))
	private Set<Roles> roles;
	
	
	public Users(Users users) {
		this.id = users.id;
		this.username = users.username;
		this.password = users.password;
		this.first_name = users.first_name;
		this.last_name = users.last_name;
		this.country_code = users.country_code;
		this.mobile = users.mobile;
		this.profile_pic = users.profile_pic;
		this.gender = users.gender;
		this.dob = users.dob;
		this.email = users.email;
		this.created_by = users.created_by;
		this.modified_by = users.modified_by;
		this.modified_on = users.modified_on;
		this.deleted_by = users.deleted_by;
		this.deleted_on = users.deleted_on;
		this.is_deleted = users.is_deleted;
		this.roles = users.roles;
	}

	public String getPassword() {
		return this.password;
	}
	

}
