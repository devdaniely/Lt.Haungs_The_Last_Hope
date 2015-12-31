import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CloneLever here.
 * 
 * @author (Code by Jonathan)
 */
public class CloneLever extends Actor
{
    private Gas gas;
    private GreenfootImage image1=new GreenfootImage("buttonup.png");
    private GreenfootImage image2=new GreenfootImage("buttonpush.png");
    /**
     * Act - do whatever the CloneLever wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public CloneLever(Gas g)
    {
        GreenfootImage img = getImage();
        img.scale(16,16);
        setImage(img);
        gas = g;
    }

    public void act() 
    {
        if(getImage() != image2)
        {
            Actor clone;
            clone = getOneIntersectingObject(Clone.class);
            if (clone != null)
            {
                gas.removeGas();
                setImage(image2);
                getImage().scale(16, 16);
                Greenfoot.playSound("power_off.mp3");
                //Credit to soundbible.com
            }
        }
    }  
}