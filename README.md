[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=16138122&assignment_repo_type=AssignmentRepo)
The goal of this game is for the user to move the elephant to catch the apple and banana. The elephant will gain points for every fruit and if anything from the food class touches the bottom of the screen, it will call the game over. 

Abstract + Polymorphism:
We created a food abstract class with a subclass of Apple and Banana.
Polymorphism is implemented within the abstract class food, as it has common behaviors, such as setting a location based on value. This allows us to treat Bananas and Apples as Food objects and share the methods in the food class even though they have different implementations. 


Interface Moveable:
The interface Moveable requires the implemented classes (Apple, Banana, and Elephant) to define the behavior for it to move. This helps ensure that everything that implements this interface moves the same way. 

Overriding:
There is method overriding of the method move() as it is already defined in the interface Moveable and Apple and Banana implement this interface. The method signature is the same but the classes have different behaviors. Another method override was added to the abstract food class, specifically with the apple class, instead of printing "Fruit is eaten" within the eat method, it prints out "Apple is eaten" whenever the apple touches the elephant or within the eat method. 
 
