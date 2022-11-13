package com.jianjang.graalvm.demo.js;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;

/**
 * @program: graalvm-demo
 * @description: 测试用例2
 * @author: Jian Jang
 * @create: 2022-11-12 22:06:36
 */
public class PythonDemo2 {
    /***
     * 运行脚本
     */

    public static void main(String[] args) throws IOException {
        Context context = Context.create();
        //执行指定js文件中的方法
        File resource = new ClassPathResource("MyFunc.py").getFile();
        Source fibSrc = Source.newBuilder("python", resource).build();
        context.eval(fibSrc);
        //获取js文件中的成员关键字
        System.out.println("Polyglot python members are:" + context.getBindings("python").getMemberKeys());
        //找到执行函数
        Value getDate = context.getBindings("python").getMember("getDate");
        Value result = getDate.execute(new String[]{});
        System.out.println("getDate="+result.toString());
    }
}
