import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Star here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Star extends Actor
{
    public Star(int size)
    {
        GreenfootImage starImage=getImage();
        int currentWidth=starImage.getWidth();
        int currentHeight=starImage.getHeight();
        int newWidth=currentWidth/size;
        int newHeight=currentHeight/size;
        starImage.scale(newWidth,newHeight);
        
    }
    public void wrapAround()
    {
        if(getX()==0)
        {
            setLocation(999,getY());
        }
    }
    
    
}
