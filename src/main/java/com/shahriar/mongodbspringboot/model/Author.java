package com.shahriar.mongodbspringboot.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("author")
public class Author {
	
	@Id
	private String id;
	
	private String firstName;
	private String lastName;
	private String middleName;
	@JsonFormat(pattern="dd-MON-yyyy")
	private String birthDate;
	@JsonFormat(pattern="dd-MON-yyyy")
	private String deceasedDate;
	private String gender;
	
	public Author(String id, String firstName, String lastName, String middleName, String birthDate, String deceasedDate, String gender) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.birthDate = birthDate;
		this.deceasedDate = deceasedDate;
		this.gender = gender;
	}

}
