import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Solid here.
 * 
 * @author (Code by Michael)
 */
public class Solid extends Actor
{
    /**
     * Act - do whatever the Solid wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

    }    

    public void destroy()
    {
        Actor bullet;
        bullet = getOneIntersectingObject(Bullet.class);
        if (bullet != null)
        {
            World world;
            world = getWorld();
            world.removeObject(bullet);

        }
        Actor bullet2;
        bullet2 = getOneIntersectingObject(Bullet2.class);
        if (bullet2 != null)
        {
            World world;
            world = getWorld();
            world.removeObject(bullet2);

        }
    }

}
