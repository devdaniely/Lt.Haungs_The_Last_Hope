import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class Portal here.
 * 
 * @author (Code by Ken) 
 */
public class Portal extends Actor
{
    Portal portalLink;

    public Portal(Color color)
    {
        GreenfootImage image = new GreenfootImage(60, 120);
        image.setColor(color);
        image.fillOval(0, 0, 59, 119);
        image.scale(20,20);
        setImage(image);
    }

    public void setPortalLink(Portal portal)
    {
        portalLink = portal;
    }

    public Portal getPortalLink()
    {
        return portalLink;
    }
}
