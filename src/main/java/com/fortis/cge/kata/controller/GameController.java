package com.fortis.cge.kata.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping(value = "/api/v0/game")
@CrossOrigin(origins = "**")
@Api( description="API pour les opérations sur le jeux.")
@Slf4j
public class GameController {

}
