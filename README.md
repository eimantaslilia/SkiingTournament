# SkiingTournament

This is a program that simulates a skiing competition. I chose to include these classes:  
1. Athlete keeps track of jumper's names, their points, and their jumps.  
2. Input reads user's input.  
3. RandomNumber is responsible for generating the jump lengths(60-120m), and 5 judges votes between 10 and 20.  
4. UserInterface which contains the objects of the other 3 classes. It starts the game, asks for commands, and has methods to print jumping order, print
 round results, as well as methods that are called when the user enters jump or quit.  
   
Points are calculated by adding up the jump length and three judges votes. We exclude the lowest and highest votes.
