package com.fortis.cge.kata.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fortis.cge.kata.model.GameDraw;
import com.fortis.cge.kata.utils.KataUtils;

@Service
public class GameServiceImpl implements IGameService {

	@Autowired
	private KataUtils kataUtils;
	
	@Override
	public List<GameDraw> launchParty() {
		return kataUtils.initializeDraw();
	}

	@Override
	public String draw(GameDraw gd) {	
		
		if(!kataUtils.verifyFirstPawn(gd, kataUtils.getListGameDrawAllPlayers())) {
			if(!kataUtils.verifyOccupedPosition(gd, kataUtils.getListGameDrawAllPlayers())) {
				kataUtils.draw(gd.getPosition(), gd.getPlayerName(), gd.getPawn());
				
			}
			return "OK";
		}else {
			return "KO";
		}
			
				
		
	}

}
