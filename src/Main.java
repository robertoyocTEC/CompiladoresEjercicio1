import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        try {
            CharStream input = CharStreams.fromStream(System.in);
            ExprLexer lexer = new ExprLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            ExprParser parser = new ExprParser(tokens);
            ParseTree tree = parser.prog();
            // System.out.println(tree.toStringTree(parser));
        /*
        ParseTreeWalker walker = new ParseTreeWalker();
        MiListener listener = new MiListener();
        walker.walk(listener, tree);
        */
        }
        catch(Exception e) {
            System.out.println("Error"); }
    }
    public static Stack<String> stack = new Stack<String>();
    public static void printStack(Stack<String> stack) {
        List<String> list = new ArrayList<String>();
        int length = 0;
        while(!Main.stack.isEmpty()) {
            list.add(Main.stack.pop());
            length++;
        }
        for (int i = length - 1; i >= 0; i--){

            System.out.print(list.get(i));
            System.out.print(" ");
        }
        System.out.println(" ");
    }

}
