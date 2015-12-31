import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Alarm here.
 * 
 * @author (Code by Zach)
 */
public class Alarm extends Actor
{
    /**
     * Act - do whatever the Alarm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int delay;
    private int del;
    private int radius;
    private GreenfootImage image1=new GreenfootImage("blue-draught.png");
    private GreenfootImage image2=new GreenfootImage("red-draught.png");
    private World world;
    /**
     * Act - do whatever the Alarm wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Alarm(World w)
    {
        //GreenfootImage img = getImage();
        //img.scale(50,50);
        //img.setTransparency(150);
        //setImage(img);
        world = w;

    }

    public void act() 
    {
        // Add your action code here.

        ChangeSize();
        delay++;
        del++;

    }   
    public void ChangeSize()
    {

        //GreenfootImage i = getImage();
        //i.scale(100,100);
        //setImage(i);

        if(delay>200 && delay<300)
        {
            GreenfootImage im = getImage();
            im.scale(150,150);
            im.setTransparency(100);
            setImage(im);
            StartAlarm();

            
        }
        if( delay<200 )
        {
            setImage(image1);
            GreenfootImage i = getImage();
            i.scale(50,50);
            i.setTransparency(100);
            setImage(i);
        }

        if(delay>300)
        {
            delay = 0;
            //del = 0;


        }
    }

    public void StartAlarm()
    {

        Actor player;
        player = getOneIntersectingObject(Player.class);
        if(player != null )
        {
            flash();
            World w;
            Levelset b = (Levelset)getWorld();
            b.spawnRobots();
            Greenfoot.playSound("alarm_sound.mp3");
            //Credit to soundbible.com
        }
        Actor clone;
        clone = getOneIntersectingObject(Clone.class);
        if(clone != null )
        {
            flash();
            World w;
            Levelset b = (Levelset)getWorld();
            b.spawnRobots();
            Greenfoot.playSound("alarm_sound.mp3");
            //Credit to soundbible.com
        }
    }

    public void flash()
    {
        if(getImage() == image1)
        {
            setImage(image2);
        }else{
            setImage(image1);
        }
    }
}
