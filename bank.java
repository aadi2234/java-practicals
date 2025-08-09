import java.lang.*;

class BoB {
    double rate = 9.7;

    void display() {
        System.out.println("Rate of Interest of BoB=" + rate + " %");
    }
}

class SBI extends BoB {
    double rate1 = 6.9;

    void display() {
        super.display();
        System.out.println("Rate of Interest of SBI=" + rate1 + " %");
    }

}

class Bank {
    public static void main(String args[]) {
        SBI s = new SBI();
        s.display();
    }
}