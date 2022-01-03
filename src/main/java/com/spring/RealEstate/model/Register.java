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
public class Register {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long slno;
	private String username;
	private String email;
	private String phone;
	private String password;
	private String packages;
	

}
