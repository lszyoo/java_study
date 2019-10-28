package ast;

import org.apache.hadoop.hive.ql.parse.ASTNode;
import org.apache.hadoop.hive.ql.parse.ParseDriver;
import org.apache.hadoop.hive.ql.parse.ParseException;
import org.apache.hadoop.hive.ql.parse.ParseUtils;

public class ASTTest {
    public static void main(String[] args) throws ParseException {
        String parseSQL = "SELECT a.name FROM (SELECT name FROM person) a";
        ParseDriver pd = new ParseDriver();
        ASTNode ast = pd.parse(parseSQL);
        System.out.println(ast.dump());
        System.out.println(ast.getChildren().get(0).getChildren());

        System.out.println(ParseUtils.findRootNonNullToken(ast).dump());
    }
}
