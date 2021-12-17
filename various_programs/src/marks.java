public class marks {
    public static void main(String[] args) {
        int subject1,subject2,subject3;
        subject1=78;
        subject2=45;
        subject3=62;
        double total = subject1+subject2+subject3;
        System.out.println("Total marks are "+total);
        double percentage = (total/300)*100;
        System.out.println("Percentage marks are "+percentage+" %");

    }
}
