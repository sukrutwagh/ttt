package com.zycus.ttt.service;

import com.zycus.ttt.model.Block;
import com.zycus.ttt.model.Player;
import com.zycus.ttt.model.TTTResponse;

public interface IGameManager {

	TTTResponse startGame(Player player);
	TTTResponse makeMove(Player player, Block block);
	
}
