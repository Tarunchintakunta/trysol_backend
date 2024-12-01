package com.monocept.myapp.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Entity
@Table(name = "upload_audits")
public class UploadAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUploaderName() {
		return uploaderName;
	}

	public void setUploaderName(String uploaderName) {
		this.uploaderName = uploaderName;
	}

	public Long getUploaderId() {
		return uploaderId;
	}

	public void setUploaderId(Long uploaderId) {
		this.uploaderId = uploaderId;
	}

	public LocalDateTime getUploadDateTime() {
		return uploadDateTime;
	}

	public void setUploadDateTime(LocalDateTime uploadDateTime) {
		this.uploadDateTime = uploadDateTime;
	}

	public int getInsertedRows() {
		return insertedRows;
	}

	public void setInsertedRows(int insertedRows) {
		this.insertedRows = insertedRows;
	}

	public int getSkippedRows() {
		return skippedRows;
	}

	public void setSkippedRows(int skippedRows) {
		this.skippedRows = skippedRows;
	}

	@NotBlank(message="Uploader name cannot be blank")
    private String uploaderName;

    @NotNull(message="Uploader ID cannot be null")
    private Long uploaderId;

    private LocalDateTime uploadDateTime; // Date and time of the upload

    private int insertedRows; // Number of rows successfully inserted

    private int skippedRows; // Number of rows skipped due to errors or duplicates

}
