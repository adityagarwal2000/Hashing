package com.infy.hash.entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hash_table")
public class HashTable {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer slNo;
	private String country;
	private String state;
	private String project;
	private String hashcodeMurmur;
	@Column(name="hashcode_64")
	private String hashcode64;
	public Integer getSlNo() {
		return slNo;
	}
	public void setSlNo(Integer slNo) {
		this.slNo = slNo;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public String getHashcodeMurmur() {
		return hashcodeMurmur;
	}
	public void setHashcodeMurmur(String hashcodeMurmur) {
		this.hashcodeMurmur = hashcodeMurmur;
	}
	public String getHashcode64() {
		return hashcode64;
	}
	public void setHashcode64(String hashcode64) {
		this.hashcode64 = hashcode64;
	}
	@Override
	public int hashCode() {
		return Objects.hash(country, hashcode64, hashcodeMurmur, project, slNo, state);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HashTable other = (HashTable) obj;
		return Objects.equals(country, other.country) && Objects.equals(hashcode64, other.hashcode64)
				&& Objects.equals(hashcodeMurmur, other.hashcodeMurmur) && Objects.equals(project, other.project)
				&& Objects.equals(slNo, other.slNo) && Objects.equals(state, other.state);
	}
	
	
}