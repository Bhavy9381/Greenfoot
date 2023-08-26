import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StarType2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StarType2 extends Star
{
    
    public StarType2()
    {
        super(2);
    }
    public void act()
    {
        move(-7);
        wrapAround();
        
    }
}
