import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Rectangle;
/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Solid
{

    public void act() 
    {
        getImage().setTransparency(255);
        destroy();
    }    

    public Rectangle getBounds() {
        return new Rectangle(this.getX(), this.getY(), 16, 16);
    }

}
