import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StarType1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StarType1 extends Star
{
    public StarType1()
    {
        super(2);
    }
    public void act()
    {
        move(-10);
        wrapAround();
        
    }
}
