public class NewThread extends Thread{
    private String name;

    NewThread(String name){
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println(i + "-" + name);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
