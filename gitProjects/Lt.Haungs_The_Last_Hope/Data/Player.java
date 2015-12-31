import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Rectangle;


/**
 * Write a description of class Player here.
 * 
 * @author (Code by Chris and Daniel) 
 */
public class Player extends Character
{

    private static final int fallNow = 32;
    private int fall;
    private int hspeed;
    private int vspeed;
    private int air;
    private boolean checkUp, checkDown, checkRight, checkLeft;
    private int uch, dch, rch, lch;
    public boolean abletospawn;  
    boolean teleported = false;
    public Player()
    {
        fall = 0;
        air = 0;
        hspeed = 2;
        vspeed = 2;
        checkUp = false;
        checkDown = false;
        checkRight = false;
        checkLeft = false;
        uch = 0;
        dch = 0;
        rch = 0;
        lch = 0;
        abletospawn = true;
    }

    public void act() 
    {
        if(fall>1)
        {
            air=1;
        }
        if(Greenfoot.isKeyDown("space"))
        {
            spawn();
        }

        move();
        jump();
        gravity();
        checkPortal();
    }    

    public void move()
    {   

        if(Greenfoot.isKeyDown("right"))
        {
                        for(int i = -9; i < 9; i++)
            {

                Actor rightCol = getOneObjectAtOffset(8,i,Solid.class);
                if(rightCol==null)
                {
                    checkRight = true;
                }
                else
                {
                    rch+=1;
                }

            }

            if(checkRight==true && rch <= 8)
            {
                if(air==0)
                {
                    setLocation(getX()+hspeed,getY());
                }
                else
                {
                    setLocation(getX()+hspeed/2,getY());
                }
                setImage (new GreenfootImage("bestplayer.png"));
            }

        }
        if(Greenfoot.isKeyDown("left"))
        {

            for(int i = -9; i < 9; i++)
            {

                Actor leftCol = getOneObjectAtOffset(-8,i,Solid.class);
                if(leftCol==null)
                {
                    checkLeft = true;
                }
                else
                {
                    lch+=1;
                }

            }

            if(checkLeft = true && lch <=8)
            {
                if(air==0)
                {
                    setLocation(getX()-hspeed,getY());
                }
                else
                {
                    setLocation(getX()-hspeed/2,getY());
                }
                setImage (new GreenfootImage("bestplayerleft.png"));
            }

        }
        lch = 0;
        rch = 0;
        checkLeft = false;
        checkRight = false;

    }

    public void jump()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            if(air==0)
            {
                fall = 1;
                air=1;
            }
        }
        if(fall>=1)
        {

            for(int p = -9; p < 9; p++)
            {

                Actor upCol = getOneObjectAtOffset(p,-8,Solid.class);
                if(upCol==null)
                {
                    checkUp = true;
                }
                else
                {
                    uch +=1;
                }

            }

            if(checkUp==true&&uch<=8)
            {
                if(fall<fallNow/2)
                {
                    setLocation(getX(),getY()-vspeed);
                }
                else
                {
                    if(fall<(fallNow/2 + fallNow/4))
                    {
                        setLocation(getX(),getY()-1);
                    }
                    else
                    {
                        setLocation(getX(),getY());
                    }
                }
            }
            fall++;

        }
        uch = 0;
        checkUp = false;
    }

    public void gravity()
    {
        for(int p = -9; p < 9; p++)
        {

            Actor downCol = getOneObjectAtOffset(p,8,Solid.class);
            if(downCol==null)
            {
                checkDown = true;
            }
            else
            {
                dch +=1;
            }

        }

        if(checkDown = true && dch<=8)
        {
            if(fall>=fallNow||fall==0)
            {
                setLocation(getX(),getY()+vspeed);
                fall=0;
            }
            air = 1;
        }
        else
        {
            air = 0;
        }
        dch = 0;
        checkDown = false;
    }

    public void spawn()
    {
        if(abletospawn==true)
        {
            World world = getWorld();
            world.addObject(new Clone(), getX(), getY());
            abletospawn=false;
            Greenfoot.playSound("clone_spawn.mp3");
            //Credit to soundbible.com
        }
    }

    public void setAble(boolean b)
    {
        abletospawn = b;
    }

    
    private void checkPortal()
    {
        //Code by Ken
        if (getOneObjectAtOffset(0, 0, Portal.class) != null && !teleported)
        {
            Portal portal = (Portal) getOneIntersectingObject(Portal.class);
            setLocation(portal.getPortalLink().getX(), portal.getPortalLink().getY());
            teleported = true;
            Greenfoot.playSound("teleport_sound.mp3");
            //Credit to soundbible.com
        }

        if (teleported && getIntersectingObjects(Portal.class).isEmpty())
        {
            teleported = false;
        }
    }
}
