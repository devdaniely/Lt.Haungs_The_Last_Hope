import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gate here.
 * 
 * @author (Code by Jonathan)
 */
public class Gate extends Solid
{
    /**
     * Act - do whatever the Gate wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Gate()
    {
        GreenfootImage img = getImage();
        img.scale(16,32);
        setImage(img);
    }
    public void act() 
    {        
    }  
    public void removeGate()
    {
        World world;
        world = getWorld();
        world.removeObject(this);
    }
    
    
    public void destroy()
    {
        Actor wall;
        wall = getOneIntersectingObject(Solid.class);
        if (wall != null)
        {
            World world;
            world = getWorld();
            world.removeObject(this);

        }
    }
}
