import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Robot here.
 * 
 * @author (Code by Zach) 
 */
public class Robot extends Actor
{
    private int bottom;
    private int top;
    /**
     * Act - do whatever the Robot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Robot()
    {
        GreenfootImage img = getImage();
        img.scale(16,16);
        setImage(img);
        turn(-30);
    }

    public void act() 
    {
        //setLocation(getX()-2, getY()+ Greenfoot.getRandomNumber(32)-16);
        move(-2);
        turn(Greenfoot.getRandomNumber(8)-4);
        if(getY()< top )
        {
            turn(-5);
        }
        if( getY()> bottom )
        {
            turn(5);
        }
        eat();
        selfDestruct();
    }    

    public void eat()
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
            ScoreBoard scoreboard = new ScoreBoard();
            scoreboard.addScore(-1000);
        }
        Actor clone;
        clone = getOneIntersectingObject(Clone.class);
        if (clone != null)
        {
            ((Player)getWorld().getObjects(Player.class).get(0)).setAble(true);
            World world;
            world = getWorld();
            world.removeObject(clone);
            Greenfoot.playSound("dying_sound.mp3");
            //Credit to soundbible.com
        }
    }  

    public void selfDestruct()
    {
        if(getX()<2)
        {
            World world;
            world = getWorld();
            world.removeObject(this);
        }
    }

    public void setBottom(int bottom)
    {
        this.bottom = bottom;
    }

    public void setTop(int top)
    {
        this.top = top; 
    }
}

