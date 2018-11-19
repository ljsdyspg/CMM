import javax.swing.*;
import java.awt.*;
import java.io.*;

public class CMM {
    private static void initUI() throws IOException {
        JFrame jFrame = new JFrame();

        JTextArea code;
        JTextArea result;
        JTextArea parsing;

        JScrollPane code_panel;
        JScrollPane result_panel;
        JScrollPane parsing_panel;

        JSplitPane splitPane;
        JSplitPane splitPane_bottom;

        jFrame.setTitle("CMM");
        jFrame.setBounds(100, 100, 1920, 1080);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        BufferedReader in;

        code = new JTextArea();
        code.setLineWrap(true);
        code.setFont(new Font(null,Font.PLAIN,30));
        code.setEditable(false);

        in = new BufferedReader(new FileReader(new File("test.cmm")));
        String line = in.readLine();
        while(line != null){
            code.append(line + "\n");
            line = in.readLine();
            System.out.println(line);
        }
        in.close();

        result = new JTextArea();
        result.setLineWrap(true);
        result.setFont(new Font(null,Font.PLAIN,18));
        result.setEditable(false);
        in = new BufferedReader(new FileReader(new File("output.txt")));
        line = in.readLine();
        while(line != null){
            result.append(line + "\n");
            line = in.readLine();
            System.out.println(line);
        }
        in.close();

        parsing = new JTextArea();
        parsing.setLineWrap(true);
        parsing.setFont(new Font(null,Font.PLAIN,18));
        parsing.setEditable(false);
        in = new BufferedReader(new FileReader(new File("output2.txt")));
        line = in.readLine();
        while(line != null){
            parsing.append(line + "\n");
            line = in.readLine();
            System.out.println(line);
        }
        in.close();

        code_panel = new JScrollPane(code);
        result_panel = new JScrollPane(result);
        parsing_panel = new JScrollPane(parsing);


        splitPane_bottom = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
        splitPane_bottom.setLeftComponent(code_panel);
        splitPane_bottom.setRightComponent(result_panel);
        splitPane_bottom.setDividerLocation(900);
        splitPane_bottom.setDividerSize(8);
        splitPane_bottom.setOneTouchExpandable(true);
        splitPane_bottom.setContinuousLayout(true);


        splitPane = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        splitPane.setDividerLocation(600);
        jFrame.getContentPane().add(splitPane, BorderLayout.CENTER);
        splitPane.setTopComponent(splitPane_bottom);
        splitPane.setBottomComponent(parsing_panel);
        jFrame.setVisible(true);
    }


    public static void main(String[] args) throws IOException {
        try {
            parse.parse();
            lexer.lexer();
        }catch(IOException e){
            e.printStackTrace();
        }finally {
            initUI();
        }
    }
}
