import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SpaceShip here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SpaceShip extends Actor
{
    private static final int MAX_TIME=120;
    private static int timer=120;
    private int speed;
    public static int score;
    public SpaceShip(int speed)
    {
        this.speed=speed;
    }
    public void act()
    {
       move(speed);
       rotate();
       wrapAround1();
       wrapAround2();
       shoot();
       timer--;
       appear();
       
    }  
    public void move(int speed)
    {
        setImage("spaceshipwithoutflame.png");
        if (Greenfoot.isKeyDown("right"))
        {
            setImage("rocket.png");
            setLocation(getX()+speed,getY());
        }
        if (Greenfoot.isKeyDown("left"))
        {
           setLocation(getX()-speed,getY());
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-speed);
        }
        if (Greenfoot.isKeyDown("down"))
        {
           setLocation(getX(),getY()+speed);
        }
    }
    public void rotate()
    {
        if(Greenfoot.isKeyDown("q"))
        {
            setRotation(getRotation()+3);
            
        }
        if(Greenfoot.isKeyDown("w"))
        {
            setRotation(getRotation()-3);
            
        }
    }
    public void wrapAround1()
    {
        if(getX()==999)
        {
            setLocation(0,getY());
        }
        else if(getX()==0)
        {
            setLocation(999,getY());
        }
    }
    public void wrapAround2()
    {
        if(getY()==499)
        {
            setLocation(getX(),0);
        }
        else if(getX()==0)
        {
            setLocation(getX(),999);
        }
    }
    public void shoot()
    {
        if (timer<=0)
        {
            if(Greenfoot.isKeyDown("space"))
            {
                releaseFireball();
                Greenfoot.playSound("bulletsound.wav");
                timer=MAX_TIME;
            }
        }
    }
    public void releaseFireball()
    {
        Fireball fireball=new Fireball(10);
        World world=getWorld();
        world.addObject(fireball,getX(),getY());
        fireball.setRotation(getRotation());
    }
    public void appear()
    {
        if(timer<=15)
        {
            portalAppear();
        }
    }
    public void portalAppear()
    {
        World world=getWorld(); 
    }
    
}
