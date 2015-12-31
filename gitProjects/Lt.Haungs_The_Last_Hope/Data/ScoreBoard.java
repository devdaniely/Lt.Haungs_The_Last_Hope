import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (Code by Jonathan and Daniel)
 */
public class ScoreBoard extends Actor
{
    private GreenfootImage board;
    private GreenfootImage sb;
    public static int score = 0;
    private String label = "Score: ";

    public ScoreBoard()
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
        update();
    }

    public void act() 
    {
        // Add your action code here.
    }    

    public int getScore()
    {
        return score;
    }

    public void addScore(int pts)
    {
        score = pts + score;
        update();
    }

    public void setScore()
    {
        score = 0;
    }

    public void update()
    {
        sb = new GreenfootImage(board);
        sb.drawImage(new GreenfootImage(label + score, 25, Color.WHITE, new Color(0,0,0,0)),110,140);

        this.setImage(sb);
    }
}
