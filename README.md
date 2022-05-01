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


### High Level Planing, Feature Breakdown

![alt text](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/img.png?raw=true)

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
2. Implemented observer pattern in `LevelState` which acts as the Subject and notifies its observer, `SnakeWorld` of current changed level. 
![alt text](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/ClassDiagram_ObserverDesignPattern.png?raw=true)