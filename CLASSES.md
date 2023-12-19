# Classes used in the program

## Interface
Sets up and displays the JavaFX stage/GUI.

## Card
Creates a card
### Attributes
- int ID
- char qa
- String content
- String topic
- String module
- int xStudied
- enum difficulty
### Methods
- public displayFlashcard
  - displays the flashcard content in the stage
- public timesStudied
  - increments xStudied

## Difficulty (enum)
Enum to define difficulty
### Elements
- EASY
- OK
- HARD
- AGAIN

## FlashcardSet
Main class to display, edit and delete flashcards
### Methods
- 