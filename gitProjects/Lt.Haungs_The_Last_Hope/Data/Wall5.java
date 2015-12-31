import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall5 here.
 * 
 * @author (Code by Ken)
 */
public class Wall5 extends Solid
{
    /**
     * Act - do whatever the Wall5 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Move();
    }    

    public void Move()
    {
        Actor player;
        player = getOneIntersectingObject(Player.class);
        if(player != null)
        {
            World world;
            world = getWorld();
            player.move(-1);
        }
        Actor clone;
        clone = getOneIntersectingObject(Clone.class);
        if(clone != null)
        {
            World world;
            world = getWorld();
            clone.move(-1);
        }
    } 
}
