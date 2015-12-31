import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controls here.
 * 
 * @author (Jonathan) 
 * @version (a version number or a date)
 */
public class Controls extends World
{

    /**
     * Constructor for objects of class Controls.
     * 
     */
    public Controls()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(320, 320, 1); 
    }
    public int timer = 0;
    public void act()
    {
        timer++;
        if (timer > 10)
        {
            if(Greenfoot.isKeyDown("enter"))
            {
                Level1 l = new Level1();
                Greenfoot.setWorld(l);
            } 
        }

    }
}
