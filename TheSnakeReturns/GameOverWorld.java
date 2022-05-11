import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;
import java.util.List;
import java.util.Map;

import greenfoot.Font;
import greenfoot.Color;
/**
 * Write a description of class GameOver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameOverWorld extends World
{
    //(font type,bold,italic,size)
    Font font = new Font("Dialog",true,false,40);
    Color darkGreen = new Color(0, 51, 0);
    Color blue = new Color(48, 23, 138);
    Color green = new Color(0, 255, 0 , 150);
    private String[] backgroundPaths = new String[] { "background/bricks.jpg" };
    Integer score;
    int x = 200;
    int y = 150;
    int dx = 50;
    int dy = 35;

    public GameOverWorld(int score)
    {
        super(61, 41, 10);
        
        GreenfootImage background = new GreenfootImage("background/bricks.jpg");        
        setBackground(background);
        
        GreenfootImage boardImage = new GreenfootImage("display/game_sign.png");
        boardImage.scale(450, 360);
        getBackground().drawImage(boardImage, 80, 36);
        
        System.out.println("Score=="+score);
        this.score = score;


        displayTopScore();
        displayMyScore();
        displayGameOver();

        Greenfoot.stop();
    }

    void displayTopScore() {
        FinalScores fs = new FinalScores();

        GreenfootImage image = new GreenfootImage(300, 100);
        image.setFont(font);
        image.setColor(blue);
        image.drawString("Top Score", 0, 52);
        getBackground().drawImage(image, x,52);

        List<Integer> scores = fs.readFile();
        System.out.println("Scores in display top score"+scores);
        GreenfootImage currentScore = new GreenfootImage(scores.get(0).toString(),20, Color.WHITE, null);

        if(score > scores.get(0)) {
            System.out.println("Write score!!"+score);
            fs.writeFile(score);
        } else {
            System.out.println("CUrrent"+score +" TOP "+ scores.get(0));
        }
        getBackground().drawImage(currentScore, x+100, y-20);

    }

    void displayMyScore() {
        GreenfootImage image = new GreenfootImage(300, 100);
        image.setFont(font);
        image.setColor(blue);
        image.drawString("Current Score", 0, 100);
        getBackground().drawImage(image, x, 82);

        GreenfootImage score = new GreenfootImage(this.score.toString(), 20, Color.WHITE, null);
        getBackground().drawImage(score, x+100, y+50);

    }

    void displayGameOver() {
        GreenfootImage image = new GreenfootImage(300, 100);
        image.setFont(font);
        image.setColor(darkGreen);
        image.drawString("Game Over", ShiftEast(1, 2), ShiftSouth(50, 2));
        image.setColor(green);
        image.drawString("Game Over", 1, 50);
        getBackground().drawImage(image, x, y+50);
    }

    /**
     * ShiftSouth -shifts the coordnates down by the distance handed to it
     * @param int p
     * @param int distance
     */
    public int ShiftSouth(int p, int distance) {
        return (p + distance);
    }

    /**
     * ShiftEast - shifts the coordinates right by the distance handed to it
     * @param int p
     * @param int distance
     */
    public int ShiftEast(int p, int distance) {
        return (p + distance);
    }

}
