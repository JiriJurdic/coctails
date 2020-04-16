package com.coctail.app.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.MapsId;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name = "t_coctail_x_ingredient", schema = "co")
public class TCoctailXIngredient implements Serializable {
	
	@EmbeddedId
	private CoctailIngredientId id;
	
	@ManyToMany
	@MapsId("coctail_id")
	@JoinColumn(name = "coctail_id",nullable = false)
	private TCoctail coctail;
	
	@ManyToMany
	@MapsId("ingredient_id")
	@JoinColumn(name = "ingredient_id",nullable = false)
	private TIngredienr ingredient;

	public TCoctailXIngredient() {
		super();
		
	}
	
	

}
