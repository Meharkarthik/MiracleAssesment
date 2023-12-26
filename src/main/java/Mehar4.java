class Mehar4 extends Thread{
    public void run(){
        System.out.println("thread is running...");
    }
    public static void main(String args[]){
        Mehar4 t1=new Mehar4();
        t1.start();
    }
}