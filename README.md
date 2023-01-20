# kata-tictactoe
A Kata to perform Test Driven Development (TDD).

This is the backend of the game

It contain Model, Payload, Service, controller and an Utils class

# Description of any part
# Model
This contain GameDraw.java, Game.java, PositionEnum.java and PawnEnum.java

# Payload
Here we have ResponsePayload.java (That contain information for the API caller), GameDrawPayload.java (A helper for GameDraw)

# Utils
KataUtils.java
As we did'n managed to database in this step, the Utils class is important and here is reponsible to keep state of the Game

# Service
This part contain a service and implementation responsible to comunicate with the controller
IGameService.java

# Controller
GameController.java
This is the renderer of Api response. He expose endpoints and call the service for actions

# Run
To run the app you can clone this repository (Master branch), use an IDE (like Eclipse or InteliJ) to import the project and install it 
or launch a maven clean install in command line inside the root source of the project (hopping you have maven installed and available anywhere on your computer) 

Then  run java -jar target/Kata-CCE-0.0.1-SNAPSHOT.jar

![captureJar](https://user-images.githubusercontent.com/63635396/213752949-66a5b2fe-9d44-4277-9378-d3f8720d8f14.PNG)

# What next ?
- Normally is better to use a database to save data
- The Swagger behavior should be configure to have a better description of Apis
- The logging should be configure to persist sever massages 
