import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test extends World
{

    /**
     * Constructor for objects of class Test.
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
    
    public Test()
    {    
        super(320, 320, 1);        
        
        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Player(), d, q);
        addObject(new PSpawn(), d, q);
        addObject(new Wall(), a, t);
        addObject(new Wall(), b, t);
        addObject(new Wall(), c, t);
        addObject(new Wall(), d, t);
        addObject(new Wall(), e, t);
        addObject(new Wall(), f, t);
        addObject(new Wall(), d, s);
        addObject(new Wall(), e, s);
        addObject(new Wall(), d, r);
        addObject(new Wall(), e, r);
        addObject(new Wall(), g, t);
        addObject(new Wall(), h, t);
        addObject(new Wall(), i, t);
        addObject(new Wall(), j, t);
        addObject(new Wall(), k, t);
        addObject(new Wall(), j, q);
        addObject(new Wall(), k, q);
        addObject(new Wall(), j, p);
        addObject(new Wall(), k, p);
        addObject(new Wall(), j, o);
        addObject(new Wall(), k, o);
        addObject(new Wall(), l, t);
        addObject(new Wall(), l, s);
        addObject(new Wall(), m, t);
        addObject(new Wall(), m, s);
        addObject(new Wall(), n, t);
        addObject(new Wall(), o, t);
        addObject(new Wall(), p, t);
        addObject(new Wall(), o, s);
        addObject(new Wall(), p, s);
        addObject(new Wall(), o, r);
        addObject(new Wall(), p, r);
        addObject(new Wall(), q, t);
        addObject(new Wall(), r, t);
        addObject(new Wall(), s, t);
        addObject(new Wall(), t, t);
        addObject(new Wall(), t, s);
        addObject(new Wall(), t, r);
        addObject(new Wall(), t, q);
        addObject(new Wall(), t, p);
        addObject(new Wall(), t, o);
    }
}
