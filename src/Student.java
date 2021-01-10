public class Student extends User{
    private String sno;
    private String grade;
    public Student(String name, String phone, String sex, String sno, String grade) {
        super(name, phone, sex);
        this.sno = sno;
        this.grade = grade;
    }
    public String getSno() {
        return sno;
    }
    public void setSno(String sno) {
        this.sno = sno;
    }
    public String getGrade() {
        return grade;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + super.getName() + '\'' +
                "phone='" + super.getPhone() + '\'' +
                "sex='" + super.getSex() + '\'' +
                "sno='" + sno + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}