import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Level2 here.
 * 
 * @author (Zach) 
 * @version (a version number or a date)
 */
public class Level6 extends Levelset
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
     * Constructor for objects of class Level2.
     * 
     */
    public Level6()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();
        addObject(wall, 31, 76);
        wall.setLocation(24, 72);
        Wall wall2 = new Wall();
        addObject(wall2, 46, 77);
        Wall wall3 = new Wall();
        addObject(wall3, 95, 79);
        wall2.setLocation(40, 72);
        wall3.setLocation(55, 72);
        Wall wall4 = new Wall();
        addObject(wall4, 109, 101);
        wall4.setLocation(71, 72);
        addObject(new Player(), b, d);
        addObject(new PSpawn(), b, d-5);
        Wall wall5 = new Wall();
        addObject(wall5, 127, 111);
        wall5.setLocation(120, 104);
        Wall wall6 = new Wall();
        addObject(wall6, 128, 125);
        wall6.setLocation(120, 120);
        Wall wall7 = new Wall();
        addObject(wall7, 113, 167);
        wall7.setLocation(120, 134);
        wall7.setLocation(120, 136);
        Wall wall8 = new Wall();
        addObject(wall8, 110, 173);
        wall8.setLocation(120, 150);
        wall8.setLocation(120, 152);

        Obstacle obstacle = new Obstacle();
        addObject(obstacle, 129, 87);
        obstacle.setLocation(122, 89);
        Obstacle obstacle2 = new Obstacle();
        addObject(obstacle2, 79, 61);
        obstacle2.setLocation(72, 57);
        Wall wall9 = new Wall();
        addObject(wall9, 111, 142);
        wall9.setLocation(104, 136);
        obstacle2.setLocation(72, 64);
        obstacle.setLocation(121, 96);
        Wall wall10 = new Wall();
        addObject(wall10, 89, 142);
        wall10.setLocation(102, 230);
        wall10.setLocation(56, 136);
        Obstacle obstacle3 = new Obstacle();
        addObject(obstacle3, 83, 142);
        obstacle3.setLocation(87, 136);
        Wall wall11 = new Wall();
        addObject(wall11, 63, 158);
        Wall wall12 = new Wall();
        addObject(wall12, 72, 181);
        Wall wall13 = new Wall();
        addObject(wall13, 77, 199);
        wall11.setLocation(56, 150);
        wall12.setLocation(56, 165);
        wall13.setLocation(56, 179);
        wall13.setLocation(56, 185);
        wall12.setLocation(56, 169);
        wall11.setLocation(56, 153);
        wall10.setLocation(56, 137);
        obstacle3.setLocation(174, 194);
        Wall wall14 = new Wall();
        addObject(wall14, 97, 143);
        wall14.setLocation(88, 136);
        Wall wall15 = new Wall();
        addObject(wall15, 95, 155);
        wall15.setLocation(88, 152);
        Wall wall16 = new Wall();
        addObject(wall16, 105, 195);
        wall16.setLocation(56, 120);
        wall16.setLocation(59, 120);
        wall16.setLocation(56, 121);
        Wall wall17 = new Wall();
        addObject(wall17, 34, 115);
        Wall wall18 = new Wall();
        addObject(wall18, 69, 102);
        wall18.setLocation(56, 106);
        wall17.setLocation(56, 92);
        Wall wall19 = new Wall();
        addObject(wall19, 22, 123);
        wall19.setLocation(56, 82);
        obstacle3.setRotation(270);
        obstacle3.setLocation(88, 169);
        Obstacle obstacle4 = new Obstacle();
        addObject(obstacle4, 193, 212);
        obstacle4.setRotation(270);
        obstacle4.setLocation(89, 184);
        Wall wall20 = new Wall();
        addObject(wall20, 63, 232);
        Wall wall21 = new Wall();
        addObject(wall21, 125, 217);
        Wall wall22 = new Wall();
        addObject(wall22, 123, 238);
        Wall wall23 = new Wall();
        addObject(wall23, 186, 259);
        wall20.setLocation(56, 201);
        wall21.setLocation(56, 217);
        wall22.setLocation(56, 233);
        wall23.setLocation(56, 248);
        Wall wall24 = new Wall();
        addObject(wall24, 77, 253);
        Wall wall25 = new Wall();
        addObject(wall25, 99, 249);
        Wall wall26 = new Wall();
        addObject(wall26, 127, 254);
        Wall wall27 = new Wall();
        addObject(wall27, 161, 253);
        wall24.setLocation(72, 248);
        wall25.setLocation(88, 248);
        wall26.setLocation(104, 248);
        wall27.setLocation(120, 248);
        Wall wall28 = new Wall();
        addObject(wall28, 143, 255);
        Wall wall29 = new Wall();
        addObject(wall29, 166, 261);
        Wall wall30 = new Wall();
        addObject(wall30, 177, 260);
        Wall wall31 = new Wall();
        addObject(wall31, 194, 242);
        Wall wall32 = new Wall();
        addObject(wall32, 198, 205);
        Wall wall33 = new Wall();
        addObject(wall33, 168, 227);
        Wall wall34 = new Wall();
        addObject(wall34, 219, 229);
        wall28.setLocation(136, 248);
        wall29.setLocation(152, 248);
        wall30.setLocation(168, 248);
        wall31.setLocation(184, 248);
        wall33.setLocation(200, 248);
        wall34.setLocation(215, 248);
        removeObject(wall32);
        Turret turret = new Turret();
        addObject(turret, 220, 226);
        turret.setLocation(216, 232);
        Obstacle obstacle5 = new Obstacle();
        addObject(obstacle5, 120, 237);
        Wall wall35 = new Wall();
        addObject(wall35, 201, 178);
        wall35.setLocation(183, 216);
        Wall wall36 = new Wall();
        addObject(wall36, 216, 143);
        wall36.setLocation(200, 200);
        wall35.setLocation(184, 216);
        Wall wall37 = new Wall();
        addObject(wall37, 218, 187);
        wall37.setLocation(216, 184);
        Wall wall38 = new Wall();
        addObject(wall38, 259, 124);
        wall38.setLocation(230, 167);
        wall38.setLocation(232, 168);
        Wall wall39 = new Wall();
        addObject(wall39, 238, 134);
        wall39.setLocation(248, 152);
        Wall wall40 = new Wall();
        addObject(wall40, 224, 84);
        wall40.setLocation(264, 136);
        Turret turret2 = new Turret();
        addObject(turret2, 192, 71);
        turret2.setRotation(-90);
        turret2.setLocation(200, 21);
        Turret turret3 = new Turret();
        addObject(turret3, 245, 35);
        turret3.setRotation(270);
        turret3.setLocation(231, 22);
        Wall wall41 = new Wall();
        addObject(wall41, 15, 79);
        wall41.setLocation(8, 72);
        removeObject(wall35);
        wall36.setLocation(183, 216);
        wall36.setLocation(184, 216);
        removeObject(wall37);
        removeObject(wall38);
        removeObject(wall39);
        removeObject(wall40);
        Wall2 wall210 = new Wall2();
        addObject(wall210, 223, 207);
        wall210.setLocation(216, 200);
        removeObject(turret3);
        removeObject(turret2);
        Turret turret4 = new Turret();
        addObject(turret4, 302, 193);
        turret4.setLocation(313, 184);
        Wall2 wall211 = new Wall2();
        addObject(wall211, 239, 207);
        wall211.setLocation(232, 200);
        Wall wall42 = new Wall();
        addObject(wall42, 112, 191);
        wall42.setLocation(104, 184);
        Wall wall43 = new Wall();
        addObject(wall43, 112, 175);
        Wall wall44 = new Wall();
        addObject(wall44, 169, 172);
        wall44.setLocation(104, 152);
        wall43.setLocation(104, 168);
        Wall wall45 = new Wall();
        addObject(wall45, 138, 287);
        Wall wall46 = new Wall();
        addObject(wall46, 199, 283);
        Wall wall47 = new Wall();
        addObject(wall47, 139, 285);
        Wall wall48 = new Wall();
        addObject(wall48, 84, 285);
        Wall wall49 = new Wall();
        addObject(wall49, 242, 263);
        wall48.setLocation(56, 295);
        wall48.setLocation(56, 296);
        wall47.setLocation(72, 296);
        wall45.setLocation(88, 296);
        wall46.setLocation(104, 296);
        wall49.setLocation(120, 296);
        Wall wall50 = new Wall();
        addObject(wall50, 221, 285);
        Wall wall51 = new Wall();
        addObject(wall51, 269, 283);
        Wall wall52 = new Wall();
        addObject(wall52, 278, 269);
        Wall wall53 = new Wall();
        addObject(wall53, 281, 261);
        Wall wall54 = new Wall();
        addObject(wall54, 281, 254);
        Wall wall55 = new Wall();
        addObject(wall55, 275, 256);
        Wall wall56 = new Wall();
        addObject(wall56, 278, 237);
        Wall wall57 = new Wall();
        addObject(wall57, 282, 230);
        Wall wall58 = new Wall();
        addObject(wall58, 282, 224);
        Wall wall59 = new Wall();
        addObject(wall59, 281, 218);
        Wall wall60 = new Wall();
        addObject(wall60, 278, 202);
        Wall wall61 = new Wall();
        addObject(wall61, 278, 192);
        Wall wall62 = new Wall();
        addObject(wall62, 278, 180);
        Wall wall63 = new Wall();
        addObject(wall63, 276, 169);
        Wall wall64 = new Wall();
        addObject(wall64, 276, 167);
        wall50.setLocation(136, 296);
        wall51.setLocation(152, 296);
        wall53.setLocation(168, 296);
        wall55.setLocation(184, 296);
        wall52.setLocation(200, 296);
        wall54.setLocation(216, 296);
        wall56.setLocation(232, 296);
        wall57.setLocation(248, 296);
        wall58.setLocation(264, 296);
        wall59.setLocation(280, 296);
        wall60.setLocation(296, 296);
        wall61.setLocation(312, 296);
        wall64.setLocation(40, 296);
        wall62.setLocation(24, 296);
        wall63.setLocation(313, 200);
        Wall wall65 = new Wall();
        addObject(wall65, 238, 255);
        wall65.setLocation(232, 249);
        wall65.setLocation(231, 248);
        Wall wall66 = new Wall();
        addObject(wall66, 263, 247);
        wall66.setLocation(232, 232);
        wall65.setLocation(232, 248);
        wall65.setLocation(231, 248);
        wall66.setLocation(230, 232);
        Wall wall67 = new Wall();
        addObject(wall67, 252, 239);
        wall67.setLocation(245, 232);
        Wall wall68 = new Wall();
        addObject(wall68, 269, 222);
        Wall wall69 = new Wall();
        addObject(wall69, 278, 239);
        wall69.setLocation(260, 232);
        wall69.setLocation(261, 232);
        wall68.setLocation(274, 232);
        Wall wall70 = new Wall();
        addObject(wall70, 282, 261);
        wall70.setLocation(280, 231);
        wall70.setLocation(280, 232);
        Obstacle obstacle6 = new Obstacle();
        addObject(obstacle6, 253, 230);
        Obstacle obstacle7 = new Obstacle();
        addObject(obstacle7, 261, 173);
        Obstacle obstacle8 = new Obstacle();
        addObject(obstacle8, 247, 147);
        Obstacle obstacle9 = new Obstacle();
        addObject(obstacle9, 223, 104);
        obstacle6.setLocation(232, 230);
        obstacle7.setLocation(248, 229);
        obstacle8.setLocation(266, 228);
        obstacle9.setLocation(281, 228);
        obstacle8.setLocation(264, 229);
        wall66.setLocation(231, 232);
        obstacle6.setLocation(258, 202);
        obstacle7.setLocation(263, 203);
        obstacle8.setLocation(271, 201);
        obstacle9.setLocation(268, 206);
        wall70.setLocation(287, 232);
        wall70.setLocation(276, 255);
        wall68.setLocation(280, 232);
        wall69.setLocation(264, 232);
        wall67.setLocation(248, 232);
        wall66.setLocation(233, 232);
        obstacle9.setLocation(233, 232);
        obstacle7.setLocation(248, 232);
        obstacle6.setLocation(261, 232);
        obstacle8.setLocation(281, 232);
        obstacle6.setLocation(265, 232);
        Trophy trophy = new Trophy();
        addObject(trophy, 184, 100);
        trophy.setLocation(53, 57);
        trophy.setLocation(24, 282);
        Wall3 wall310 = new Wall3();
        addObject(wall310, 175, 207);
        wall310.setLocation(168, 200);
        wall310.setRotation(-90);
        wall310.setLocation(168, 151);
        Wall wall71 = new Wall();
        addObject(wall71, 191, 95);
        Wall wall72 = new Wall();
        addObject(wall72, 216, 82);
        Wall wall73 = new Wall();
        addObject(wall73, 222, 64);
        Wall wall74 = new Wall();
        addObject(wall74, 240, 51);
        Wall wall75 = new Wall();
        addObject(wall75, 259, 81);
        Wall wall76 = new Wall();
        addObject(wall76, 272, 78);
        Wall wall77 = new Wall();
        addObject(wall77, 284, 79);
        Wall wall78 = new Wall();
        addObject(wall78, 305, 80);
        Wall wall79 = new Wall();
        addObject(wall79, 304, 104);
        wall71.setLocation(184, 88);
        wall73.setLocation(200, 72);
        wall72.setLocation(216, 56);
        wall74.setLocation(232, 40);
        wall75.setLocation(248, 40);
        wall76.setLocation(264, 40);
        wall77.setLocation(280, 40);
        wall78.setLocation(296, 39);
        wall78.setLocation(296, 40);
        wall79.setLocation(311, 40);
        wall79.setLocation(312, 40);
        removeObject(wall310);
        Wall wall80 = new Wall();
        addObject(wall80, 172, 199);
        Wall wall81 = new Wall();
        addObject(wall81, 156, 188);
        Wall wall82 = new Wall();
        addObject(wall82, 141, 177);
        wall80.setLocation(168, 200);
        wall81.setLocation(152, 183);
        wall82.setLocation(136, 168);
        wall81.setLocation(152, 184);
        Wall wall83 = new Wall();
        addObject(wall83, 156, 159);
        Wall wall84 = new Wall();
        addObject(wall84, 172, 144);
        wall83.setLocation(152, 152);
        wall83.setLocation(168, 152);
        wall84.setLocation(184, 136);
        wall80.setLocation(152, 200);
        wall81.setLocation(136, 184);
        wall82.setLocation(168, 168);
        wall83.setLocation(184, 152);
        wall84.setLocation(200, 136);
        Wall wall85 = new Wall();
        addObject(wall85, 174, 127);
        wall85.setLocation(168, 120);
        Wall wall86 = new Wall();
        addObject(wall86, 168, 112);
        wall86.setLocation(152, 104);
        Turret turret5 = new Turret();
        addObject(turret5, 179, 73);
        turret5.setLocation(137, 24);
        turret5.setRotation(-90);
        turret5.setLocation(136, 22);
        Turret turret6 = new Turret();
        addObject(turret6, 176, 57);
        turret6.setRotation(-90);
        turret6.setLocation(151, 21);
        wall82.setLocation(153, 151);
        wall82.setLocation(152, 152);
        removeObject(wall83);
        removeObject(wall84);
        removeObject(wall86);
        removeObject(wall85);
        removeObject(turret6);
        Wall wall87 = new Wall();
        addObject(wall87, 168, 125);
        wall87.setLocation(168, 120);
        Turret turret7 = new Turret();
        addObject(turret7, 211, 67);
        turret7.setLocation(168, 23);
        turret7.setRotation(-90);
        turret7.setLocation(169, 22);
        turret5.setLocation(152, 21);
        turret7.setLocation(200, 22);
        Gate gate = new Gate();
        addObject(gate, 155, 223);
        gate.setLocation(57, 272);
        gate.setLocation(56, 272);
        ClonePress clonepress = new ClonePress(gate);
        addObject(clonepress, 259, 163);
        clonepress.setLocation(311, 24);
        clonepress.setLocation(52, 55);

        trophy.setLocation(23, 270);
        trophy.setLocation(23, 280);
        clonepress.setLocation(312, 23);
        wall81.setLocation(136, 182);
        addObject(new NextLevel(), 23, 270);
        //Gate gate2 = new Gate();
        //addObject(gate2, 65, 274);
        //gate2.setLocation(56, 272);
        removeObject(trophy);

        obstacle3.setLocation(90, 167);
        obstacle4.setLocation(90, 182);
        removeObject(obstacle8);
        removeObject(wall68);
        obstacle7.setLocation(266, 216);
        wall67.setLocation(294, 229);
        wall69.setLocation(294, 241);
        obstacle9.setLocation(246, 213);
        wall66.setLocation(299, 248);
        wall66.setLocation(232, 232);
        wall66.setLocation(230, 232);
        wall66.setLocation(231, 232);
        wall67.setLocation(247, 232);
        obstacle6.setLocation(276, 202);
        wall69.setLocation(263, 232);
        obstacle9.setLocation(231, 222);
        obstacle7.setLocation(245, 222);
        obstacle6.setLocation(264, 221);
        obstacle7.setLocation(249, 221);
        obstacle9.setLocation(229, 227);
        obstacle9.setLocation(231, 221);
        obstacle7.setLocation(247, 221);
        obstacle6.setLocation(263, 221);
        wall4.setLocation(70, 69);
        wall4.setLocation(70, 72);
        obstacle2.setLocation(70, 64);
        obstacle.setLocation(120, 95);
        obstacle2.setLocation(69, 63);
        turret.setLocation(214, 233);
        turret.setLocation(214, 234);
        turret.setLocation(214, 232);

        addObject(trophy, 190, 182);
        trophy.setLocation(183, 199);

        tex.setImage("7.png");
        addObject(tex, 160, 135);
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
                LevelD go= new LevelD();
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