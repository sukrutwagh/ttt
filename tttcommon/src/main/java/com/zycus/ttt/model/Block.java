package com.zycus.ttt.model;

import com.zycus.ttt.enums.SymbolType;

public class Block {
	
	private int position;
	private SymbolType symbol;
	
	public boolean isSymbolSet() {
		return symbol==null ? false : true;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public SymbolType getSymbol() {
		return symbol;
	}

	public void setSymbol(SymbolType symbol) {
		this.symbol = symbol;
	}
	
	
	
	

}
