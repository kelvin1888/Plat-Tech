package com.example.quizgameapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> utsQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("The belief that there is no such thing as innate knowledge instead, knowledge is derived from sensory experience", "Empiricism", "Rationalism", "Idealism", "Ego", "Empiricism", "");
        final QuestionsList question2 = new QuestionsList("He proposed that the self is multilayered and is composed of the three structures of the human mind - the id, ego, and superego", "Immanuel Kant", "Sigmund Freud", "Gilbert Ryle", "Maurice Merleau-Ponty", "Sigmund Freud", "");
        final QuestionsList question3 = new QuestionsList("The process in which one tales on the role of another by putting oneself in the position of the person with whom he or she interacts", "Play Stage","Game Stage", "Private Self", "Role Playing","Role Playing", "");
        final QuestionsList question4 = new QuestionsList("The phase of the self that is unsocialized and spontaneous.", "I Self", "Me Self", "Imitation", "Public Self", "I Self", "");
        final QuestionsList question5 = new QuestionsList("An organized community or social group which gives to the individual his or her unity of self.", "Social Identity", "Generalized Others", "Out-group", "In-group", "Generalized Others", "");
        final QuestionsList question6 = new QuestionsList("Refers to the many voices speaking about who you are, and what you are.", "Multiphrenia", "Protean", "Social Identity", "Cultural Identity", "Multiphrenia", "");
        final QuestionsList question7 = new QuestionsList("The region where actors perform in conformity with the expectations of the audience.", "Back Stage", "Front Stage", "Off Stage", "Play Stage", "Back Stage", "");
        final QuestionsList question8 = new QuestionsList("Refers to the identity or feeling of belongingness to certain culture group.", "Social Identity", "Material Culture", "Non-material Culture", "Cultural Identity", "Cultural Identity", "");
        final QuestionsList question9 = new QuestionsList("Refers to the identity or feeling of belongingness to one state or nation", "National Identity", "Cultural Identity", "Nation", "Identity Theory", "National Identity", "");
        final QuestionsList question10 = new QuestionsList("He was the first thinker to focus on the full power of reason on the human self: who we are, who we should, and who we will become.", "Plato", "Socrates", "Aristotle", "St. Augustine", "Plato", "");


        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static List<QuestionsList> purcommQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("It is a process that involves exchange of information, thoughts, ideas, and emotions.", "Information", "Communication", "Debate", "Discussion", "Communication", "");
        final QuestionsList question2 = new QuestionsList("What type of communication that uses electronic media and other video conferencing?", "Oral Communication", "Organizational Communication", "Formal", "Extended Communication", "Extended Communication", "");
        final QuestionsList question3 = new QuestionsList("All options are video mode except", "Skype", "Discord", "Viber", "Text Message", "Text Message", "");
        final QuestionsList question4 = new QuestionsList("Minimizing the number of slides and art to convey message are some ways to be effective in presentations", "True", "False", "Maybe", "I don't know", "True", "");
        final QuestionsList question5 = new QuestionsList(" What is the first and essential step in the listening process?", "Hearing", "Comprehending", "Responding", "Remembering", "Hearing", "");
        final QuestionsList question6 = new QuestionsList("It is a type of communication which refers to the use of spoken and written language.", "Formal", "Non-verbal", "Verbal", "Informal", "Verbal","");
        final QuestionsList question7 = new QuestionsList("This is communication that involves the use of images, graphs, charts, logos, and maps.", "Extended", "Visuals", "Non-verbal", "Verbal", "Visuals", "");
        final QuestionsList question8 = new QuestionsList("This is communication among relatively small number of people that may include both dyadic and small group.", "Intrapersonal", "Interpersonal", "Organizational Communication", "Extended Communication", "Interpersonal", "");
        final QuestionsList question9 = new QuestionsList("It is the moral principle that guides our judgment about the good and bad, right and wrong in communication", "Norm", "Philosophy", "Ethics", "Logic", "Ethics", "");
        final QuestionsList question10 = new QuestionsList("It is the person who generates the creation of ideas as a message and sends it to the desired destinations", "Transformer", "Recipient", "Medium", "Source", "Source", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }

    private static List<QuestionsList> hciQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("It is a term used to describe the technologies that interactive system designers work with.", "Interface", "Interactive System", "Technology", "Design", "Interactive System", "");
        final QuestionsList question2 = new QuestionsList("This is the actual application file which ultimately gets converted to a Dalvik executable and runs your application", "build.gradle", "MainActivity.java", "strings.xml", "res/drawable-hdpi", "MainActivity.java", "");
        final QuestionsList question3 = new QuestionsList("What do you call the visible space provided for your app UI?", "Screen Density", "Screen Size", "Resolution", "Orientation", "Screen Size", "");
        final QuestionsList question4 = new QuestionsList("It is used to define the visual structure for a user interface such as the UI for an activity or app widget.", "Pixels", "Attributes", "DPI", "Layouts", "Layouts", "");
        final QuestionsList question5 = new QuestionsList("This function provides simple feedback about an operation in a small popup.", "Toast", "Dialog", "Alert", "Action Buttons", "Toast", "");
        final QuestionsList question6 = new QuestionsList("A program for the perception and recognition of shapes in computer vision systems, commonly known as AI.", "Graphics Design", "Robotics", "Artificial Intelligence", "Computer", "Artificial Intelligence", "");
        final QuestionsList question7 = new QuestionsList("It intends to cover components, devices, products, and software systems that are primarily concerned with processing information.", "Interactive System", "Human-Computer Interaction", "Android", "Operating System", "Interactive System", "");
        final QuestionsList question8 = new QuestionsList("These are the interactive components in your app's user interface.", "Input Controls", "Strings", "Text fields", "Buttons", "Input Controls", "");
        final QuestionsList question9 = new QuestionsList("This helps ensure that your users can pick a time or date that is valid, formatted correctly, and adjusted to the user's locale.", "Check Box", "Pickers", "Radio Button", "Spinners", "Pickers", "");
        final QuestionsList question10 = new QuestionsList("What do you call the small window that prompts the user to make decision or enter additional information?", "Content Area", "Dialog", "Alert", "Action Button", "Dialog", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);


        return questionsLists;
    }

    private static List<QuestionsList> speechclassQuestions(){

        final List<QuestionsList> questionsLists = new ArrayList<>();

        final QuestionsList question1 = new QuestionsList("Find the silent letter in the word: Rhythm", "Y", "H", "T", "M", "H", "");
        final QuestionsList question2 = new QuestionsList("Find the silent letter in the word: Debt", "T", "B", "E", "D", "B", "");
        final QuestionsList question3 = new QuestionsList("Find the stressed syllable in the word: COMPANY", "COM", "PA", "NY", "None of the above", "COM", "");
        final QuestionsList question4 = new QuestionsList("Find the stressed syllable in the word: GEOMETRY", "GE", "OM", "E", "TRY", "OM", "");
        final QuestionsList question5 = new QuestionsList("This refers to the sounds of a particular language such as the vowel and consonant sounds in English.", "Phonetic Symbols", "Phonological", "Diphthongs", "Monophthongs", "Phonological", "");
        final QuestionsList question6 = new QuestionsList("A speech that comprises utterances and not isolated sounds or words.", "Declaration Speech", "Connected Speech", "Impromptu Speech", "Purposive Speech", "Connected Speech", "");
        final QuestionsList question7 = new QuestionsList("Who created the famous or commonly used Phonetic Chart?", "Charles Peirce", "Adrian Underhill", "Stan Lee", "Benjamin Whorf", "Adrian Underhill", "");
        final QuestionsList question8 = new QuestionsList("A person who studies language.", "Bilinguism", "Linguinism", "Bilinguist", "Linguist", "Linguist", "");
        final QuestionsList question9 = new QuestionsList("This is a set of symbols that represent all sounds in a spoken English.", "Phonetic Symbols", "Phonological Chart", "Phonemic Chart", "Phonetic Chart", "Phonemic Chart", "");
        final QuestionsList question10 = new QuestionsList("This refers to the language that is acquired at birth.", "Weak Form", "L1", "Phonetic Symbols", "English", "L1", "");

        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);
        questionsLists.add(question4);
        questionsLists.add(question5);
        questionsLists.add(question6);
        questionsLists.add(question7);
        questionsLists.add(question8);
        questionsLists.add(question9);
        questionsLists.add(question10);

        return questionsLists;
    }


    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "uts":
                return utsQuestions();

            case "purcomm":
                return purcommQuestions();

            case "speechclass":
                return speechclassQuestions();

            default:
                return hciQuestions();
        }

    }
}
