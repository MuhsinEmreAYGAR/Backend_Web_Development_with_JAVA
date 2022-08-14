public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    double examNote;
    double performanceNote;
    double courseAverage;

    Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.examNote = 0;
        this.performanceNote = 0;
    }

    public void addTeacher(Teacher t) {
        System.out.println("=====================");
        System.out.println("İşlem Başlatılıyor...");
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı.");
            printTeacher();
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
            System.out.println("İşlem başarısız.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }

    public double courseAverage(double examNote, double performanceNote) {
        return courseAverage = (examNote * 0.8) + (performanceNote * 0.2);
    }
}