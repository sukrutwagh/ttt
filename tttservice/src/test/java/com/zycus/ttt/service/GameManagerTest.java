package com.zycus.ttt.service;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.zycus.ttt.model.Player;
import com.zycus.ttt.model.TTTResponse;

public class GameManagerTest {

	@Autowired
	private IGameManager gManager;
	
	@Test
	public void test_startGame_NoPlayer() {
		//Generate/Fetch test data
		Player player = null; 
		//Execute SUT
		TTTResponse response = gManager.startGame(player);
		//Verify results per expectations
		Assert.assertNull("Expected null but found object",response);
	}
	
	@Test
	public void test_startGame_WithPlayer() {
		//Generate/Fetch test data
		Player player = new Player(); 
		//Execute SUT
		TTTResponse response = gManager.startGame(player);
		//Verify results per expectations
		Assert.assertNotNull("Expected null but found object",response);
		Assert.assertEquals(true, response.isSuccess());
	}
	
	
	
}
