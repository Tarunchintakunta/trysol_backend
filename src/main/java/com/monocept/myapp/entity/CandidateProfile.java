package com.monocept.myapp.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
@Table(name = "candidate_profiles")
public class CandidateProfile {

	@Id
	@Column(name = "id")
	private String id;


    @NotBlank(message = "Skill name cannot be blank")
    private String skill;

    private String subSkill;

    @NotBlank(message = "Name cannot be blank")
    private String name; // Added back the name field


    @NotBlank(message="Contact cannot be blank")
    private String contact;


    @NotBlank(message = "Mail ID cannot be blank")
    @Email(message = "Invalid email format")
    private String mailId;

    @Min(value = 0, message = "Total experience cannot be negative")
    private int totalExperience; // Assuming experience is in years

    @Min(value = 0, message = "Relevant experience cannot be negative")
    private int relevantExperience;

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getSubSkill() {
		return subSkill;
	}

	public void setSubSkill(String subSkill) {
		this.subSkill = subSkill;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getMailId() {
		return mailId;
	}

	public void setMailId(String mailId) {
		this.mailId = mailId;
	}

	public int getTotalExperience() {
		return totalExperience;
	}

	public void setTotalExperience(int totalExperience) {
		this.totalExperience = totalExperience;
	}

	public int getRelevantExperience() {
		return relevantExperience;
	}

	public void setRelevantExperience(int relevantExperience) {
		this.relevantExperience = relevantExperience;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getNoticePeriod() {
		return noticePeriod;
	}

	public void setNoticePeriod(String noticePeriod) {
		this.noticePeriod = noticePeriod;
	}

	@NotBlank(message = "Location cannot be blank")
    private String location; 

    @NotNull(message = "Date is required")
    private LocalDate date; // New field for date from the Excel sheet
    
    @NotBlank(message = " Notice period is required")
    private String noticePeriod;
}
