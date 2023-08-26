import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StarType4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StarType4 extends Star
{
    
    public StarType4()
    {
        super(2);
    }
    public void act()
    {
        move(-10);
        wrapAround();
        
    }
}
