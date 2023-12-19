# Draft of features

## Different functions:
- Display GUI
- Store flashcards in a database for a subject (SQL)
    - Each flashcard has a certain property
        - ID (no two should be identical) {int}
        - Question or answer {char}
        - Questions should be linked to an answer
        - Subject category/topic {string}
        - Difficulty rate (changed every time flashcard is studied) {enum}
        - Times studied {int}
        - Flashcard content {string}
- User has button to display flashcards answer
    - Chooses difficulty category after studying
    - Goes to next flashcard
    - Flashcard times studied increments by 1
- Toolbar lets user choose category/topic
    - Load flashcard set
    - Edit flashcard set (most unload flashcard set if user want to edit)

## Suggestions:
User Authentication
- Consider adding user authentication if you want to support multiple users and enable them to have personalised flashcard sets.

Data Validation
- Implement proper data validation for user inputs and flashcard properties to ensure data integrity and prevent errors.

Backup and Restore
- Provide functionality for users to back up their flashcard sets and restore them. This can be useful in case of accidental data loss or when users want to switch devices.

User-Friendly GUI
- Pay attention to the user interface design to make it intuitive and user-friendly. Clear navigation and well-designed buttons can enhance the user experience.

Statistics and Progress Tracking
- Consider adding features to track user progress, such as displaying statistics on the number of flashcards studied, performance in different difficulty categories, and overall proficiency.

Search and Sorting
- Implement search functionality to allow users to find specific flashcards quickly. Additionally, provide sorting options for flashcards based on different criteria, such as difficulty or times studied.

Feedback Mechanism
- Consider providing feedback to users after they study a flashcard set, such as displaying a summary of their performance and suggesting areas for improvement.

Export and Import
- Allow users to export and import flashcard sets. This can be useful for sharing sets with others or for transferring sets between devices.

Responsive Design
- If your application is intended for use on different devices, consider implementing a responsive design that adapts to different screen sizes.

Error Handling
- Implement robust error handling to gracefully manage unexpected situations and provide meaningful error messages to users.

Documentation
- Consider providing documentation or help sections within the application to guide users on how to use different features.
