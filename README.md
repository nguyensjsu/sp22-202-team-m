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

### High Level Planning, Feature Breakdown

![alt text](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/img.png?raw=true)

## Features and Contributions

* Ankita - using State and Observer Pattern:
  * Five levels with increasing speed for each level.
  * Display of current score, level, game over, and you win.
* Thinh - using Observer Pattern:
  * Different Background for each one of the levels.
  * Snake Body and Snake Head Image Rendering.
* Trupti - using Factory Pattern:
  * Food for snake to eat.
  * Obstacles to avoid for each one of the levels.
* Maitreyi:
  * Sound effects when snake eats Food and when snake hits any of the obstacles.


## Design Patterns

*Factory Pattern*

1. Used the factory pattern to create objects for different types of `foods` and `obstacles`
2. New objects are created using parent factory classes of `FoodFactory` and `ObstacleFactory`
3. As the game progresses and levels up, more obstacles and food options could be added by creating more classes implementing the same parent factory classes
4. In this way a common behaviour could be specified in the factory classes for future derive classes to be created

![alt text](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/ClassDiagram_FactoryDesignPattern.png?raw=true)

*State Pattern*

1. Implemented state pattern in `LevelState` which is a level state machine to help transition from the current level to the next level. 
2. Up to 5 levels are created, each having a separate class, for the game design with the current level being displayed on screen.

![alt text](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/ClassDiagram_StateDesignPattern.png?raw=true)

*Observer Pattern*

1. Implemented observer pattern in `Score` which acts as the Subject and notifies its observer, `LevelState` of current score.
2. Implemented observer pattern in `LevelState` which acts as the Subject and notifies its observer, `SnakeWorld` of current level changes. 

![alt text](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/ClassDiagram_ObserverDesignPattern.png?raw=true)

