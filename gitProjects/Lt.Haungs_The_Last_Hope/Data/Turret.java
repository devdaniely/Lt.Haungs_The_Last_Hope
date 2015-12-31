import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turret here.
 * 
 * @author (Code by Zach)
 */
public class Turret extends Actor
{
    /**
     * Act - do whatever the Turret wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 100;
    public Turret()
    {
        GreenfootImage img = getImage();
        img.scale(16,16);
        setImage(img);
    }

    public void act() 
    {
        delay++;

        if( delay > 99 ) {
            fireBullet();
            delay = 0;
        }
    }

    private void fireBullet() {
        Bullet b = new Bullet(getRotation() );

        getWorld().addObject(b, getX(), getY());
    }

}
