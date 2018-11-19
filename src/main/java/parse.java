import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.*;

public class parse {

    public static void parse() throws IOException {
        // choose a file from innership
        String fileName = "test.cmm";


        // create a CharStream that reads from file
        File file = new File(fileName);
        FileInputStream inputFile = null;

        inputFile = new FileInputStream(file);

        //lexer file in
        ANTLRInputStream input = null;

        input = new ANTLRInputStream(inputFile);


        CMMLexer lexer = new CMMLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CMMParser parser = new CMMParser(tokens);

        //输出

        PrintStream printStream = new PrintStream(new FileOutputStream(new File("output2.txt")));

        ParseTree parseTree = parser.program();
        System.out.println(parseTree.toStringTree(parser));
        printStream.println(parseTree.toStringTree(parser));
        inputFile.close();
        printStream.close();

    }
}
