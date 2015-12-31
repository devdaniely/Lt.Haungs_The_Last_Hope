import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CloneTurret here.
 * 
 * @author (Code by Ken)
 */
public class CloneTurret extends Actor
{
    /**
     * Act - do whatever the CloneTurret wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 4;
    public CloneTurret()
    {
        GreenfootImage img = getImage();
        img.scale(16,16);
        setImage(img);
    }

    public void act() 
    {
        delay++;
        if(delay > 4)
        {
            fireBullet2();
            delay = 0;
        }
        killClone();
    }    

    public void fireBullet2()
    {
        Bullet2 b2 = new Bullet2(getRotation());
        getWorld().addObject(b2, getX(), getY());
    }

    public void killClone()
    {
        Actor clone;
        clone = getOneIntersectingObject(Clone.class);
        if( clone != null)
        {
            ((Player)getWorld().getObjects(Player.class).get(0)).setAble(true);
            World world;
            world = getWorld();
            world.removeObject(clone);
            Greenfoot.playSound("dying_sound.mp3");
            //Credit to soundbible.com
        }
    }    
}
