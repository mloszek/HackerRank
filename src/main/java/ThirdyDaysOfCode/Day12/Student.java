package ThirdyDaysOfCode.Day12;

class Student extends Person {

    private int[] testScores;

    public Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }

    public String calculate() {

        int result = 0;

        for (int i = 0; i < testScores.length; i++) {
            result += testScores[i];
        }

        result = result / testScores.length;

        if (result >= 90 && result <= 100)
            return "O";
        if (result >= 80 && result < 90)
            return "E";
        if (result >= 70 && result < 80)
            return "A";
        if (result >= 55 && result < 70)
            return "P";
        if (result >= 40 && result < 55)
            return "D";
        if (result < 40)
            return "T";

        return "task";

    }
}
