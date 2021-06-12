package it.formarete.studentmanager.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	@Column(length = 20)
	private String firstName;
	@Column(length = 20)
	private String lastName;
	private Date dateOfBirth;

	@OneToOne
	private User user;
}
