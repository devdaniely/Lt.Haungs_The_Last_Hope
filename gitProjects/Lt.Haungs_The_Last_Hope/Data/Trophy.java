import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**90
 * 
 * Write a description of class Trophy here.
 * 
 * @author (Code by Jonathan)
 */
public class Trophy extends Actor
{
    /**
     * Act - do whatever the Trophy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Trophy()
    {
        GreenfootImage img = getImage();
        img.scale(16,16);
        setImage(img);
    }

    public void act() 
    {

        Actor player;
        player = getOneIntersectingObject(Player.class);
        if (player != null)
        {
            World world;
            world = getWorld();
            world.removeObject(this);
            Greenfoot.playSound("trophy_eat.mp3");
            //Credit to soundbible.com
            ScoreBoard scoreboard = new ScoreBoard();
            scoreboard.addScore(1000);
        }
    }
}