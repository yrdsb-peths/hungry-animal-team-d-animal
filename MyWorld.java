import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        scoreLabel= new Label(0, 80);
        addObject(scoreLabel, 50, 50);
        
        createApple();     
    }
    
    
    public void act()
    {
        List<Moveable> moveables = getObjects(Moveable.class);
        for (Moveable m : moveables) {
            m.move(0);
        }
    }
    
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }
    public void createApple()
    {
        Apple apple = new Apple();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(apple, x, y);
    }
    
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200); 
    }
    
    public void moveMoveable(Moveable moveableObject, int distance)
    {
        moveableObject.move(distance);
    }
}
