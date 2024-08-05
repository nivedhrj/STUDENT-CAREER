import java.util.*;
class Student_Career{
    int mm;
    int scm;
    int com;
    int total;
    double per;
    Student_Career(int mm, int scm,int com){
       this.mm=mm;
       this.scm=scm;
       this.com=com;

    }
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks in MATHS.:");
        mm=sc.nextInt();
        System.out.println("Enter your marks in SCIENCE:");
        scm=sc.nextInt();
        System.out.println("Enter your marks in COMPUTER SCIENCE:");
        com=sc.nextInt();
        sc.close();
    }
    public void check(){
        total=mm+scm+com;
        per=(total/1000.0)*100;
        if(mm>=90&&scm>=90&&com>=90){
            System.out.println("Science with Computer");
        }
        else if(per>90){
            System.out.println("Bio-Science");
        }
        else if(per>=80&&per<90){
            System.out.println("Science with Hindi");
        }
        else{
            System.out.println("You are not eligible for this.");
        }
    }
    public static void main(String[]Args){
        Student_Career Main=new Student_Career(0,0,0);
        Main.input();
        Main.check();
    }
}