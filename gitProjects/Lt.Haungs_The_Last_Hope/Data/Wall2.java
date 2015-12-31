import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Wall2 here.
 * 
 * @author (Code by Zach)
 */
public class Wall2 extends Solid
{
    /**
     * Act - do whatever the Wall2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */  
    public void act() 
    {
        getImage().setTransparency(255);
        removeBullet();
        backAndForth();
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

    public void backAndForth()
    {
        move(1);
        if(getX()>300)
        {
            turn(180);
        }
        if (getX()<200)
        {
            turn(180);
        }
    }

}