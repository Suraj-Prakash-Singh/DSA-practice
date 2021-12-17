public class demo implements Runnable {
   @Override
    public void run()
    {
        try{
            System.out.println("Thread "+Thread.currentThread().getId()+" is running");
        }
        catch(Exception e){
            System.out.println("Exception is caught"+ e.getMessage());

        }//exception is a datatype
    }
    public static void main(String[] args) {

    }
}
