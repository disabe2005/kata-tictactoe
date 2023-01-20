package com.fortis.cge.kata.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fortis.cge.kata.model.GameDraw;
import com.fortis.cge.kata.payload.ResponsePayload;
import com.fortis.cge.kata.service.IGameService;
import com.fortis.cge.kata.utils.KataUtils;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/v0/game")
@CrossOrigin(origins = "*")
@Api( description="API pour les opérations sur le jeux.") //swagger shoud be configure
@Slf4j //Logs shoud be configured
public class GameController {
	

	@Autowired
	private IGameService gameService;
	@Autowired
	private KataUtils kataUtils;
	
	/*
	 * Method to Draw a pawn !
	 */
	@ApiOperation(value = "Draw a pawn ! this methode shoud take a GameDraw")
	@RequestMapping(method = RequestMethod.POST, value = "/draw")
	public ResponseEntity<ResponsePayload> draw(@RequestBody GameDraw gd) {
		 ResponsePayload response = new ResponsePayload();
		 String msg = null;
		try {
			msg = gameService.draw(gd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 if(msg.equals("OK")) {
			 log.info("Draw passed !");	
			 response.setStatus(HttpStatus.OK.value());
			 response.setMessage("Draw passed !");
			 return ResponseEntity.ok().body(response);
		 }else {
			 log.error("Draw not passed !");
			 response.setStatus(HttpStatus.EXPECTATION_FAILED.value());
			 response.setMessage("Draw not passed !");
			 return ResponseEntity.ok().body(response);
		 }
		 
	 }
	
	/*
	 * Method initialize a play !
	 */
	@ApiOperation(value = "initializ the play")
	@RequestMapping(method = RequestMethod.POST, value = "/init")
	public ResponseEntity<ResponsePayload> initPlay(String playerOne, String playerTwo) {
		List<GameDraw> listeGameDraw = new ArrayList<>();
		 ResponsePayload response = new ResponsePayload();
		try {
			listeGameDraw = gameService.launchParty();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if(!listeGameDraw.isEmpty()) {
			 log.info("Party can start !");	
			 response.setStatus(HttpStatus.OK.value());
			 response.setMessage("Party can start !");
			 return ResponseEntity.ok().body(response);
		}else {
			 log.error("We faced a problem during the initialisation of the party !");
			 response.setStatus(HttpStatus.EXPECTATION_FAILED.value());
			 response.setMessage("We faced a problem during the initialisation of the party !");
			 return ResponseEntity.ok().body(response);
		}
		
		
	}
	
	
}
