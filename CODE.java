class MyThread extends Thread {
public MyThread(String name) {
super(name);
}
@Override
public void run() {
try {
System.out.println(Thread.currentThread().getName() + &quot; is

running.&quot;);

Thread.sleep(500);
} catch (InterruptedException e) {
System.out.println(Thread.currentThread().getName() + &quot; is

interrupted.&quot;);
}
if (Thread.interrupted()) {
System.out.println(Thread.currentThread().getName() + &quot; is

interrupted again.&quot;);
}
System.out.println(Thread.currentThread().getName() + &quot; is in
state: &quot; + Thread.currentThread().getState());
}



public class ThreadDemo {
public static void main(String[] args) {
Thread thread1 = new MyThread(&quot;Thread 1&quot;);
Thread thread2 = new MyThread(&quot;Thread 2&quot;);
thread1.start();
thread2.start();
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
e.printStackTrace();
}
