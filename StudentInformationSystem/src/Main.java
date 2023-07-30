public class Main{
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("mehmet","123","TRH");
        Teacher teacher2 = new Teacher("resul","124","FZK");
        Teacher teacher3 = new Teacher("ali","125","MAT");

        Course tarih = new Course("tarih","101","TRH");
        Course fizik = new Course("fizik","102","FZK");
        Course matematik = new Course("matematik","103","MAT");
        tarih.addTeacher(teacher1);
        fizik.addTeacher(teacher2);
        matematik.addTeacher(teacher3);

        Student student1 = new Student("Kemal","01","4", tarih,fizik,matematik);
        student1.addBulkExamNote(40,50,70);
        student1.isPass();

        Student student2 = new Student("Necmi","02","3",tarih,fizik,matematik);
        student2.addBulkExamNote(80,90,60);
        student2.isPass();
    }
}