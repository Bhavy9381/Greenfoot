import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StarType3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StarType3 extends Star
{
    
    public StarType3()
    {
        super(2);
    }
    public void act()
    {
        move(-3);
        wrapAround();
        
    }
}
