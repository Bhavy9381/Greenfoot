import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fireball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fireball extends Actor
{
    
    private int speed;
    public Fireball(int speed)
    {
        GreenfootImage fireballImage=getImage();
        int newWidth=fireballImage.getWidth()/10;
        int newHeight=fireballImage.getHeight()/10;
        fireballImage.scale(newWidth,newHeight);
        this.speed=speed;
    }
    public void distoryAlien()
    {
        GreenAlien greenAlien=(GreenAlien)getOneIntersectingObject(GreenAlien.class);
        {
            if(greenAlien!=null)
            {
                World world=getWorld();
                world.removeObject(greenAlien);
                world.removeObject(this);
                Greenfoot.playSound("destory.wav");
                SpaceShip.score++;
            }
        }
    }
    public void act()
    {
        move(10);
        distoryAlien();
    }
}
