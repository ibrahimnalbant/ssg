package methodcreaationobjectcreation1;

public class SchoolRunner extends School{

    public static void main(String[] args) {

        System.out.println("okul ismi = " + okulIsmiRun);
    }

    static School school = new School();
    static String okulIsmiRun = school.okulIsmi;
}
