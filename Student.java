public class Student {
    private String sname;//学生姓名
    private String snumber;//学号

    public Student(){
        String sname="";//学生姓名
        String snumber="";//学号
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getSname() {
        return sname;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }
    public String getSnumber() {
        return snumber;
    }

    public void printStudentMassage(){
        System.out.println();
        System.out.println("姓名：   "+getSname()+"学号：   "+getSnumber());
    }
}
