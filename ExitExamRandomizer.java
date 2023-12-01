import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class ExitExamRandomizer {
    // static String[] UWQuestions = {
    //     "Reflect on the course overview and syllabus. How did your initial expectations of the course align with the actual learning experience?",
    //     "Discuss your understanding of AI as presented in the initial classes. How has your perspective on AI evolved throughout the course?",
    //     "Explain the importance of genre- and process-based writing in understanding AI concepts.",
    //     "Reflect on your first learning journal. What insights did you gain about AI and your own learning process?",
    //     "Discuss your thoughts on Crawford's 'The Atlas of AI' from the first discussion. How did this text shape your understanding of AI?",
    //     "How has the study of rhetoric influenced your approach to writing and understanding AI?",
    //     "Reflect on your contributions to the first discussion board. How did engaging with your peers influence your understanding of the course material?",
    //     "Discuss the role of revising and editing in your writing process, especially in the context of AI tools.",
    //     "Explain how operational definitions have played a role in your understanding of AI concepts.",
    //     "Reflect on the second learning journal. How did your understanding of AI and academic writing evolve?",
    //     "Discuss the transition from 'The Atlas of AI' to 'The New Laws of Robotics.' What new perspectives did this shift bring?",
    //     "Reflect on the process of evaluating sources for AI research. How did you determine the credibility of sources?",
    //     "Discuss how you located yourself in an AI-rich world. What personal experiences did you draw upon?",
    //     "Discuss your approach to creating dialogues between various sources and your own ideas in the context of AI.",
    //     "Reflect on the writing workshop. What key learning did you take away from this session?",
    //     "Explain how you transitioned to a research-focused mindset. What challenges and successes did you encounter?",
    //     "Reflect on your first discussion about Pasquale's 'The New Laws of Robotics.' How did this text expand your understanding of AI?",
    //     "Discuss your annotated bibliography. How did you select and engage with sources for your research?",
    //     "Reflect on the process of sharing and refining your research plans. How did peer feedback influence your direction?",
    //     "Discuss the use of AI tools in your research. How did these tools impact your research process and outcomes?",
    //     "Reflect on your final learning journal. How does it encapsulate your learning journey in the course?",
    //     "Discuss the concept of research as an argument. How did you apply this concept in your own research paper?",
    //     "Reflect on your second discussion of 'The New Laws of Robotics.' How did your understanding of the text deepen?",
    //     "Discuss your approach to the research conferences. How did these conferences help you refine your research paper?",
    //     "Reflect on the integration of AI in college composition. How do you see AI influencing academic writing?",
    //     "Discuss the future of teaching and learning in the context of AI. How do you envision AI shaping education?",
    //     "Reflect on the final research paper peer review process. How did the feedback impact your final submission?",
    //     "Can you explain how the skills learned in this course will be applicable in your future academic endeavors?",
    //     "Reflect on your overall experience in the course. What are the key takeaways and how will you apply them in future writing tasks?",
    //     "Discuss your preparation for the Viva Voce Reflective Defense. How have you synthesized your learning for this presentation?",
    //     "In the context of our studies and the broader societal implications, how might you propose to utilize artificial intelligence in a manner that upholds ethical standards?",
    //     "Reflecting on the challenges you have encountered during this course, could you describe the specific complications and articulate the strategies you employed to surmount them?",
    //     "Considering the dynamics of this course, notably UW 1020, how would you compare the efficacy of verbal, in-person engagement with that of online discussions as tools for facilitating learning?",
    //     "If given the opportunity to modify one aspect of the coursework, which assignment would you choose to alter, and what are your reasons for proposing this change?",
    //     "How has your engagement in the class, particularly in interactions with your classmates, influenced your approach to and process of writing?",
    //     "Upon reviewing the viewpoints presented by Crawford and Pasquale concerning artificial intelligence, do you find yourself aligning more closely with one perspective over the other? Could you specify the particular arguments or points made by either individual that swayed your opinion?",
    //     "From the range of ethical issues associated with artificial intelligence we have discussed, which do you perceive as the most significant concern for the future of humanity, and can you elaborate on your reasoning for this choice?"
    // };

    // static String[] EAPQuestions = {
    //     "Reflect on the course overview and syllabus. How did your initial expectations of the course align with the actual learning experience?",
    //     "Can you discuss how the concept of student success is introduced and utilized in the descriptive writing assignment?",
    //     "Reflect on the process of constructing sentences and paragraphs for your descriptive writing. What strategies did you employ?",
    //     "Discuss the key elements of descriptive writing as a genre. How did these elements influence your approach to the assignment?",
    //     "Reflect on your experience with APA formatting. How did it enhance or challenge your writing process?",
    //     "Can you explain the process of defining student success in your own words? How did this process influence your understanding of the concept?",
    //     "Discuss the challenges and insights gained from the deep dive into APA formatting.",
    //     "Reflect on the process of operationalizing definitions. How did this process influence your understanding of the concept you chose?",
    //     "Discuss your experience during the definition writing work day. What strategies did you employ and what challenges did you face?",
    //     "Can you discuss the key elements of the analysis assignment? How did these elements influence your approach to the assignment?",
    //     "Reflect on your understanding of analytic moves. How did this understanding influence your approach to the analysis assignment?",
    //     "Discuss your experience analyzing student success. What insights did you gain and what challenges did you face?",
    //     "Reflect on your experience during the analysis writing work day. What strategies did you employ and what challenges did you face?",
    //     "Can you discuss the key elements of research writing and academic argument? How did these elements influence your approach to the research paper?",
    //     "Reflect on your experience during the library days. What strategies did you employ and what challenges did you face?",
    //     "Discuss your process for vetting sources. How did this process influence your approach to the research paper?",
    //     "Reflect on your experience organizing your research writing. What strategies did you employ and what challenges did you face?",
    //     "How have your writing skills evolved since the beginning of the course?",
    //     "Can you illustrate the importance of topic sentences in structuring paragraphs?",
    //     "Discuss how peer review sessions contributed to your writing process.",
    //     "How did you integrate feedback from your instructor and peers into your writing revisions?",
    //     "Can you explain how critical thinking is essential in academic writing?",
    //     "Describe a specific challenge you overcame in your writing during this course.",
    //     "How did learning about audience awareness affect your writing style?",
    //     "Discuss the role of thesis statements in your research papers.",
    //     "Reflect on the importance of coherence and unity in your essays.",
    //     "How did you approach the task of synthesizing information from different sources?",
    //     "Discuss how the course has influenced your understanding of academic integrity and plagiarism.",
    //     "Can you explain how the skills learned in this course will be applicable in your future academic endeavors?",
    //     "Reflect on your overall experience in the course. What are the key takeaways and how will you apply them in future writing tasks?",
    //     "Discuss your preparation for the Viva Voce Reflective Defense. How have you synthesized your learning for this presentation?"
    // };
    // static String[] TEDQuestions = {
    //     "How would you adapt Harmer's ESA (Engage, Study, Activate) model to teach a mixed-ability class?",
    //     "Describe a situation where a student's cultural background might affect their language learning. How would you address this in your teaching?",
    //     "Discuss your approach to correcting student errors during a speaking activity. How do you balance correction with maintaining fluency and confidence?",
    //     "How would you integrate AI tools in a lesson plan aimed at improving students' listening skills?",
    //     "Imagine a scenario where students are reluctant to participate in group activities. What strategies would you use to encourage their participation?",
    //     "What are your thoughts on using students' L1 in the classroom? Provide a situation where it might be beneficial.",
    //     "Discuss a method for teaching idiomatic expressions to advanced learners in a way that's relevant and engaging.",
    //     "How would you assess the progress of students in a speaking class without formal testing?",
    //     "Explain your approach to teaching pronunciation to learners from different linguistic backgrounds.",
    //     "Discuss the role of feedback in language learning. How would you provide effective feedback in a writing class?",
    //     "Share your thoughts on the role of technology in ELT. What are the benefits and challenges?",
    //     "How would you use AI-assisted tools to enhance vocabulary learning in your classroom?",
    //     "Describe how you would handle a situation where a student consistently dominates class discussions.",
    //     "What is your approach to teaching grammar in context rather than in isolation?",
    //     "How would you modify a reading comprehension lesson to cater to both visual and auditory learners?",
    //     "Discuss the importance of teaching functional language. How would you incorporate it into a lesson about making requests?",
    //     "How can AI tools be used to support differentiated instruction in an ESL classroom?",
    //     "What strategies would you employ to build a supportive and inclusive classroom environment?",
    //     "Discuss how you would use authentic materials to teach a lesson on cultural differences in communication styles.",
    //     "How would you integrate project-based learning in an ESL classroom to enhance communicative competence?",
    //     "Share a technique you would use to encourage self-directed learning in your students.",
    //     "Discuss the importance of context in language teaching. How would you design a context-based lesson?",
    //     "How would you utilize AI in evaluating student language proficiency?",
    //     "What strategies would you use to deal with mixed proficiency levels during a speaking activity?",
    //     "Describe a challenge you might face when teaching English pronunciation and how you would address it.",
    //     "How would you integrate Harmer's ideas on teacher roles in a lesson plan focusing on conversation skills?",
    //     "Discuss the use of AI for personalized learning in an ESL setting. What are the potential benefits and limitations?",
    //     "How would you approach the teaching of writing skills to ensure students are able to write coherently and cohesively?",
    //     "Share your thoughts on the role of grammar translation method in modern ESL teaching.",
    //     "Discuss how you would use feedback from AI language learning tools to inform your teaching practices."
    // };
    
    static String[] UWQuestions, EAPQuestions, TEDQuestions;

    public static void main (String[] args) throws IOException { 
        int classID = 0;
        readQuestionsFromFile();
        System.out.println("Enter the class ID to start the next exam: "); 
        Scanner sc = new Scanner(System.in);
        classID = sc.nextInt();

	while(classID != 0){
            if(classID == 1015){
                getEAPQuestions();
            }else if(classID == 1020) { 
                getUWQuestions();
            }else if(classID == 001) {
                getTEDQuestions();
            }else{
                System.out.println("Class not found.");
                System.out.println("Enter a new class ID to start the next exam: ");
            }
            classID = sc.nextInt();
        }
        sc.close();
    }
    static void readQuestionsFromFile() throws IOException { 
        // System.out.println("In readQuestionsFromFile. Attempting to read questions.txt");
        try {
            //Read in the file
            BufferedReader br = new BufferedReader(new FileReader("./questions.txt"));
            //Set up holder lists
            List<String> UWList = new ArrayList<>();
            List<String> EAPList = new ArrayList<>();
            List<String> TEDList = new ArrayList<>();
            //Set up holder for line and section tracking
            String line;
            String currentSection = "";
            //Sort the contents of the file
            //Using switch because nested while/if structure was too error prone
            while ((line = br.readLine()) != null) {
                if (line.equals("UWQuestions")) {
                    currentSection = "UWQuestions";
                } else if (line.equals("EAPQuestions")) {
                    currentSection = "EAPQuestions";
                } else if (line.equals("TEDQuestions")) {
                    currentSection = "TEDQuestions";
                } else {
                    switch (currentSection) {
                        case "UWQuestions":
                            UWList.add(line);
                            break;
                        case "EAPQuestions":
                            EAPList.add(line);
                            break;
                        case "TEDQuestions":
                            TEDList.add(line);
                            break;
                    }
                }
            }
    
            UWQuestions = UWList.toArray(new String[0]);
            EAPQuestions = EAPList.toArray(new String[0]);
            TEDQuestions = TEDList.toArray(new String[0]);
            System.out.println("questions.txt successfully read");
            System.out.println("UW List: " + UWQuestions.length);
            System.out.println("EAP List: " + EAPQuestions.length);
            System.out.println("TED List: " + TEDQuestions.length);
    
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File: \"questions.txt\" not found in this directory.");
        }
    }
    static void getEAPQuestions() { 
        Random random = new Random();
        Set<Integer> usedNumbers = new HashSet<>();
        int j = 1;
        while (usedNumbers.size() < 5) {
            int k = random.nextInt(30);
            if (!usedNumbers.contains(k)) {
                usedNumbers.add(k);
                System.out.print(j + ". ");
                System.out.print(EAPQuestions[k]);
                System.out.println("");
                j++;
            }
        }
    }
    static void getUWQuestions() { 
        Random random = new Random();
        Set<Integer> usedNumbers = new HashSet<>();
        int j = 1;
        while (usedNumbers.size() < 5) {
            int k = random.nextInt(30);
            if (!usedNumbers.contains(k)) {
                usedNumbers.add(k);
                System.out.print(j + ". ");
                System.out.print(UWQuestions[k]);
                System.out.println("");
                j++;
            }
        }
    }
    static void getTEDQuestions() { 
        Random random = new Random();
        Set<Integer> usedNumbers = new HashSet<>();
        int j = 1;
        while (usedNumbers.size() < 8) {
            int k = random.nextInt(30);
            if (!usedNumbers.contains(k)) {
                usedNumbers.add(k);
                System.out.print(j + ". ");
                System.out.print(TEDQuestions[k]);
                System.out.println("");
                j++;
            }
        }
    }
}
