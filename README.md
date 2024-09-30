[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=16138122&assignment_repo_type=AssignmentRepo)
The goal of this game is for the user to move the elephant to catch the apple and banana. The elephant will gain points for every fruit and if anything from the food class touches the bottom of the screen, it will call game over. 

We created a food abstract class with a subclass of Apple and Banana.

Interface Moveable 
The interface Moveable makes it so that the implemented classes (Apple, Banana, and Elephant) must define the behaviour in this interface in order for it to move. This helps so that everything that implements this interface will move the same way.  