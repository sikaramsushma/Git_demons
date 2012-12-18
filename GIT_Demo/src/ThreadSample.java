
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadSample {
 
    private double re, im;
 
    public ThreadSample(double re, double im) {
        this.re = re;
        this.im = im;
    }
   
     
    public static void main(String[] args) {
            //  System.out.println("Sam!");  
              sampleThread sam = new sampleThread();
              ThreadSample tv= new ThreadSample(12,34);
              	if(ThreadSample.class.isInstance(sam)){
              		System.out.println("sucess");
              	}else{
              		System.out.println("fail");
              	}
    }
    
   
}