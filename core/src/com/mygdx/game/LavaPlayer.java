package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;

public class LavaPlayer extends Rectangle{
	
	private Sound sound;
	private Texture imagePlayer;
	public boolean canJump = true;
	
	
	public float jumpVelocity;
	
	public LavaPlayer(Texture imagePlayer, Assets assets) {
		this.imagePlayer = imagePlayer;
		this.height = imagePlayer.getHeight();
		this.width = imagePlayer.getWidth();
		sound = assets.manager.get("jump.wav", Sound.class);
		
	}
	
	public void draw(SpriteBatch batch) {
		batch.draw(imagePlayer, x, y);
	}
	
	public void jump() {
		if(canJump && jumpVelocity >= -100 ) {
			jumpVelocity += 800;
			canJump = false;
			sound.play();
		}
	}

}
