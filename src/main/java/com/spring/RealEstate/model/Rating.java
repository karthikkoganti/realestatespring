package com.spring.RealEstate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Rating {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long slno;
	private String Rate;
	private String Comment;
	private Long id;

}
