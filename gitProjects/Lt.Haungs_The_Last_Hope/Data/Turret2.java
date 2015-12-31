import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Turret2 here.
 * 
 * @author (Code by Zach)
 */
public class Turret2 extends Turret
{
    /**
     * Act - do whatever the Turret2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int delay = 115;
    int del = 200;
     public Turret2()
    {
        GreenfootImage img = getImage();
        img.scale(16,16);
        setImage(img);
    }
    public void act() 
    {
        delay++;
        del++;

            if( delay > 280 ) {
                
                delay = 0;
            }
            if( delay > 130) {
                fireBullet();
                
        }
    }


    private void fireBullet() {
        Bullet b = new Bullet(getRotation() );
        
        getWorld().addObject(b, getX(), getY());
    }
   
}

