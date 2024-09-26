import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class titleScreen extends World
{
    Label titleLabel = new Label("Hungry Elephant", 60);
    Label subTitle = new Label("Press <space> to Start", 40);
    public titleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        addObject(subTitle, getWidth()/2, 250);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        addObject(elephant,282,116);
        elephant.setLocation(287,112);
    }
}
