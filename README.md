# Game

src/app/Game
Game interface design can have multiple board games implementations...
Different Board game implementations can be created and passed during run time.

Patterns Used:
Interface segrigation
Builder Pattern
Singleton
FactoryMethod

App Behaviour on startup...
List of game will be populated and player has to select a game...

Example:
Select a game...
1.TikTacToe
2.Chess
3.Life <ad>(Coming soon)
User i/p ---> TikTacToe

Next step is asking for player game config...

Select Player...
1.Single
2.Multi
3.Bot
User i/p -->Single

Select Board Size...
User i/p-->5

Everything is set select PLAY...
User i/p -->Play
