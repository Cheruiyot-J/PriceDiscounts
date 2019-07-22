import java.util.ArrayList;

public class ListOfEmployess {
    String fname,sname,email,period,phonenumber,salary;

    public ListOfEmployess(String fname, String sname, String email, String period, String phonenumber, String salary) {
        this.fname = fname;
        this.sname = sname;
        this.email = email;
        this.period = period;
        this.phonenumber = phonenumber;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ListOfEmployess{" +
                "fname='" + fname + '\'' +
                ", sname='" + sname + '\'' +
                ", email='" + email + '\'' +
                ", period='" + period + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<ListOfEmployess>Employees;
        Employees=new ArrayList<>();

        ListOfEmployess emp1=new ListOfEmployess("Jane","Chebet","@jane.com","3 years","0712345676","100000");
        ListOfEmployess emp2=new ListOfEmployess("Joy","Wairimu","@mwairimu.com","5 year","0799023556","64000");
        ListOfEmployess emp3=new ListOfEmployess("Brian","Mbugua","@mbugua.com","4 years","0799023458","500000");
        ListOfEmployess emp4=new ListOfEmployess("Liz","Zabeth","@liz.com","1 year","0799023356","78000");
        ListOfEmployess emp5=new ListOfEmployess("Rose","Enane","@rose.com","9 months","0799021256","450000");
        ListOfEmployess emp6=new ListOfEmployess("Milcah","Ngima","@milcah.com","7 months","0767852895","240000");
        ListOfEmployess emp7=new ListOfEmployess("Steffi","Nasumba","@steffi.com","6 years","0798743216","90000");
        ListOfEmployess emp8=new ListOfEmployess("Mercy","Joy","@joy.com","11 months","0790876523","50000");
        ListOfEmployess emp9=new ListOfEmployess("Caleb","Muithi","@muithi.com","4 months","0700345627","60000");
        ListOfEmployess emp10=new ListOfEmployess("Clarence","Isaboke","@isaboke.com","2 years","0723789654","453000");

        Employees.add(emp1);
        Employees.add(emp2);
        Employees.add(emp3);
        Employees.add(emp4);
        Employees.add(emp5);
        Employees.add(emp6);
        Employees.add(emp7);
        Employees.add(emp8);
        Employees.add(emp9);
        Employees.add(emp10);

        System.out.println(Employees.toString());
    }
}
