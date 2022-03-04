import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {
        Manage manage=new Manage();
        Mbin a=new Mbin();
        // a.printMbin();
        System.out.println("1.管理员登录  2.学生登录  3.老师登录");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int select = scanner.nextInt();
            if(select==1){
                System.out.println("管理员登录成功！");
                while (true) {
                    a.printMbina();
                    String selects = scanner.next();
                    switch (selects) {
                        case "a": {
                            manage.addBookstore(); //添加图书
                            System.out.println();
                        }
                        break;
                        case "b": {
                            manage.updateBookstore(); //修改图书
                            System.out.println();
                        }
                        break;
                        case "c": {
                            manage.deleteBookstore(); //删除图书
                            System.out.println();
                        }
                        break;
                        case "d": {
                            manage.seleteBookstore(); //查询图书
                            System.out.println();
                        }
                        break;
                        case "e": {
                            manage.show();  //书籍借阅信息查询
                            System.out.println();
                        }
                        break;
                        case "g": {
                            manage.borrowBookMassage0();  //书籍借阅信息查询
                            System.out.println();
                        }
                        break;
                        case "f": {
                            manage.bookSort();
                            System.out.println();  //书籍排序
                        }
                        break;
                        default:
                            System.out.println("选择错误 关闭系统！！");
                            System.exit(0);
                    }
                }
            }
            else if(select==2){
                System.out.println("学生登录成功！");
                while (true) {
                    a.printMbinb();
                    String selects = scanner.next();
                    switch (selects) {
                        case "a": {
                            manage.seleteBookstore();//查询图书
                            System.out.println();
                        }
                        break;
                        case "b": {
                            manage.borrowBookStudent1();//学生借书
                            System.out.println();
                        }
                        break;
                        case "c": {
                            manage.borrowBookMassage0(); //书籍借阅查询
                            System.out.println();
                        }
                        break;
                        case "d": {
                            manage.borrowBookMassage1();//学生借阅查询
                            System.out.println();
                        }
                        break;
                        case "e": {
                            manage.backBookStudent1();//还书
                            System.out.println();
                        }
                        break;
                        case "f": {
                            manage.backBookMassage1();//学生归还查询
                            System.out.println();
                        }
                        break;
                        default:
                            System.out.println("选择错误，退出系统！！！");
                            System.exit(0);
                    }
                }
            }
            else if(select==3){
                System.out.println("老师登录成功！");
                while (true) {
                    a.printMbinc();
                    String selects = scanner.next();
                    switch (selects) {
                        case "a":{
                            manage.seleteBookstore();
                            System.out.println();
                        }
                        break;
                        case "b": {
                            manage.borrowBookTeacher2();
                            System.out.println();
                        }
                        break;
                        case "c": {
                            manage.borrowBookMassage0();
                            System.out.println();
                        }
                        break;
                        case "d": {
                            manage.borrowBookMassage2();
                            System.out.println();
                        }
                        break;
                        case "e": {
                            manage.backBookTeacher2();
                            System.out.println();
                        }
                        break;
                        case "f": {
                            manage.backBookMassage2();
                            System.out.println();
                        }
                        break;
                        default:
                            System.out.println("选择错误，退出系统！！！");
                            System.exit(0);
                    }
                }
            }else{
                System.out.println("身份错误！！！！");
            }
        }
    }
}
