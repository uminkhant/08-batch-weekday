package com.jdc.mkt.entity;

import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	private int id;
	private String name;
	private String email;
	private LocalDate dob;
	private Address address;
	private List<String> contact;
	
}
