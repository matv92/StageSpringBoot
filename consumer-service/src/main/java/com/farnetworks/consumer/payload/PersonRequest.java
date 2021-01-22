package com.farnetworks.consumer.payload;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@NoArgsConstructor @AllArgsConstructor 
@EqualsAndHashCode
public class PersonRequest implements Serializable{
	
	
	private static final long serialVersionUID = 1L;

	private String fiscalCode;
	
	@NotBlank
	private String email;
	
	private String gender;
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String surname;
	
	private String address;

}
