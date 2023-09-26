import java.io.IOException;

public class Counter implements AutoCloseable{
    private boolean flag = false;
    private int counter = 0;

    public void add() throws IOException{
        if(flag) throw new IOException("Ресурс закрыт");
        counter++;
    }

    @Override
    public void close() throws Exception {
        flag = true;
    }

    public boolean isClose(){
        return flag;
    }
}
