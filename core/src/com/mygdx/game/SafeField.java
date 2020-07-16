package com.mygdx.game;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class SafeField extends Rectangle{
	
	
	
	private Texture imageField;
	
	public SafeField (Texture imageField) {
	imageField = new Texture("table.png");
		this.height = imageField.getHeight();
		this.width = imageField.getWidth();
	}
	
	public void draw(SpriteBatch spriteBatch) {
		spriteBatch.draw(imageField, x, y, imageField.getWidth(), imageField.getHeight());
	}

}
