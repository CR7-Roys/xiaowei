public class Teacher extends User{
    private String zhicheng;
    private String id;
    public Teacher(String name, String phone, String sex, String zhicheng, String id) {
        super(name, phone, sex);
        this.zhicheng = zhicheng;
        this.id = id;
    }
    public String getZhicheng() {
        return zhicheng;
    }
    public void setZhicheng(String zhicheng) {
        this.zhicheng = zhicheng;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + super.getName() + '\'' +
                "phone='" + super.getPhone() + '\'' +
                "sex='" + super.getSex() + '\'' +
                "zhicheng='" + zhicheng + '\'' +
                "id='" + id + '\'' +
                '}';
    }
}
