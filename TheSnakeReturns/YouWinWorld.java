import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.util.List;
import java.util.Map;

import greenfoot.Font;
import greenfoot.Color;
/**
 * Write a description of class YouWinWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YouWinWorld extends World
{
//(font type,bold,italic,size)
    Font font = new Font("Dialog",true,false,40);
    private String[] backgroundPaths = new String[] { "background/bricks.jpg" };
    Integer score;
    
    GameController controller;

    public YouWinWorld(GameController controller, int score)
    {
        super(controller.SCREEN_WIDTH, controller.SCREEN_HEIGHT, controller.SCREEN_CELLSIZE);
        
        this.controller = controller;
        
        GreenfootImage background = new GreenfootImage("background/bricks.jpg");        
        setBackground(background);
        
        GreenfootImage boardImage = new GreenfootImage("display/you_win_sign.png");
        boardImage.scale(640, 480);
        getBackground().drawImage(boardImage, 80, 36);
        
        this.score = score;

        displayTopScore();
        displayMyScore();
        
        Command startGameCmd = new StartGameCommand(controller);
        Button startGameButton = new Button(startGameCmd, "buttons/try_again.png", 240, 60);
        addObject(startGameButton, 40, 41);
    }

    void displayTopScore() {
        FinalScores fs = new FinalScores();
        List<Integer> scores = fs.readFile();
        GreenfootImage currentScore = new GreenfootImage(scores.get(0).toString(),50, Color.WHITE, null);

        if(score > scores.get(0)) {
            System.out.println("Write score!!"+score);
            fs.writeFile(score);
        } else {
            System.out.println("Current"+score +" TOP "+ scores.get(0));
        }
        getBackground().drawImage(currentScore, 390, 230);

    }

    void displayMyScore() {
        GreenfootImage score = new GreenfootImage(this.score.toString(), 50, Color.WHITE, null);
        getBackground().drawImage(score, 400, 330);

    }

}
