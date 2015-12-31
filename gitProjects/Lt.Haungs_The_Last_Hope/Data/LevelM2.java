import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelM2 here.
 * 
 * @author (Mike) 
 * @version (a version number or a date)
 */
public class LevelM2 extends Levelset
{
    private int fireballSpawnRate = 20;
    private int fireballSpeed = 5;
    public boolean levelcheck = false;
    private int time = 0;
    /**
     * Constructor for objects of class LevelM2.
     * 
     */
    private int a = 8;
    private int b = 24;
    private int c = 40;
    private int d = 56;
    private int e = 72;
    private int f = 88;
    private int g = 104;
    private int h = 120;
    private int i = 136;
    private int j = 152;
    private int k = 168;
    private int l = 184;
    private int m = 200;
    private int n = 216;
    private int o = 232;
    private int p = 248;
    private int q = 264;
    private int r = 280;
    private int s = 296;
    private int t = 312;

    public LevelM2()
    {    
        prepare();
    }

    private void prepare()
    {
        addObject(new Wall(), a,s);
        addObject(new Wall(), b,s);
        addObject(new Wall(), c,s);
        addObject(new Wall(), d,s);
        addObject(new Wall(), e,s);
        addObject(new Wall(), f,s);
        addObject(new Wall(), g,s);
        addObject(new Wall(), h,s);
        addObject(new Wall(), i,s);
        addObject(new Wall(), j,s);
        addObject(new Wall(), k,s);
        addObject(new Wall(), l,s);
        addObject(new Wall(), m,s);
        addObject(new Wall(), n,s);
        addObject(new Wall(), o,s);
        addObject(new Wall(), p,s);
        addObject(new Wall(), q,s);
        addObject(new Wall(), r,s);
        addObject(new Wall(), s,s);
        addObject(new Wall(), t,s);

        addObject(new Wall(), a,c);
        addObject(new Wall(), b,c);
        addObject(new Wall(), c,c);
        addObject(new Wall(), d,c);
        addObject(new Wall(), e,d);
        addObject(new Wall(), f,d);
        addObject(new Wall(), g,d);
        addObject(new Wall(), h,e);
        addObject(new Wall(), i,f);
        addObject(new Wall(), j,f);
        addObject(new Wall(), k,f);
        addObject(new Wall(), l,f);
        addObject(new Wall(), m,e);
        addObject(new Wall(), n,d);
        addObject(new Wall(), o,d);
        addObject(new Wall(), p,d);
        addObject(new Wall(), q,c);
        addObject(new Wall(), r,c);
        addObject(new Wall(), s,c);
        addObject(new Wall(), t,c);

        addObject(new Player(), j,r);
        addObject(scoreboard, 55, 98);

        tex.setImage("end1.png");
        addObject(tex, 160, 179);
    }
    Text tex = new Text();
    public int intcount = 0;
    public int spawnint = 0;
    public void act()
    {
        time ++;
        if (intcount == 0)
        {
            if (Greenfoot.isKeyDown("enter"))
            {
                tex.setImage("end2.png");
                intcount = 2;
            } 
        }
        if (intcount > 1)
        {
            if (intcount < 20)
            {
                intcount ++;
            }

            if (intcount > 50)
            {
                intcount++;
            }
        }
        if (intcount > 10)
        {

            if(Greenfoot.isKeyDown("enter") && spawnint == 0)
            {
                removeObject(tex);
                addObject(new Clone(), a,a);
                addObject(new Clone(), b,a);
                addObject(new Clone(), c,a);
                addObject(new Clone(), d,a);
                addObject(new Clone(), e,a);
                addObject(new Clone(), f,a);
                addObject(new Clone(), g,a);
                addObject(new Clone(), h,a);
                addObject(new Clone(), i,a);
                addObject(new Clone(), j,a);
                addObject(new Clone(), k,a);
                addObject(new Clone(), l,a);
                addObject(new Clone(), m,a);
                addObject(new Clone(), n,a);
                addObject(new Clone(), o,a);
                addObject(new Clone(), p,a);
                addObject(new Clone(), q,a);
                addObject(new Clone(), r,a);
                addObject(new Clone(), s,a);
                addObject(new Clone(), t,a);
                intcount = 100;
                spawnint = 1;
            }
        }
        if (intcount > 110)
        {
            if (levelcheck == false)
            {
                if (Greenfoot.getRandomNumber(1000) < 10)
                {
                    Fireball f = new Fireball();
                    f.setSpeed(fireballSpeed);
                    addObject(f, Greenfoot.getRandomNumber(320), 120);
                    super.increaseScore(5);
                }  
            }
        }

        increaseLevel();
        if (levelcheck ==true)
        {
                OverScreen go = new OverScreen();
                Greenfoot.setWorld(go);
        }
    }

    private void increaseLevel()
    {
        if( time > 1680 && time < 3360)
        {
            fireballSpawnRate = 25;
            fireballSpeed = 6;
        }
        else if( time > 3360 && time < 5040)
        {
            fireballSpawnRate = 30;
            fireballSpeed = 7;
        }
        else if ( time > 5040 && time < 6720)
        {
            fireballSpawnRate = 40;
            fireballSpeed = 8;
        }
        else if ( time > 6720)
        {
            fireballSpawnRate = 50;
            fireballSpeed = 9;
        }

    }

    public void endGame()
    {
        levelcheck = true;
    }
}