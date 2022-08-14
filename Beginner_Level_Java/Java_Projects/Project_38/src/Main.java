public class Main {

    public static void main(String[] args) {

        Course course1 = new Course("Matematik", "MAT101", "MAT");
        Course course2 = new Course("Fizik", "FZK101", "FZK");
        Course course3 = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Oğuzhan KAHVECİ", "90550000001", "MAT");
        Teacher t2 = new Teacher("Mehmet Ali ÇEÇEN", "90550000002", "FZK");
        Teacher t3 = new Teacher("Oğuz Kaan ONGUN", "90550000003", "KMY");

        course1.addTeacher(t1);
        course2.addTeacher(t2);
        course3.addTeacher(t3);

        Student s1 = new Student("Sami KÖMÜRLÜOĞLU",3,"2210357000",course1,course2,course3);
        s1.addExamNote(60,20,40);
        s1.addPerformanceNote(90,20,40);
        s1.isPass();

        Student s2 = new Student("Fahrettin ÖZKAN",3,"2210357001",course1,course2,course3);
        s2.addExamNote(100,50,40);
        s2.addPerformanceNote(100,50,40);
        s2.isPass();

        Student s3 =new Student("Mustafa ÖZDEMİR",4,"2210357002",course1,course2,course3);
        s3.addExamNote(50,20,40);
        s3.addPerformanceNote(50,20,40);
        s3.isPass();
    }
}