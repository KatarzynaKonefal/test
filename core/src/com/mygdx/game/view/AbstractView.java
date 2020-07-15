package com.mygdx.game.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.StretchViewport;
import com.mygdx.game.GameBoard;
import com.mygdx.game.controller.Assets;

public abstract class AbstractView implements Screen{
	
	
	
	Assets assets;
	
	protected GameBoard gameBoard;
	
	protected Stage stage;
	
	protected OrthographicCamera camera;
	
	protected SpriteBatch spriteBatch;
	
	
	public AbstractView(GameBoard gameBoard) {
		this.gameBoard = gameBoard;
		createCamera();
		stage = new Stage(new StretchViewport(GameBoard.width, GameBoard.height, camera));
		spriteBatch = new SpriteBatch();
		Gdx.input.setInputProcessor(stage);
	}

	private void createCamera() {
		camera = new OrthographicCamera();
		camera.setToOrtho(false, GameBoard.width, GameBoard.height);
		camera.update();
	}
	
	@Override
	public void render (float delta) {
		clearSreen();
		camera.update();
		spriteBatch.setProjectionMatrix(camera.combined);
		
	}
	
	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	private void clearSreen() {
		Gdx.gl.glClearColor(240 / 255f, 128 / 255f, 128 / 255f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
	}
	
	@Override
	public void resume() {
		gameBoard.setPaused(false);
	}
	
	@Override
	public void pause() {
		gameBoard.setPaused(true);
	}
	
	@Override
	public void hide() {
		
	}
	
	@Override
	public void dispose() {
		gameBoard.dispose();
		
	}
	
	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}
}
