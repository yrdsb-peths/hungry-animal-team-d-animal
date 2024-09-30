import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Food extends Actor
{
    int value;
    
    public Food(int value)
    {
        this.value = value; 
    }
    
    public void act()
    {
        setLocation(getX(), getY() + value);
    }
    
    public void eaten()
    {
        System.out.println("Fruit is eaten! ");
    }
}
