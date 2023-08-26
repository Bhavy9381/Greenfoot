import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Portal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Portal extends Actor
{
    private int speed;
    private static final int MAX_TIME=160;
    public static int timer=160;
    public Portal(int speed)
    {
        GreenfootImage portalImage = getImage();
        int newWidth = portalImage.getWidth()/4;
        int newHeight = portalImage.getHeight()/4;
        portalImage.scale(newWidth,newHeight);
        this.speed= speed;
    }
    public void releaseAlien()
    {
        GreenAlien alien = new GreenAlien(20);
        World world = getWorld();
        world.addObject(alien,getX(),getY());
    }
    public void shoot1()
    {
        if(timer<=30)
        {
            releaseAlien();
            timer=MAX_TIME;
        }
    }
    public void act()
    {
        shoot1();
        timer--;
        move(0);
    }
    
    
}
