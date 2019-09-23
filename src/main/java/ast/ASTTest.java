package ast;

import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.ParseDriver;
import org.apache.hadoop.hive.ql.parse.ParseException;

public class ASTTest {
    public static void main(String[] args) throws ParseException {
        String parseSQL = "SELECT name FROM person";
        ParseDriver pd = new ParseDriver();
        ASTNode ast = pd.parse(parseSQL);
        System.out.println(ast.dump());
    }
}
