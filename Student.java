public class Student {
    private String fName, lName;
    private int score;

    public Student(String fName, String lName, int score) {
        this.fName = fName;
        this.lName = lName;
        this.score = score;
    }

    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public int getScore() {
        return score;
    }
}
