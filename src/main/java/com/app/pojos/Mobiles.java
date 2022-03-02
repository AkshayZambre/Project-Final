package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString

@Entity
@Table(name = "mobiles")
public class Mobiles extends BaseEntity{

//	<th>mid</th>
//    <th>mmodel</th>
//    <th>mname</th>
//    <th>mcolor</th>
//    {/* <th>mthumb</th> */}
//    <th>imei</th>
//    <th>mdate</th>
//    <th>mprice</th>
//    <th>Options</th>
	
	@Column(length = 20, nullable = false, unique = true)
	@JsonProperty("mmodel")
	private String mobModel;
	
	@Column(length = 20, nullable = false)
	@JsonProperty("mname")
	private String mobName;
	
	@Column(length = 20, nullable = false)
	@JsonProperty("mcolor")
	private String mcolor;
	
	@Lob
	@JsonProperty("mthumb")
    private byte[] image;
   
    
	@Column(length = 20, unique = true, nullable = false)
	@JsonProperty("imei")
	private String imei;
	
	@Column(length = 20, nullable = false)
	@JsonProperty("mdate")
	private LocalDate manufactureDate;
	
	@Column(length = 20, nullable = false)
	@JsonProperty("mcolor")
	private double mprice;
	
	@ManyToOne
    @JoinColumn(name = "brand_id",nullable = false)//=> NOT NULL constraint
    private Brands chosenBrand;
	
	
	

}









