import java.util.Scanner;

class Student {
    int roll_no;
    String name;
    Scanner sc = new Scanner(System.in);

    public void get_stud() {
        System.out.print("Enter Roll no: ");
        roll_no = sc.nextInt();
        System.out.print("Enter Name: ");
        name = sc.next();

    }

    public void put_stud() {
        System.out.print("\nRoll No: " + roll_no);
        System.out.print("\nName: " + name);
    }
}

class Marksheet extends Student {
    int java, mic, sen, gad, dcc;
    double perc, total;

    public void accept() {
        System.out.print("Enter marks of subjects:-\n");
        System.out.print("Java-");
        java = sc.nextInt();
        System.out.print("MIC-");
        mic = sc.nextInt();
        System.out.print("SEN-");
        sen = sc.nextInt();
        System.out.print("GAD-");
        gad = sc.nextInt();
        System.out.print("DCC-");
        dcc = sc.nextInt();
    }

    public void Display() {
        System.out.println("Marks of subjects:-");
        System.out.println("Java-" + java);
        System.out.println("MIC-" + mic);
        System.out.println("SEN-" + sen);
        System.out.println("GAD-" + gad);
        System.out.println("DCC-" + dcc);
    }

    public void Calculate() {
        total = (java + mic + sen + gad + dcc);
        perc = (total / 5);
    }

    public void Percentage() {
        System.out.print("Total Marks-" + total);
        System.out.print("\nPercentage-" + perc);
    }

    public static void main(String args[]) {
        Marksheet m = new Marksheet();
        System.out.print("Enter information of Student-\n");
        m.get_stud();
        m.accept();
        m.Calculate();
        System.out.print("\nInformation of Student-\n");
        m.put_stud();
        m.Display();
        m.Percentage();
    }
}
