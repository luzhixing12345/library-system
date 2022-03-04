public class Teacher {
    private String tname;//老师姓名
    private String tnumber;//工号
    //BookManage tbook;//图书使用信息

    public Teacher(){
        String tname="";//老师姓名
        String tnumber="";//工号
    }

    public void setTname(String tname) {
        this.tname = tname;
    }
    public String getTname() {
        return tname;
    }

    public void setTnumber(String tnumber) {
        this.tnumber = tnumber;
    }
    public String getTnumber() {
        return tnumber;
    }

    public void printTeacherMassage(){
        System.out.println();
        System.out.println("姓名：   "+getTname()+"工号：   "+getTnumber());

    }
}
