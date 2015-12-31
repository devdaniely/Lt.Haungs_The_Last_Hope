import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (Mike) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{
    private int speed;
    
    /**
     * Act - do whatever the Fireball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fireball()
    {
        GreenfootImage img = getImage();
        img.scale (25,25);
        setImage (img);
    }

    public void act() 
    {
        setLocation(getX(), getY()+5);
        kill();
    }    

    public void kill()
    {
        Actor player;
        player = getOneIntersectingObject(Player.class);
        if (player != null)
        {
            World world;
            world = getWorld();
            world.removeObject(player);            
            Levelset level;
            level = (Levelset)getWorld();
            level.endGame();
            Greenfoot.playSound("dying_sound.mp3");
            //Credit to soundbible.com
        }
    }
    
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
}
