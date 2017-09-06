package com.zycus.ttt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.zycus.ttt.dao.ScoreDAO;
import com.zycus.ttt.model.Block;
import com.zycus.ttt.model.Player;
import com.zycus.ttt.model.TTTResponse;

@Component
public class GameManager implements IGameManager {

	@Autowired
	private ScoreDAO scoreDAO;
	
	public ScoreDAO getScoreDAO() {
		return scoreDAO;
	}
	
	public void setScoreDAO(ScoreDAO scoreDAO) {
		this.scoreDAO = scoreDAO;
	}
	
	public TTTResponse startGame(Player player) {
		TTTResponse response = null;
		if(null!=player) {
			response = new TTTResponse();
			//Do things
			response.setSuccess(true);
		}
		
		return response;
	}

	public TTTResponse makeMove(Player player, Block block) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}
