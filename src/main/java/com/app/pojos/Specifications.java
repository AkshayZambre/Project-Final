package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
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
@Table(name = "specifications")
public class Specifications extends BaseEntity{
//	 <th>sid</th>
//     <th>ram</th>
//     <th>rom</th>
//     <th>ssize</th>
//     <th>battery</th>
//     <th>os</th>
//     <th>network</th>
//     <th>sim</th>
//     <th>rcam</th>
//     <th>fcam</th>
//     <th>dim</th>
	
	//Brands id aur Specifciation ID ka box lagega in frontend
	
	@Column(length = 20)
	@JsonProperty("ram")
	private String ram;
	
	@Column(length = 20)
	@JsonProperty("rom")
	private String rom;
	
	@Column(length = 20)
	@JsonProperty("ssize")
	private String screenSize;
	
	@Column(length = 20)
	@JsonProperty("battery")
	private String battery;
	
	@Column(length = 20)
	@JsonProperty("os")
	private String os;
	
	@Column(length = 20)
	@JsonProperty("network")
	private String network;
	
	@Column(length = 20)
	@JsonProperty("sim")
	private String sim;
	
	@Column(length = 20)
	@JsonProperty("rcam")
	private String rearCam;
	
	@Column(length = 20)
	@JsonProperty("fcam")
	private String frontCam;
	
	@Column(length = 20)
	@JsonProperty("dim")
	private String dim;
	
	@OneToOne
	@JoinColumn(name="mobile_id",nullable = false)
	@MapsId
	private Mobiles mobile;
	
	
	
	
	
}//ends























