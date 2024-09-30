

public class Banana extends Food implements Moveable
{
    // instance variables - replace the example below with your own
    private int x;
    /**
     * Constructor for objects of class Banana
     */
    public Banana()
    {
        super(5);
    }
    
    public void act()
    {
        move(3);
        
        MyWorld world = (MyWorld) getWorld();
        if(getY() >= world.getHeight() - 1)
        {
            world.gameOver();
            world.removeObject(this);
        }
    }
    
    // interface of moveable 
    public void move(int distance)
    {
        setLocation(getX(), getY() + distance);
    }
}
