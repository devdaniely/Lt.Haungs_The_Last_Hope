import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Countdown here.
 * 
 * @author (Daniel) 
 * @version (a version number or a date)
 */
public class Countdown extends Actor
{
    private GreenfootImage board;
    private GreenfootImage sb;
    public static int score = 0;
    private String label = "TIME: ";

    public Countdown()
    {
        super();

        int boardWidth = 320;
        int boardHeight = 320;
        int boardTransparency = 125;

        //Draw Translucent background
        board = new GreenfootImage(boardWidth, boardHeight);
        //board.setColor(Color.gray);
        //board.setTransparency(boardTransparency);
        //board.fillRect(0,0, boardWidth, boardHeight);
        this.setImage(board);

        //Draw Scoreboard
       
    }

    public void act() 
    {
        update();
    }    

    public int getScore()
    {
        return score;
    }

    public void addScore(int pts)
    {
        score = pts - 1;
        update();
    }

    public void update()
    {
        sb = new GreenfootImage(board);
        sb.drawImage(new GreenfootImage(label + score, 25, Color.white, new Color(0,0,0,0)),110,140);

        this.setImage(sb);
    }
}
