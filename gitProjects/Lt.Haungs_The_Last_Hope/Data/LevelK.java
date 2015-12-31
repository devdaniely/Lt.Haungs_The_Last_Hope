import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class LevelK here.
 * 
 * @author (Ken) 
 * @version (a version number or a date)
 */
public class LevelK extends Levelset
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

    /**
     * Constructor for objects of class LevelK.
     * 
     */
    public LevelK()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        prepare();
    }

    private void prepare()
    {
        addObject( new Wall(), a, d);
        addObject( new Wall(), b, d);
        addObject( new Wall(), c, d);
        addObject( new Wall(), g, c);
        addObject( new Wall(), h, c);
        addObject( new Wall(), i, c);
        addObject( new Wall(), j, c);
        addObject( new Wall(), m, c);
        addObject( new Wall(), n, c);
        addObject( new Wall(), o, c);
        addObject( new Wall(), p, c);
        addObject( new Wall(), q, c);
        addObject( new Wall(), r, c);
        addObject( new Wall(), s, c);
        addObject( new Wall(), t, c);
        addObject( new Wall(), f, h);
        addObject( new Wall(), e, h);
        addObject( new Wall(), d, h);
        addObject( new Wall(), a, j);
        addObject( new Wall(), d, n);
        addObject( new Wall(), a, s);
        addObject(new Wall(), b, s);
        addObject(new Wall(), c, s);
        addObject( new Wall(), d, s);
        addObject( new Wall(), e, s);
        addObject( new Wall(), f, s);
        addObject( new Wall(), g, s);
        addObject( new Wall(), h, s);
        addObject( new Wall(), j, s);
        addObject( new Wall(), j, r);
        addObject( new Wall(), l, s);
        addObject( new Wall(), l, r);
        addObject( new Wall(), l, q);
        addObject( new Wall(), l, p);
        addObject( new Wall(), j, n);
        addObject( new Wall(), l, l);
        addObject( new Wall(), j, j);
        addObject( new Wall(), l, h);
        addObject( new Wall(), j, f);
        addObject( new Wall(), l, d);
        addObject( new Wall(), o, s);
        addObject( new Wall(), p, s);
        addObject( new Wall(), q, s);
        addObject( new Wall(), r, s);
        addObject( new Wall(), s, s);
        addObject( new Wall(), t, s);
        addObject( new Wall(), a, l);
        addObject( new Wall(), e, m);
        addObject( new Wall(), e, n);
        addObject( new Wall(), e, k);
        addObject( new Wall(), e, j);
        addObject( new Wall(), e, i);
        addObject( new Wall(), g, f);
        addObject( new Wall(), g, g);
        addObject( new Wall(), g, h);
        addObject( new Wall(), a, e);
        addObject( new Wall(), t, q);
        addObject( new Wall(), s, q);
        Gate gate = new Gate();
        addObject( gate, s, r);
        addObject( new ClonePress(gate), t, b);
        addObject( new NextLevel(), t, r);
        addObject( new Obstacle(), f, g+2);
        //addObject( new Obstacle(), c, s+2);
        //addObject( new Obstacle(), b, s+2);
        addObject( new Obstacle(), i, s+2);
        addObject( new Obstacle(), k, s+2);
        addObject( new Obstacle(), m, s+2);
        addObject( new Obstacle(), n, s+2);
        addObject( new Turret(), e, l);
        addObject( new Turret(), g, e);
        addObject( new Player(), a, c);
        addObject( new PSpawn(), a, c);
        addObject( new Wall(), h, d);
        addObject( new Wall(), h, e);
        addObject( new Wall(), h, f);
        addObject( new Wall(), f, k);
        addObject( new Wall(), f, l);
        addObject( new Wall(), f, m);
        addObject( new Wall(), g, b);
        addObject( new Wall(), g, a);
        CloneTurret cturret = new CloneTurret();
        addObject( cturret, a, r);
        cturret.setRotation(180);
        GreenfootImage image = cturret.getImage();
        image.mirrorVertically();
        cturret.setImage(image);
        
        Gas gas = new Gas();
        addObject(gas, d, g-8);
        addObject(new CloneLever(gas), a, i);
        tex.setImage("6.png");
        addObject(tex, 160, 176);
        addObject(new Countdown(),d,b);
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
                Level6 go= new Level6();
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