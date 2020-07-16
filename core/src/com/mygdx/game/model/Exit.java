package com.mygdx.game.model;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.mygdx.game.controller.Assets;

public class Exit extends Rectangle{

	Texture imageField;
	
	public Exit (Texture imageField, Assets assets) {
		imageField = new Texture("door.png");
		this.height = imageField.getHeight();
		this.width = imageField.getWidth();
	}
	
	public void draw(SpriteBatch spriteBatch) {
		spriteBatch.draw(imageField, 1920, 1080,imageField.getWidth(), imageField.getHeight());
	}

}
