package com.jianjang.graalvm.demo.js;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;

/**
 * @program: graalvm-demo
 * @description: 测试用例3
 * @author: Jian Jang
 * @create: 2022-11-12 22:06:36
 */
public class JavaScriptDemo3 {
    /***
     * 运行脚本
     * 注意：这里为啥()用包着，意思是运行函数
     */

    public static void main(String[] args) throws IOException {
        Context context = Context.create();
        //执行指定js文件中的方法
        File resource = new ClassPathResource("dateUtils.js").getFile();
        Source fibSrc = Source.newBuilder("js", resource).build();
        context.eval(fibSrc);
        //获取js文件中的成员关键字
        System.out.println("Polyglot JS members are:" + context.getBindings("js").getMemberKeys());
        Value auth = context.getBindings("js").getMember("auth");
        System.out.println("auth="+auth.toString());
        //找到执行函数
        Value getDate = context.getBindings("js").getMember("getDate");
        Value result = getDate.execute(new String[]{});
        System.out.println("getDate="+result.toString());
        Value getTimeStamp = context.getBindings("js").getMember("getTimeStamp");
        Value result2 = getTimeStamp.execute(new String[]{});
        System.out.println("getTimeStamp="+result2.asLong());
    }
}
