import javax.swing.*;
import java.awt.*;
import java.io.*;

public class CMM {

    public static void main(String[] args) throws IOException {
        try {
            parse.parse();
            lexer.lexer();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        BL frame = new BL();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }
}
