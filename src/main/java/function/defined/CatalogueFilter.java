package function.defined;

import java.io.File;
import java.io.FilenameFilter;

/**
 *  自定义方法：
 *    1.返回值类型
 *    2.参数列表：指定的目录
 *    3.方法名
 *    4.方法体
 */
public class CatalogueFilter {
    public static void main(String[] args){
        getNames("F:\\");
    }

    /**
     *    过滤当前目录中所有 .txt 文件，并将结果输出到控制台上
     *    @param directory
     *    @return
     */
    public static String[] getNames(String directory){
        File file = new File(directory);
//		方法：String[] list(FilenameFilter filter)
//      返回一个字符串数组，这些字符串指定此抽象路径名表示的目录中满足指定过滤器的文件和目录。
//		FilenameFilter（接口）：实现此接口的类实例可用于过滤器文件名
        String[] namesFilter = file.list(new FilenameFilter(){
//			FilenameFilter接口方法：boolean accept(File dir, String name)
//	        测试指定文件是否应该包含在某一文件列表中。
//			dir - 被找到的文件所在的目录。   name - 文件的名称。
//			String类方法：boolean endsWith(String suffix)
//	        测试此字符串是否以指定的后缀结束。
//			匿名内部类              接口重写
            @Override
            public boolean accept(File dir, String name) {
//				System.out.println("dir:=="+dir+"name=="+name);
                File file1 = new File(dir, name);
                return (
                        file1.isFile()   // 判断是否是目录
                                &&
                                file1.getName().endsWith(".txt")     // 字符串调用方法，获取文件名
                );
            }
        });
        for(String str : namesFilter){
            System.out.println(str);
        }
        return namesFilter;
    }
}

