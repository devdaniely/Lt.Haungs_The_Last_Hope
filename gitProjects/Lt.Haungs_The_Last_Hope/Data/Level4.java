import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Level4 here.
 * 
 * @author (Jonathan) 
 * @version (a version number or a date)
 */
public class Level4 extends Levelset
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

    public Level4()
    {    

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Player(), b, s);
        addObject(new PSpawn(), b, s);
        Wall wall = new Wall();
        addObject(wall, 10, 310);
        Wall wall2 = new Wall();
        addObject(wall2, 31, 311);
        Wall wall3 = new Wall();
        addObject(wall3, 52, 313);
        Wall wall4 = new Wall();
        addObject(wall4, 69, 312);
        Wall wall5 = new Wall();
        addObject(wall5, 85, 310);
        Wall wall6 = new Wall();
        addObject(wall6, 104, 314);
        Wall wall7 = new Wall();
        addObject(wall7, 119, 315);
        Wall wall8 = new Wall();
        addObject(wall8, 134, 315);
        Wall wall9 = new Wall();
        addObject(wall9, 157, 315);
        Wall wall10 = new Wall();
        addObject(wall10, 176, 315);
        Wall wall11 = new Wall();
        addObject(wall11, 184, 313);
        Wall wall12 = new Wall();
        addObject(wall12, 197, 316);
        Wall wall13 = new Wall();
        addObject(wall13, 213, 316);
        Wall wall14 = new Wall();
        addObject(wall14, 237, 316);
        Wall wall15 = new Wall();
        addObject(wall15, 253, 315);
        Wall wall16 = new Wall();
        addObject(wall16, 269, 313);
        Wall wall17 = new Wall();
        addObject(wall17, 279, 313);
        Wall wall18 = new Wall();
        addObject(wall18, 297, 316);
        Wall wall19 = new Wall();
        addObject(wall19, 314, 317);
        Wall wall20 = new Wall();
        addObject(wall20, 62, 303);
        Wall wall21 = new Wall();
        addObject(wall21, 69, 294);
        Wall wall22 = new Wall();
        addObject(wall22, 111, 303);
        Wall wall23 = new Wall();
        addObject(wall23, 106, 285);
        Wall wall24 = new Wall();
        addObject(wall24, 112, 271);
        Wall wall25 = new Wall();
        addObject(wall25, 160, 302);
        Wall wall26 = new Wall();
        addObject(wall26, 165, 291);
        Wall wall27 = new Wall();
        addObject(wall27, 169, 281);
        removeObject(wall27);
        wall.setLocation(8, 312);
        wall2.setLocation(23, 312);
        wall3.setLocation(39, 312);
        wall20.setLocation(55, 312);
        wall5.setLocation(83, 312);
        wall6.setLocation(99, 312);
        wall8.setLocation(142, 313);
        wall7.setLocation(127, 312);
        wall22.setLocation(112, 312);
        wall8.setLocation(142, 312);
        wall9.setLocation(157, 312);
        wall25.setLocation(210, 265);
        wall10.setLocation(172, 312);
        wall11.setLocation(184, 312);
        wall12.setLocation(197, 312);
        wall13.setLocation(212, 312);
        wall14.setLocation(228, 312);
        wall15.setLocation(243, 312);
        wall16.setLocation(259, 312);
        wall17.setLocation(273, 312);
        wall18.setLocation(288, 312);
        wall19.setLocation(304, 312);
        Wall wall28 = new Wall();
        addObject(wall28, 317, 315);
        wall28.setLocation(317, 312);
        wall21.setLocation(72, 296);
        wall23.setLocation(72, 280);
        wall24.setLocation(120, 296);
        wall26.setLocation(120, 280);
        wall25.setLocation(120, 264);
        Wall wall29 = new Wall();
        addObject(wall29, 169, 297);
        Wall wall30 = new Wall();
        addObject(wall30, 168, 281);
        Wall wall31 = new Wall();
        addObject(wall31, 200, 297);
        Wall wall32 = new Wall();
        addObject(wall32, 199, 280);
        Wall wall33 = new Wall();
        addObject(wall33, 200, 262);
        Wall wall34 = new Wall();
        addObject(wall34, 200, 245);
        Wall wall35 = new Wall();
        addObject(wall35, 120, 200);
        Wall wall36 = new Wall();
        addObject(wall36, 138, 199);
        Wall wall37 = new Wall();
        addObject(wall37, 152, 199);
        Wall wall38 = new Wall();
        addObject(wall38, 169, 199);
        Wall wall39 = new Wall();
        addObject(wall39, 184, 200);
        removeObject(wall39);
        Wall wall40 = new Wall();
        addObject(wall40, 233, 216);
        Wall wall41 = new Wall();
        addObject(wall41, 248, 217);
        Wall wall42 = new Wall();
        addObject(wall42, 263, 217);
        wall36.setLocation(136, 200);
        wall37.setLocation(152, 200);
        wall38.setLocation(168, 200);
        wall40.setLocation(232, 216);
        wall41.setLocation(248, 216);
        wall42.setLocation(264, 216);
        wall29.setLocation(168, 297);
        wall30.setLocation(168, 280);
        wall29.setLocation(168, 295);
        wall29.setLocation(168, 296);
        wall32.setLocation(200, 280);
        wall31.setLocation(200, 296);
        wall33.setLocation(200, 264);
        wall34.setLocation(200, 248);
        Wall wall43 = new Wall();
        addObject(wall43, 183, 204);
        wall43.setLocation(176, 200);
        Wall wall44 = new Wall();
        addObject(wall44, 231, 296);
        Wall wall45 = new Wall();
        addObject(wall45, 232, 281);
        Wall wall46 = new Wall();
        addObject(wall46, 87, 184);
        Wall wall47 = new Wall();
        addObject(wall47, 71, 184);
        Wall wall48 = new Wall();
        addObject(wall48, 56, 184);
        Wall wall49 = new Wall();
        addObject(wall49, 41, 184);
        Wall wall50 = new Wall();
        addObject(wall50, 26, 183);
        Wall wall51 = new Wall();
        addObject(wall51, 25, 167);
        Wall wall52 = new Wall();
        addObject(wall52, 24, 151);
        Wall wall53 = new Wall();
        addObject(wall53, 25, 135);
        Wall wall54 = new Wall();
        addObject(wall54, 121, 153);
        Wall wall55 = new Wall();
        addObject(wall55, 136, 153);
        Wall wall56 = new Wall();
        addObject(wall56, 152, 152);
        Wall wall57 = new Wall();
        addObject(wall57, 169, 154);
        Wall wall58 = new Wall();
        addObject(wall58, 186, 154);
        Wall wall59 = new Wall();
        addObject(wall59, 232, 116);
        Wall wall60 = new Wall();
        addObject(wall60, 215, 135);
        Wall wall61 = new Wall();
        addObject(wall61, 246, 103);
        Wall wall62 = new Wall();
        addObject(wall62, 280, 71);
        Wall wall63 = new Wall();
        addObject(wall63, 297, 71);
        Wall wall64 = new Wall();
        addObject(wall64, 313, 72);
        wall54.setLocation(120, 152);
        wall55.setLocation(135, 152);
        wall55.setLocation(136, 152);
        wall57.setLocation(168, 152);
        wall58.setLocation(177, 152);
        wall60.setLocation(216, 136);
        wall59.setLocation(232, 120);
        wall61.setLocation(248, 104);
        wall62.setLocation(280, 72);
        wall63.setLocation(296, 72);
        wall64.setLocation(312, 72);
        wall50.setLocation(24, 184);
        wall49.setLocation(40, 184);
        wall51.setLocation(24, 168);
        wall52.setLocation(24, 152);
        wall53.setLocation(24, 136);
        wall46.setLocation(88, 184);
        wall47.setLocation(72, 184);
        wall45.setLocation(232, 280);
        wall44.setLocation(232, 296);
        wall58.setLocation(176, 152);
        Obstacle obstacle = new Obstacle();
        addObject(obstacle, 257, 300);
        Obstacle obstacle2 = new Obstacle();
        addObject(obstacle2, 270, 300);
        Obstacle obstacle3 = new Obstacle();
        addObject(obstacle3, 282, 300);
        Obstacle obstacle4 = new Obstacle();
        addObject(obstacle4, 297, 300);
        Obstacle obstacle5 = new Obstacle();
        addObject(obstacle5, 311, 300);
        Obstacle obstacle6 = new Obstacle();
        addObject(obstacle6, 218, 296);
        Obstacle obstacle7 = new Obstacle();
        addObject(obstacle7, 183, 297);
        Obstacle obstacle8 = new Obstacle();
        addObject(obstacle8, 154, 296);
        Obstacle obstacle9 = new Obstacle();
        addObject(obstacle9, 136, 297);
        Obstacle obstacle10 = new Obstacle();
        addObject(obstacle10, 87, 295);
        Obstacle obstacle11 = new Obstacle();
        addObject(obstacle11, 105, 295);
        Obstacle obstacle12 = new Obstacle();
        addObject(obstacle12, 56, 294);
        obstacle12.setLocation(57, 296);
        obstacle10.setLocation(88, 296);
        obstacle11.setLocation(104, 296);
        obstacle8.setLocation(152, 296);
        obstacle7.setLocation(184, 297);
        obstacle6.setLocation(216, 296);
        obstacle.setLocation(249, 296);
        obstacle2.setLocation(265, 296);
        obstacle3.setLocation(280, 296);
        obstacle4.setLocation(296, 296);
        obstacle5.setLocation(312, 296);
        removeObject(obstacle12);
        removeObject(obstacle);
        removeObject(obstacle2);
        removeObject(obstacle3);
        removeObject(obstacle4);
        removeObject(obstacle5);
        addObject(new NextLevel(), t, d-8);
        Gas gas = new Gas();
        addObject(gas, j, l-8);
        addObject(new CloneLever(gas), d, k);
        obstacle10.setLocation(87, 299);
        obstacle11.setLocation(102, 299);
        obstacle9.setLocation(136, 299);
        obstacle8.setLocation(152, 299);
        obstacle7.setLocation(184, 299);
        obstacle6.setLocation(216, 299);
        tex.setImage("4.png");
        addObject(tex, 160, 214);
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
                Level5 go= new Level5();
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