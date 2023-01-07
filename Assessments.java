import java.util.Arrays;

public class Assessments
{
    private final int quiz_Number = 4;
    private final int assignment_Number = 4;

    private double quiz[] = new double[quiz_Number];
    private double assignment[] = new double[assignment_Number];
    private double mid_term_exam = 0.0;
    private double terminal_exam = 0.0;
    private final int Total_quiz_weightage = 15;
    private final double quiz_weightage = 2.5;
    private final int Total_assignment_weightage = 10;
    private final double assignment_weightage = 3.75;
    private final int mid_term_exam_weightage = 25;
    private final int terminal_exam_weightage = 50;

    public Assessments(double[] quiz, double[] assignment, double mid_term_exam, double terminal_exam)
    {
        this.quiz = quiz;
        this.assignment = assignment;
        this.mid_term_exam = mid_term_exam;
        this.terminal_exam = terminal_exam;
    }

    public void setQuiz(double[] quiz)
    {
        this.quiz = quiz;
    }




    public String getQuiz()
    {   return "Assessments{" +
            "quiz_Number=" + quiz_Number +
            ", quiz=" + Arrays.toString(quiz) +
            ", Total_quiz_weightage=" + Total_quiz_weightage +
            ", quiz_weightage=" + quiz_weightage +
            '}';
    }

    public void setAssignment(double[] assignment)
    {
        this.assignment = assignment;
    }


    public String getAssignment()
    {
        return "Assessments{" +
                "assignment_Number=" + assignment_Number +
                ", assignment=" + Arrays.toString(assignment) +
                ", Total_assignment_weightage=" + Total_assignment_weightage +
                ", assignment_weightage=" + assignment_weightage +
                '}';
    }

    public double Quiz_total()
    {
        double total = 0;
        for(int i = 0 ; i < quiz_Number; i++)
        {
            total += quiz[i];
        }
        return total;
    }
    public double Assignment_total()
    {
        double total = 0;
        for(int i = 0 ; i < assignment_Number; i++)
        {
            total += assignment[i];
        }
        return total;
    }

    public void setMid_term(double mid_term_exam)
    {
        this.mid_term_exam = mid_term_exam;
    }
    public double getMid_term_exam()
    {
        return mid_term_exam;
    }

    public void setTerminal_exam(double terminal_exam)
    {
        this.terminal_exam = terminal_exam;
    }
    public double getTerminal_exam()
    {
        return terminal_exam;
    }

    public double calculate_total()
    {
        return Quiz_total() + Assignment_total() + getMid_term_exam() + getTerminal_exam();
    }

    @Override
    public String toString() {
        return "Assessments{" +
                "quiz_Number=" + quiz_Number +
                ", assignment_Number=" + assignment_Number +
                ", quiz=" + Arrays.toString(quiz) +
                ", assignment=" + Arrays.toString(assignment) +
                ", mid_term_exam=" + mid_term_exam +
                ", terminal_exam=" + terminal_exam +
                ", Total_quiz_weightage=" + Total_quiz_weightage +
                ", quiz_weightage=" + quiz_weightage +
                ", Total_assignment_weightage=" + Total_assignment_weightage +
                ", assignment_weightage=" + assignment_weightage +
                ", mid_term_exam_weightage=" + mid_term_exam_weightage +
                ", terminal_exam_weightage=" + terminal_exam_weightage +
                '}';
    }
}