Exit Exam Randomizer
Description

The Exit Exam Randomizer is a Java program designed to assist educators in generating random questions for exit exams in different courses. It supports three course types: University Writing (UW), English for Academic Purposes (EAP), and Teacher Education and Development (TED). The program selects random questions from predefined lists for each course type, ensuring no repetition within a single exam.
Features

    Sets of questions tailored to UW, EAP, and TED courses.
    Random, non-repeating selection of questions for each exam.
    Simple interface for choosing a course type and generating questions.

Requirements

    Java Runtime Environment (JRE) or Java Development Kit (JDK) version 8 or higher.

Installation

No specific installation is required, but you should ensure that a properly formatted questions.txt file is in the same directory as the program. A sample file has been included for reference. Ensure Java is properly installed on your system. Download Java from Oracle's official website.
Usage

    Run the ExitExamRandomizer program.
    Enter the class ID to generate questions for a specific course. The class IDs are:
        1015 for English for Academic Purposes questions.
        1020 for University Writing questions.
        001 for TESOL Educator Development questions.
    The program displays randomly selected questions for the chosen course. EAP and UW generate 5 questions each, and TED generates 8 questions.
    To generate questions for another course, enter the new class ID as prompted.
    To exit, enter 0 when prompted for a class ID.

Customization

    Modify the question sets by editing the UWQuestions, EAPQuestions, and TEDQuestions in the questions.txt file, which are read into the program at run time.
    Add more courses and questions by following the existing structure.

Contributions

Contributions, suggestions, and feedback are welcome via standard GitHub pull requests.
License

This program is provided under a Creative Commons Attribution 4.0 International License. Please refer to the LICENSE file for more details.
