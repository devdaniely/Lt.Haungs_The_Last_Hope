import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//
/**
 * Write a description of class Bullet here.
 * 
 * @author (Code by Daniel) 
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bullet(int rotation)
    {
        GreenfootImage img = getImage();
        img.scale (8,8);
        setImage (img);

        setRotation(rotation);
    }

    public void act() 
    {
        move(-2);
        kill();

    }

    public void kill()
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
            scoreboard.addScore(-100);
        }
        Actor clone;
        clone = getOneIntersectingObject(Clone.class);
        if (clone != null)
        {
            ((Player)getWorld().getObjects(Player.class).get(0)).setAble(true);
            World world;
            world = getWorld();
            world.removeObject(clone); 
            world.removeObject(this);
            Greenfoot.playSound("dying_sound.mp3");
            //Credit to soundbible.com
        }
    }
}
