import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BookManage {
    //图书信息
    private String ID;//编号
    private String bname;//图书名称
    private String author;//作者
    private String publishedHouse;//出版社
    private String type;//图书类型
    private String place;//存放位置
    private String date;//出版日期
    private String bookStatus;//书籍状态
    private String borrowPeopleName;//借书人
    private String number;//借书人Id
    private String borrowDate;//借阅日期
    private String backTime;//归还日期

    public BookManage(){
        String ID=" ";//编号
        String bname=" ";//图书名称
        String author=" ";//作者
        String publishedHouse=" ";//出版社
        String type=" ";//图书类型
        String place=" ";//存放位置
        String date=" ";//出版日期
        String bookStatus=" ";//书籍状态
        String borrowPeopleName=" ";//借书人
        String number=" ";//借书人Id
        String borrowDate=" ";//借阅日期
        String backTime=" ";//归还日期
    }
    public BookManage(String ID, String bname,String author,String publishedHouse,String type,String date,String borrowPeopleName, String number,String borrowDate,String backTime) {
        this.ID=ID;//编号
        this.bname=bname;//图书名称
        this.author=author;//作者
        this.publishedHouse=publishedHouse;//出版社
        this.type=type;//图书类型
        this.date=date;//出版日期
        this.borrowPeopleName=borrowPeopleName;//借书人
        this.number=number;//借书人Id
        this.borrowDate=borrowDate;//借阅日期
        this.backTime=backTime;//归还日期
    }
    public BookManage(String ID, String bname,String author,String publishedHouse,String type,String place,String date,String bookStatus,String borrowPeopleName, String number,String borrowDate,String backTime){
        this.ID=ID;//编号
        this.bname=bname;//图书名称
        this.author=author;//作者
        this.publishedHouse=publishedHouse;//出版社
        this.type=type;//图书类型
        this.place=place;//存放位置
        this.date=date;//出版日期
        this.bookStatus=bookStatus;//书籍状态
        this.borrowPeopleName=borrowPeopleName;//借书人
        this.number=number;//借书人Id
        this.borrowDate=borrowDate;//借阅日期
        this.backTime=backTime;//归还日期
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public String getID() {
        return ID;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }
    public String getBname() {
        return bname;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setPublishedHouse(String publishedHouse) {
        this.publishedHouse = publishedHouse;
    }
    public String getPublishedHouse() {
        return publishedHouse;
    }

    public void setType(String type) {
        this.type = type;
    }
    public String getType() {
        return type;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    public String getPlace() {
        return place;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getDate() {
        return date;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }
    public String getBookStatus() {
        return bookStatus;
    }

    public void setBorrowPeopleName(String borrowPeopleName) {
        this.borrowPeopleName = borrowPeopleName;
    }
    public String getBorrowPeopleName() {
        return borrowPeopleName;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }

    public void setBackTime(String backTime) {
        this.backTime = backTime;
    }
    public String getBackTime1() {
        DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        backTime = dateFormat.format(calendar.getTime());
        return backTime;
    }
    public String getBackTime(){
        return backTime;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }
    public String getBorrowDate1() {
        DateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd");
        Calendar calendar = Calendar.getInstance();
        borrowDate = dateFormat.format(calendar.getTime());
        return borrowDate;
    }
    public String getBorrowDate() {
        return borrowDate;
    }

    //图书所有信息输出
    public String printBookAllmassage() {
        return "BookManage{" + "ID='" + ID + '\'' + ", bname='" + bname + '\'' + ", author='" + author + '\'' + ", publishedHouse='" + publishedHouse + '\'' + ", type='" + type + '\'' + ", place='" + place + '\'' + ", date='" + date + '\'' + ", bookStatus='" + bookStatus + '\'' + ", borrowPeopleName='" + borrowPeopleName + '\'' + ", number='" + number + '\'' + ", borrowDate='" + borrowDate + '\'' + ", backTime='" + backTime + '\'' + '}';
    }


    //图书基本信息输出
    public String printBookmassage() {
        return "BookManage{" + "ID='" + ID + '\'' + ", bname='" + bname + '\'' + ", author='" + author + '\'' + ", publishedHouse='" + publishedHouse + '\'' + ", type='" + type + '\'' + ", place='" + place + '\'' + ", date='" + date + '\'' + ", bookStatus='" + bookStatus + '\'' + '}';
    }


    //书籍借阅信息输出
    public String printBookBorrowmassage() {
        return "BookManage{" + "ID='" + ID + '\'' + ", bname='" + bname + '\'' + ", author='" + author + '\'' + ", publishedHouse='" + publishedHouse + '\'' + ", type='" + type + '\'' + ", date='" + date + '\'' + ", borrowDate='" + borrowDate + '\'' + ", backTime='" + backTime + '\'' + '}';
    }

    //书籍归还信息输出
    public String printBookBackmassage() {
        return "BookManage{" + "ID='" + ID + '\'' + ", bname='" +
                bname + '\'' + ", author='" + author + '\'' + ", publishedHouse='"
                + publishedHouse + '\'' + ", type='" + type + '\'' + ", date='" + date +
                '\'' + ", borrowDate='" + borrowDate + '\'' + ", backTime='" + backTime + '\'' + '}';
    }

}
