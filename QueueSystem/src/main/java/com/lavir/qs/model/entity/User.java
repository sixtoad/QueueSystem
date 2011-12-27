package com.lavir.qs.model.entity;


import javax.persistence.Entity;
import java.io.Serializable;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Version;
import java.lang.Override;@Entity public class User implements java.io.Serializable {

	@Id
	private @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", updatable = false, nullable = false)
	Long id = null;
	@Version
	private @Column(name = "version")
	int version = 0;

	public Long getId() {
		return this.id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public int getVersion() {
		return this.version;
	}

	public void setVersion(final int version) {
		this.version = version;
	}

	@Override
	public boolean equals(Object that) {
		if (this == that) {
			return true;
		}
		if (that == null) {
			return false;
		}
		if (getClass() != that.getClass()) {
			return false;
		}
		if (id != null) {
			return id.equals(((User) that).id);
		}
		return super.equals(that);
	}

	@Override
	public int hashCode() {
		if (id != null) {
			return id.hashCode();
		}
		return super.hashCode();
	}

	@Column
	private String firstname;

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(final String firstname) {
		this.firstname = firstname;
	}

	@Column
	private String lastname;

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(final String lastname) {
		this.lastname = lastname;
	}

	@Column
	private String username;

	public String getUsername() {
		return this.username;
	}

	public void setUsername(final String username) {
		this.username = username;
	}

	@Column
	private String password;

	public String getPassword() {
		return this.password;
	}

	public void setPassword(final String password) {
		this.password = password;
	}

	public String toString() {
		return "" + firstname + ", " + lastname + ", " + username + ", "
				+ password;
	} }