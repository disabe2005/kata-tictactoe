package com.fortis.cge.kata.service;

import java.util.List;

import com.fortis.cge.kata.model.GameDraw;

public interface IGameService {
	List<GameDraw> launchParty() throws Exception;
	String draw(GameDraw gd) throws Exception;
}
