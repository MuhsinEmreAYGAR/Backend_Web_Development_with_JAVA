public class Student {
    String name, stuNo;
    int classes;
    Course course1;
    Course course2;
    Course course3;
    double generalAverage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course course1, Course course2, Course course3) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        calcAverage();
        this.isPass = false;
    }

    public void addExamNote(int course1examNote, int course2examNote, int course3examNote) {
        if ((course1examNote >= 0) && (course1examNote <= 100)) this.course1.examNote = course1examNote;
        if ((course2examNote >= 0) && (course2examNote <= 100)) this.course2.examNote = course2examNote;
        if ((course3examNote >= 0) && (course3examNote <= 100)) this.course3.examNote = course3examNote;
    }

    public void addPerformanceNote(int course1performanceNote, int course2performanceNote, int course3performanceNote) {
        if ((course1performanceNote >= 0) && (course1performanceNote <= 100))
            this.course1.performanceNote = course1performanceNote;
        if ((course2performanceNote >= 0) && (course2performanceNote <= 100))
            this.course2.performanceNote = course2performanceNote;
        if ((course3performanceNote >= 0) && (course3performanceNote <= 100))
            this.course3.performanceNote = course3performanceNote;
    }

    public void isPass() {
        if (this.course1.examNote == 0 || this.course2.examNote == 0 || this.course3.examNote == 0 || this.course1.performanceNote == 0 || this.course2.performanceNote == 0 || this.course3.performanceNote == 0) {
            System.out.println("Notlar tam olarak girilmemiş.");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Genel Ortalama: " + generalAverage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti.");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }
    public void calcAverage() {
        this.generalAverage = ((course1.courseAverage(this.course1.examNote, this.course1.performanceNote)) + (course2.courseAverage(this.course2.examNote, this.course2.performanceNote)) + (course3.courseAverage(this.course3.examNote, this.course3.performanceNote))) / 3;
    }
    public boolean isCheckPass() {
        calcAverage();
        return generalAverage > 55;
    }
    public void printNote() {
        System.out.println("\n|*||*||*||*||*||*||*||*||*||*||*||*|\n");
        System.out.println("Öğrenci : " + this.name);
        System.out.println(course1.name + " Sınav Notu : " + this.course1.examNote);
        System.out.println(course1.name + " Sözlü Notu : " + this.course1.performanceNote);
        System.out.println(course1.name + " Ders Ortalaması : " + this.course1.courseAverage);
        System.out.println("=====================");
        System.out.println(course2.name + " Sınav Notu : " + this.course2.examNote);
        System.out.println(course2.name + " Sözlü Notu : " + this.course2.performanceNote);
        System.out.println(course2.name + " Ders Ortalaması : " + this.course2.courseAverage);
        System.out.println("=====================");
        System.out.println(course3.name + " Sınav Notu : " + this.course3.examNote);
        System.out.println(course3.name + " Sözlü Notu : " + this.course3.performanceNote);
        System.out.println(course3.name + " Ders Ortalaması : " + this.course3.courseAverage);
    }
}