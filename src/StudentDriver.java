public class StudentDriver {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println("Nome do Aluno: " + student.fName + " " + student.lName);
        System.out.println("ID do Aluno: " + student.stuId);
        System.out.println("Status do Aluno: " + student.stuStatus);
    }

    private static class Student {

        private String fName = "Lisa";
        private String stuId = "123456789";
        private String stuStatus = "Active";
        private String lName = "Palombo";

        public Student() {
        }
    }
}