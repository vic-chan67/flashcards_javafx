package FlashcardsGUI;

public class Flashcard {
    private static int nextId = 1;
    private int id;
    private String question;
    private String answer;
    private String topic;
    private String module;
    private int xStudied;
    Difficulty difficulty;

    public Flashcard(String question, String answer, String topic, String module, int xStudied, Difficulty difficulty) {
        this.id = getNextId();
        this.question = question;
        this.answer = answer;
        this.topic = topic;
        this.module = module;
        this.xStudied = xStudied;
        this.difficulty = difficulty;
    }

    public int getId() {return id;}
    private static int getNextId() {return nextId++;}

}
