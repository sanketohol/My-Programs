class setPriority {
    public static void main(String Arg[]) {
        // create a new thread
        Thread t = new Thread(new MyRunnable());

        // set the priority of the thread
        t.setPriority(Thread.MAX_PRIORITY);

        // start the thread
        t.start();
    }
}

class MyRunnable implements Runnable {
    public void run() {
        // code to be executed in the new thread
    }
}
