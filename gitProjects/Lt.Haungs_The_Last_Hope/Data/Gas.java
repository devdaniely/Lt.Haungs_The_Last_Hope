import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gas here.
 * 
 * @author (Code by Zach)
 */
public class Gas extends Actor
{
    public int fadeFrames;
    /**
     * Act - do whatever the Gas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Gas()
    {
        /*GreenfootImage img = getImage();
        img.scale(48 , 32 );
        img.setTransparency(150);
        setImage(img);
         */
        fadeFrames = 0;        
    }

    public void act() 
    {
        if(fadeFrames==10)
        {
            getImage().setTransparency(150);
        }
        if(fadeFrames==20)
        {
            getImage().setTransparency(100);
        }
        if(fadeFrames==30)
        {
            getImage().setTransparency(150);
        }
        fadeFrames++;
        if(fadeFrames>=40)
        {
            getImage().setTransparency(200);
            fadeFrames = 0;
        }
        killPlayer();
    }    

    public void killPlayer()
    {
        Actor player;
        player = getOneIntersectingObject(Player.class);
        if (player != null)
        {
            World world;
            world = getWorld();
            world.removeObject(player);
            PSpawn sp =(PSpawn)getWorld().getObjects(PSpawn.class).get(0);
            world.addObject(player,sp.getX(),sp.getY());
            Greenfoot.playSound("dying_sound.mp3");
            //Credit to soundbible.com
        }
    }

    public void removeGas()
    {
        World world; 
        world = getWorld();
        world.removeObject(this);
    }
}

