import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall3 here.
 * 
 * @author (Code by Zach)
 */
public class Wall3 extends Solid
{
    /**
     * Act - do whatever the Wall3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        getImage().setTransparency(255);
        removeBullet();
        upAndDown();
        destroy();
    }    

    public void removeBullet()
    {
        Actor bullet;
        bullet = getOneIntersectingObject(Bullet.class);
        if (bullet != null)
        {
            World world;
            world = getWorld();
            world.removeObject(bullet);
        } 
    }    

    public void upAndDown()
    {
        move(1);
        if(getY()>199)
        {
            turn(180);
        }
        if (getY()<100)
        {
            turn(180);
        }
    }

}    
