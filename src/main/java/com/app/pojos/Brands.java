package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString

@Entity
@Table(name = "brands")
public class Brands extends BaseEntity {
//
//	 <th>bid</th>
//     <th>bname</th>
//     <th>bthumb</th>

	@Column(length = 20, unique = true)
	@JsonProperty("bname")
	private String brandName;

	@Lob
	@JsonProperty("bthumb")
	private byte[] brandImage;

	@OneToMany(mappedBy = "chosenBrand", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Mobiles> mobiles = new ArrayList<>();

	// Suggestion from the founder : add helper methods : for establishing the link
	// is it mandatory : NO , Optional BUT reco.
	public void addMobile(Mobiles m) {
		// add mobile ref in the brand
		mobiles.add(m);// brand --> mobile
		// assign brand ref to the mobile
		m.setChosenBrand(this);
	}

	public void removeMobile(Mobiles m) {
		// remove student ref from the course
		mobiles.remove(m);// course ----X---> student
		// remove course ref from the student
		m.setChosenBrand(null);
	}
}
