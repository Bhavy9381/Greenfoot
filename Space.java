import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Space extends World
{
    public static SpaceShip spaceShip=new SpaceShip(5);
    public static int timer=80;
    public static int nextLevelTimer=300;
    public Space()
    {    
        
        super(1000, 500, 1); 
        int x=Greenfoot.getRandomNumber(1000);
        int y=Greenfoot.getRandomNumber(500);
        addObject(spaceShip,x,y);
        addStar();
        addAlien();
        appear();
        
    }
    public void addStar()
    {
        for (int i=1;i<=5;i++)
        {
        addAnyStar(new StarType1());
        addAnyStar(new StarType2());
        addAnyStar(new StarType3());
        addAnyStar(new StarType4());
        }
    }
    public void addAnyStar(Star star)
    {
        
        int x=Greenfoot.getRandomNumber(1000);
        int y=Greenfoot.getRandomNumber(500);
        addObject (star,x,y);
    }
    public void addPortal()
    {
        Portal portal =new Portal(10);
        addObject(portal,710,88);
        
    }
    public void addAlien()
    {
        Portal portal=new Portal(20);
        addObject(portal,710,88);
    }
    public void appear()
    {
        if (timer<=20)
        {
            addPortal();
        }
    }
    public void displayScore()
    {
        showText("score:"+SpaceShip.score,60,30);
    }
    public void act()
    {
        displayScore();
        nextLevel();
    }
    public void nextLevel()
    {
        if(SpaceShip.score==1 && nextLevelTimer>=0)
        {
            setBackground("NEXTLEVEL.png");
            nextLevelTimer--;
            removeObject(spaceShip);
        }
        else if(SpaceShip.score==1)
        {
            Greenfoot.setWorld(new Ocean());
        }
    }
}
    

