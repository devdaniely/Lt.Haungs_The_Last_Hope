import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Level7 here.
 * 
 * @author (Jonathan) 
 * @version (a version number or a date)
 */
public class Level7 extends Levelset
{
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
    private int delay = 0;
    private int robotBottom = 300;
    private int robotTop = 250;
    /**
     * Constructor for objects of class Level7.
     * 
     */
    public Level7()
    {    

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        
        addObject(new Player(), b, d);
        addObject(new PSpawn(), b, d);
        addObject(new Wall(), a, s);
        addObject(new Wall(), b, s);
        addObject(new Wall(), c, s);
        addObject(new Wall(), d, s);
        addObject(new Wall(), e, s);
        addObject(new Wall(), f, s);
        addObject(new Wall(), g, s);
        addObject(new Wall(), h, s);
        addObject(new Wall(), i, s);
        addObject(new Wall(), j, s);
        addObject(new Wall(), k, s);
        addObject(new Wall(), l, s);
        addObject(new Wall(), m, s);
        addObject(new Wall(), n, s);
        addObject(new Wall(), o, s);
        addObject(new Wall(), p, s);
        addObject(new Wall(), q, s);
        addObject(new Wall(), r, s);
        addObject(new Wall(), s, s);
        addObject(new Wall(), t, s);
        addObject(new Wall(), l, p);
        addObject(new Wall(), a, e);
        addObject(new Wall(), b, e);
        addObject(new Wall(), c, e);
        addObject(new Wall(), d, e);
        addObject(new Wall(), e, e);
        addObject(new Wall(), e, f);
        addObject(new Wall(), e, g);
        addObject(new Wall(), e, h);
        addObject(new Wall(), e, i);
        addObject(new Wall(), e, j);
        addObject(new Wall(), e, k);
        addObject(new Wall(), e, l);
        addObject(new Wall(), j, e);
        addObject(new Wall(), j, f);
        addObject(new Wall(), j, g);
        addObject(new Wall(), j, h);
        addObject(new Wall(), j, i);
        addObject(new Wall(), j, j);
        addObject(new Wall(), j, k);
        addObject(new Wall(), j, l);
        addObject(new Wall(), k, r);
        addObject(new Wall(), k, n);
        addObject(new Wall(), l, l);
        addObject(new Wall(), k, j);
        addObject(new Wall(), l, h);
        addObject(new Wall(), k, f);
        addObject(new Wall(), m, d);
        addObject(new Wall(), o, d);
        addObject(new Wall(), q, d);
        addObject(new Wall(), r, d);
        addObject(new Wall(), s, d);
        addObject(new Wall(), t, d);
        addObject(new Obstacle(), f, e);
        addObject(new Obstacle(), f, f);
        addObject(new Obstacle(), f, g);
        addObject(new Obstacle(), f, h);
        addObject(new Obstacle(), f, i);
        addObject(new Obstacle(), f, j);
        addObject(new Obstacle(), f, k);
        addObject(new Obstacle(), f, l);
        addObject(new Obstacle(), i, e);
        addObject(new Obstacle(), i, f);
        addObject(new Obstacle(), i, g);
        addObject(new Obstacle(), i, h);
        addObject(new Obstacle(), i, i);
        addObject(new Obstacle(), i, j);
        addObject(new Obstacle(), i, k);
        addObject(new Obstacle(), i, l);

        addObject(new Turret(), t, f);
        addObject(new Turret(), t, i);
        addObject(new Turret(), t, l);
        addObject(new Wall(), m, l);
        addObject(new Wall(), n, l);
        addObject(new Wall(), o, l);
        addObject(new Wall(), p, l);
        addObject(new NextLevel(), t, c-8);
        CloneTurret cturret = new CloneTurret();
        addObject(cturret, a, r);
        cturret.setRotation(180);
        GreenfootImage image = cturret.getImage();
        image.mirrorVertically();
        cturret.setImage(image);
        tex.setImage("5.png");
        addObject(tex, 160, 227);
        addObject(new Countdown(),d,b);
    }
    
    public void spawnRobots()
    {
        if(delay > 20)
        {
            Robot robot = new Robot();
            robot.setBottom(robotBottom);
            robot.setTop(robotTop);
            addObject(robot, t+5, r);
            delay = 0;
        }
    }
    Text tex = new Text();
    public int time = 0;
    public boolean levelcheck = false;
    public boolean textcheck = false;
    public int timer = 20000;
    public void act()
    {
        time = time +1;
        timer = timer -1;
        super.decreaseTime(timer);
        //System.out.println(time);

        if( time > 10)
        {
            textcheck = true;
            if (textcheck ==true)
            {
                if (Greenfoot.isKeyDown("enter"))
                {
                    removeObject(tex);
                }
            }
        }

        if (levelcheck ==true)
        {
            if (Greenfoot.isKeyDown("enter"))
            {
                LevelK go= new LevelK();
                Greenfoot.setWorld(go);
            }
        }
        levelTime--;
    }
    int levelTime = 20000;
    public void endGame()
    {
        if (levelTime > 0)
        {
            super.increaseScore(levelTime);
        }
        addObject(new Continue(), 165, 253);
        addObject(scoreboard, 160,160);
        levelcheck = true;
        levelTime = levelTime + 1000;
    }
}
