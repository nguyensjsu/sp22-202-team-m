# Team M

## Team Members
    * Maitreyi
    * Trupti
    * Thinh
    * Ankita

## Team Journals
* [Maitreyi's Journal](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Journals/MaitreyiKunnavakkamVinjimur.md)
* [Trupti's Journal](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Journals/TruptiLokhande.md)
* [Thinh's Journal](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Journals/ThinhLu.md)
* [Ankita's Journal](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Journals/AnkitaJaswal.md)

## Project Topic - The Snake Returns
This is a greenfoot project based off of the retro nokia snake game with improved features implemented using design patterns.
It is our twist on the snake game where
1. There are multiple levels as the snake progresses 
2. Snake score increases by eating food
3. Obstacles that the snake should avoid, three lives on hitting obstacles and dies after that
4. Scoreboard to track the Top Score

## The Snake Returns - Ad

[The Snake Returns](https://www.youtube.com/watch?v=2dcgnb5a5A0)

## High Level Planning, Feature Breakdown

![alt text](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/img.png?raw=true)


## Demo Video - Game Play

## Features and Contributions

* Ankita - using State and Observer Pattern:
  * Five levels with increasing speed for each level.
  * Display of current score, level, game over, and you win.
* Thinh - using Observer Pattern:
  * Different Background for each one of the levels.
  * Snake Body and Snake Head Image Rendering.
* Trupti - using Factory Pattern:
  * Different types of Food for snake to eat.
  * Different types of obstacles to avoid for each one of the levels.
* Maitreyi:
  * Add Obstacles and decrease life on running into it using Observer pattern.
  * Sound effects when snake eats Food and when snake hits any of the obstacles.
  * Persist top scores on disk to compare 
  * Added GameOverWorld(Scoreboard) to show the TopScore and Current Score when hitting obstacles/wall.

## High Level Diagrams

## Activity Diagram
The below diagram shows the high level workflow of the game
![Activity Diagram](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/HighLevel_ActivityDiagram.png?raw=true)

## Class Diagram
The below diagram shows the major classes of the game
![overall](https://user-images.githubusercontent.com/98665151/168442876-e8bd22b6-6786-4fc4-9b98-a03177f26b41.jpg)



## Design Patterns - Key Features

*Factory Pattern*

1. Used the factory pattern to create objects for different types of `foods` and `obstacles`
2. New objects are created using parent factory classes of `FoodFactory` and `ObstacleFactory`
3. As the game progresses and levels up, more obstacles and food options could be added by creating more classes implementing the same parent factory classes
4. In this way a common behaviour could be specified in the factory classes for future derive classes to be created

![ClassDiagram_FactoryDesignPattern](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/ClassDiagram_FactoryDesignPattern.png?raw=true)

*State Pattern*

1. Implemented state pattern in `LevelState` which is a level state machine to help transition from the current level to the next level. 
2. Up to 5 levels are created, each having a separate class, for the game design with the current level being displayed on screen.

![ClassDiagram_StateDesignPattern](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/ClassDiagram_StateDesignPattern.png?raw=true)

*Observer Pattern*

1. Implemented observer pattern in `Score` which acts as the Subject and notifies its observer, `LevelState` of current score.
2. Implemented observer pattern in `LevelState` which acts as the Subject and notifies its observer, `SnakeWorld` of current level changes. 

![ClassDiagram_ObserverDesignPattern](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/ClassDiagram_ObserverDesignPattern.png?raw=true)

3. Implemented observer pattern in `SnakeWorld` which acts as the Subject and notifies its observer, `Life` of current level changes. 
![life obs](https://user-images.githubusercontent.com/98665151/168442696-a8b80785-018e-462d-b234-08d36f1c14de.png)


*Command Pattern*

1. Created `Command` interface and `Button` class that uses `Command` to handle button-pressed event.
2. Implemented `AppController` class for handling screen transitions.
3. Created `StartGameCommand` that implement `Command` interface and uses `AppController` to start new game by transitioning to SnakeWorld Screen.

![ClassDiagram_CommandDesignPattern](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/ClassDiagram_CommandDesignPattern.png?raw=true)


### XP Core Values
Communication - thru visuals ways and excel sheet (Miro board)

### BurnDown Chart
![burndown](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/BurnDownChart.jpg)


## UI Wireframe
![WhatsApp Image 2022-05-14 at 10 58 35 AM](https://user-images.githubusercontent.com/98665151/168443334-96b5d1dc-0c67-4d8f-aeb9-45859a8c2f2c.jpeg)

