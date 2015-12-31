import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClonePress here.
 * 
 * @author (Code by Zach)
 */
public class ClonePress extends Actor
{
    /**
     * Act - do whatever the ClonePress wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Gate gate ;
    public ClonePress(Gate g)
    {
        GreenfootImage img = getImage();
        img.scale(16,16);
        setImage(img);
        gate = g;
    }
    public void act() 
    {
        
        
        if(this!=null)
        {
        Actor clone;
        clone = getOneIntersectingObject(Clone.class);
        if (clone != null)
        {
            gate.removeGate();
            World world;
            world = getWorld();
            world.removeObject(this);
            Greenfoot.playSound("door_open.mp3");
            //Credit to soundbible.com
        }
        }
    }  
    
}
