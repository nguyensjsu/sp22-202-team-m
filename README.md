# Team M

High Level Planing, Feature Breakdown

![alt text](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/img.png?raw=true)

# Design Patterns

*Factory Pattern*

1. Used the factory pattern to create objects for different types of `foods` and `obstacles`
2. New objects are created using parent factory classes of `FoodFactory` and `ObstacleFactory`
3. As the game progresses and levels up, more obstacles and food options could be added by creating more classes implementing the same parent factory classes
4. In this way a common behaviour could be specified in the factory classes for future derive classes to be created

![alt text](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/ClassDiagram_FactoryDesignPattern.png?raw=true)

*State Pattern*

![alt text](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/ClassDiagram_StateDesignPattern.png?raw=true)

*Observer Pattern*

![alt text](https://github.com/nguyensjsu/sp22-202-team-m/blob/main/Images/ClassDiagram_ObserverDesignPattern.png?raw=true)