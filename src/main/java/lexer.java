import org.antlr.v4.runtime.*;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;


public class lexer extends BaseErrorListener{
    private List<String> stack;
    public static StringBuilder builder = new StringBuilder();

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        stack = ((Parser)recognizer).getRuleInvocationStack();
        Collections.reverse(stack);

       /* builder.append("rule stack: "+stack+" ");
        builder.append("line "+line+":"+charPositionInLine+" at "+offendingSymbol+": "+msg);*/System.out.println("锤！");
        System.out.println("line "+line+":"+charPositionInLine+" at "+offendingSymbol+": "+msg);

    }
    public static void lexer() throws IOException{

        //获取测试CMM代码
        String fileName = "test.cmm";
        File file = new File(fileName);
        FileInputStream inputFile = new FileInputStream(file);
        LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));

        //输出
        PrintStream printStream = new PrintStream(new FileOutputStream(new File("output.txt")));

        //词法分析
        ANTLRInputStream input = new ANTLRInputStream(inputFile);
        CMMLexer lexer = new CMMLexer(input);

        lexer.removeErrorListeners();
        lexer.addErrorListener(DescriptiveErrorListener.INSTANCE);


        //存储Token
        ArrayDeque<Token> arrayDeque = new ArrayDeque<Token>();
        String[] tokenTags = CMMLexer._SYMBOLIC_NAMES;
        int lineNum = 1;



        //遍历CMM
        for (Token token = lexer.nextToken(); token.getType() != Token.EOF; token = lexer.nextToken()) {
            if (lineNum != token.getLine()) {
                for (int i=lineNum; i<token.getLine(); i++) {
                    lineNumberReader.setLineNumber(i);
                    String s = lineNumberReader.readLine();
                    System.out.printf("%d: %s\n", i, s);
                    printStream.printf("%d: %s\n", i, s);
                }
                //判定条件为是否是注释行
                while (!arrayDeque.isEmpty()) {
                    Token t = arrayDeque.pollFirst();
                    if (!tokenTags[t.getType()].equals("COMMENT") && !tokenTags[t.getType()].equals("LINE_COMMENT"))
                    {
                        System.out.printf("\t%s %s\n", tokenTags[t.getType()], t.getText());
                        printStream.printf("\t%s %s\n", tokenTags[t.getType()], t.getText());
                    }
                }
                lineNum = token.getLine();
            }
            arrayDeque.addLast(token);
        }

        Token token = lexer.nextToken();
        if (token.getType() == Token.EOF){
            lineNumberReader.setLineNumber(lineNum);
            String s = lineNumberReader.readLine();
            System.out.printf("%d: %s\n", lineNum, s);
            printStream.printf("%d: %s\n", lineNum, s);
            lineNum++;
            System.out.println(lineNum+": EOF" );
            printStream.println(lineNum+": EOF" );
        }
        printStream.println(builder.toString());
        inputFile.close();
        printStream.close();
        System.out.println(builder.toString());
    }

    public static void main(String[] args) throws IOException {
        lexer();
    }
}
