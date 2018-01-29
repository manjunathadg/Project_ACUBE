/**
* ACUBE Technology Ltd all rights reserved
*
* @author Manjunatha D G
* @since 29.01.2018
* 
* Model class that has been mapped to ROLES table
*/
package io.acube.security.acubesecurityauthserver.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Table(name = "roles")
public class Roles {

	public Roles() {
		// TODO Auto-generated constructor stub
	}

	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

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

}
