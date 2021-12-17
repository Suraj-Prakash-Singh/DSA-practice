import java.util.Scanner;

public class Multithreading extends Thread {
    public void run(){
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        }
        catch(Exception e){
            System.out.println("Exception is caught"+ e.getMessage());

        }//exception is a datatype
    }
    public static void main(String[] args) {
        int n= 8;
        for(int i =0;i<n;i++){
            Multithreading obj = new Multithreading();
            obj.start();
            //start() method is from thread class
            //this will start a thread and in turn the run() method will be called

        }
//run() thread class ka method h
    }
}
