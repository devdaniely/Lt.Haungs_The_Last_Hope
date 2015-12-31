import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NextLevel here.
 * 
 * @author (Code by Chris)
 */
public class NextLevel extends Actor
{
    /**
     * Act - do whatever the NextLevel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor player;
        player = getOneIntersectingObject(Player.class);
        if (player != null)
        {
            World w = getWorld();
            w.removeObject(player);
            Levelset level;
            level = (Levelset)getWorld();
            level.endGame();
            Greenfoot.playSound("level_complete.mp3");
            //Credit to soundbible.com
        }
        Actor bullet;
        bullet = getOneIntersectingObject(Bullet.class);
        if(bullet != null)
        {
           World world;
           world = getWorld();
           world.removeObject(bullet);
        }
    }    
}
