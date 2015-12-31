import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet2 here.
 * 
 * @author (Code by Ken)
 */
public class Bullet2 extends Actor
{
    /**
     * Act - do whatever the Bullet2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Bullet2(int rotation)
    {
        GreenfootImage img = getImage();
        img.scale(14,14);
        setImage(img);

        setRotation(rotation);
    }

    public void act() 
    {
        move(-2);
        killPlayerOnly();
    }   

    public void killPlayerOnly()
    {
        Actor player;
        player = getOneIntersectingObject(Player.class);
        if( player != null)
        {
            World world;
            world = getWorld();
            world.removeObject(player);
            PSpawn sp = (PSpawn)getWorld().getObjects(PSpawn.class).get(0);
            world.addObject(player,sp.getX(),sp.getY());
            Greenfoot.playSound("dying_sound.mp3");
            //Credit to soundbible.com
            ScoreBoard scoreboard = new ScoreBoard();
            scoreboard.addScore(-1000);
        }
    }   
}
