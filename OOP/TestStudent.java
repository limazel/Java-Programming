public class TestStudent {
    public static void main(String[] args) {
        Student aAyhan = new Student("Azad", "Istanbul");
        System.out.println(aAyhan);

        // getters setters
        aAyhan.setAddress("Wien");
        System.out.println(aAyhan);
        System.out.println(aAyhan.getName());
        System.out.println(aAyhan.getAddress());

        aAyhan.addCourseGrade("OOP01", 89);
        aAyhan.addCourseGrade("OOP02", 50);
        aAyhan.addCourseGrade("OOP03", 95);

        aAyhan.printGrades();
        System.out.printf("The average grade is %.2f%n", aAyhan.getAverageGrade());
    }    
}
