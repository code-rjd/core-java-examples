package StudentException;

public class StudentController {
    private StudentService studentService = new StudentService();

    public void addMarks() {
        try {
            studentService.addMarks();
        } catch (InvalidMarkException invalidMarkException) {
            System.err.println(invalidMarkException.getMessage());
        } finally {
            System.out.println("finally block executed..");
            System.gc();
        }
    }
}
