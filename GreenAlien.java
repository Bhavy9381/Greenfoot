import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenAlien here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenAlien extends Actor
{
    /**
     * Act - do whatever the GreenAlien wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
      move(speed);
    }
    public void move(int speed)
    {
        setLocation(getX(),getY()+2);
    }
    private int speed;
    public GreenAlien(int speed)
    {
        GreenfootImage portalImage = getImage();
        int newWidth = portalImage.getWidth()/7;
        int newHeight = portalImage.getHeight()/7;
        portalImage.scale(newWidth,newHeight);
        this.speed=speed;
    }
}
