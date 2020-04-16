package com.coctail.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CoctailIngredientId implements Serializable{

	@Column(name = "coctail_id")
	private Long coctailId;
	@Column(name = "ingredient_id")
	private Long ingredientId;
	
	
	
	public CoctailIngredientId(Long coctailId, Long ingredientId) {
		this.coctailId = coctailId;
		this.ingredientId = ingredientId;
	}
	
	
	
}
