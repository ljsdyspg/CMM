import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.*;

public class BL extends JFrame {

    private static int width;
    private static int length;

    private JTextArea code;
    private JTextArea result;
    private JTextArea parsing;

    private JScrollPane code_panel;
    private JScrollPane result_panel;
    private JScrollPane parsing_panel;

    private JSplitPane splitPane;
    private JSplitPane splitPane_bottom;

    private String cmmFile = "test.cmm";

    public BL() throws IOException {


        setTitle("cmm");
        setBounds(100, 100,1280,720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BufferedReader in;

        code = new JTextArea();
        code.setLineWrap(true);
        code.setFont(new Font(null,Font.PLAIN,30));

        in = new BufferedReader(new FileReader(new File(cmmFile)));
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
        parsing.setFont(new Font(null,Font.PLAIN,32));
        parsing.setEditable(false);
        in = new BufferedReader(new FileReader(new File("output2.txt")));
        line = in.readLine();
        while(line != null){
            parsing.append(line + "\n");
            line = in.readLine();
            System.out.println(line);
        }
        in.close();

   /*   code_panel = new JScrollPane(code);
        result_panel = new JScrollPane(result);
        parsing_panel = new JScrollPane(parsing);

        splitPane = new JSplitPane();
        splitPane.setLeftComponent(code_panel);
        splitPane.setRightComponent(result_panel);
        splitPane.setContinuousLayout(true);
        splitPane.setDividerLocation(900);

        splitPane_bottom = new JSplitPane(JSplitPane.VERTICAL_SPLIT);
        splitPane_bottom.setLeftComponent(splitPane);
        splitPane_bottom.setRightComponent(parsing_panel);*/


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
        getContentPane().add(splitPane, BorderLayout.CENTER);
        splitPane.setTopComponent(splitPane_bottom);
        splitPane.setBottomComponent(parsing_panel);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                getWindowSize(e);
            }
        });


        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("文件(F)");
        fileMenu.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        menuBar.add(fileMenu);

        JMenuItem newMenuItem = new JMenuItem("新建(N)");
        newMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        fileMenu.add(newMenuItem);

        JMenuItem openMenuItem = new JMenuItem("打开(O)");
        openMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        fileMenu.add(openMenuItem);

        JMenuItem saveMenuItem = new JMenuItem("保存(S)");
        saveMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        saveMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                save(e);
            }
        });
        fileMenu.add(saveMenuItem);

        JMenuItem saveAsMenuItem = new JMenuItem("另存为(A)");
        saveAsMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        saveAsMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                saveAs(e);
            }
        });
        fileMenu.add(saveAsMenuItem);

        JMenuItem exitMenuItem = new JMenuItem("退出(X)");
        exitMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                exit(e);
            }
        });
        fileMenu.add(exitMenuItem);

        JMenu editMenu = new JMenu("编辑(E)");
        editMenu.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        menuBar.add(editMenu);

        JMenuItem undoMenuItem = new JMenuItem("撤销(U)");
        undoMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        editMenu.add(undoMenuItem);

        JSeparator separator3 = new JSeparator();
        editMenu.add(separator3);

        JMenuItem cutMenuItem = new JMenuItem("剪切(T)");
        cutMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        editMenu.add(cutMenuItem);

        JMenuItem copyMenuItem = new JMenuItem("复制(C)");
        copyMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        editMenu.add(copyMenuItem);

        JMenuItem pasteMenuItem = new JMenuItem("粘贴(P)");
        pasteMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        editMenu.add(pasteMenuItem);

        JMenuItem deleteMenuItem = new JMenuItem("删除(L)");
        deleteMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        editMenu.add(deleteMenuItem);

        JSeparator separator4 = new JSeparator();
        editMenu.add(separator4);

        JMenuItem findMenuItem = new JMenuItem("查找(F)");
        findMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        editMenu.add(findMenuItem);

        JMenuItem findNextMenuItem = new JMenuItem("查找下一个(N)");
        findNextMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        editMenu.add(findNextMenuItem);

        JMenuItem replaceMenuItem = new JMenuItem("替换(R)");
        replaceMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        editMenu.add(replaceMenuItem);

        JMenuItem gotoMenuItem = new JMenuItem("转到(G)");
        gotoMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        editMenu.add(gotoMenuItem);

        JSeparator separator5 = new JSeparator();
        editMenu.add(separator5);

        JMenuItem allMenuItem = new JMenuItem("全选(A)");
        allMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        editMenu.add(allMenuItem);

        JMenuItem dateMenuItem = new JMenuItem("时间/日期(D)");
        dateMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        editMenu.add(dateMenuItem);

        JMenu formatMenu = new JMenu("格式(O)");
        formatMenu.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        menuBar.add(formatMenu);

        JMenuItem wrapMenuItem = new JMenuItem("自动换行(W)");
        wrapMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        formatMenu.add(wrapMenuItem);

        JMenuItem FontMenuItem = new JMenuItem("字体(F)");
        FontMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        formatMenu.add(FontMenuItem);

        JMenu viewMenu = new JMenu("查看(V)");
        viewMenu.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        menuBar.add(viewMenu);

        JMenuItem statusMenuItem = new JMenuItem("状态栏(S)");
        statusMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        viewMenu.add(statusMenuItem);

        JMenu helpMenu = new JMenu("帮助(H)");
        helpMenu.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        menuBar.add(helpMenu);

        JMenuItem helpMenuItem = new JMenuItem("查看帮助(H)");
        helpMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        helpMenu.add(helpMenuItem);

        JSeparator separator6 = new JSeparator();
        helpMenu.add(separator6);

        JMenuItem aboutMenuItem = new JMenuItem("关于记事本(A)");
        aboutMenuItem.setFont(new Font("微软雅黑", Font.PLAIN, 16));
        helpMenu.add(aboutMenuItem);
    }

    private void getWindowSize(WindowEvent e) {
        Toolkit toolkit = getToolkit();// 获得窗体工具包
        Dimension screenSize = toolkit.getScreenSize();// 获取屏幕大小
        int width = (int) (screenSize.width * 0.8);// 计算窗体新宽度
        int height = (int) (screenSize.height * 0.8);// 计算窗体新宽度
        setSize(width, height);// 设置窗体大小
    }




    private void save(ActionEvent e) {
        String text = code.getText();// 获取用户输入
        if (text.isEmpty()) {// 过滤空文本的保存操作
            JOptionPane.showMessageDialog(this, "没有需要保存的文本");
            return;
        }
        File file = new File(cmmFile); // 获取用户选择的文件
        try {
            FileOutputStream fout = new FileOutputStream(file);// 创建该文件的输出流
            fout.write(text.getBytes());// 把文本保存到文件
        } catch (IOException e1) {
            e1.printStackTrace();
        }

    }

    private void saveAs(ActionEvent e) {
        String text = code.getText();// 获取用户输入
        if (text.isEmpty()) {// 过滤空文本的保存操作
            JOptionPane.showMessageDialog(this, "没有需要保存的文本");
            return;
        }
        JFileChooser chooser = new JFileChooser();// 创建文件选择器
        int option = chooser.showSaveDialog(this);// 打开文件保存对话框
        if (option == JFileChooser.APPROVE_OPTION) {// 处理文件保存操作
            File file = chooser.getSelectedFile();// 获取用户选择的文件
            try {
                FileOutputStream fout = new FileOutputStream(file);// 创建该文件的输出流
                fout.write(text.getBytes());// 把文本保存到文件
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    private void exit(ActionEvent e) {
        System.exit(0);
    }

}
