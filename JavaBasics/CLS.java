import java.io.IOException;
public class CLS {
    public static void main( String ... arg) throws IOException, InterruptedException
    {
        new ProcessBuilder("cmd", "/c","cls").inheritIO().start().waitFor();
    }
}
