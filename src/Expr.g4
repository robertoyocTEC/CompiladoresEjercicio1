grammar Expr;
prog: (expr NEWLINE {
    Main.printStack(Main.stack);
})* ;
expr: expr '+' term {
    Main.stack.push("+");
} | expr '-' term {
    Main.stack.push("-");
}  | term;
term: term '*' factor {
    Main.stack.push("*");
} | term '/' factor {
    Main.stack.push("/");
} | factor;
factor: INT {
     Main.stack.push(_ctx.getText());
} | '(' expr ')';
NEWLINE : [\r\n]+;
INT : [0-9]+ ;