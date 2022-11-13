package com.jianjang.graalvm.demo.js;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Source;
import org.graalvm.polyglot.Value;
import org.springframework.core.io.ClassPathResource;

import java.io.File;
import java.io.IOException;

/**
 * @program: graalvm-demo
 * @description: 运行js
 * @author: Jian Jang
 * @create: 2022-11-11 15:33:41
 */
public class JavaScriptDemo {
    private static String JS_CODE = "(function myFun(param){console.log('hello '+param); return new Date();})";

    public static void main(String[] args) throws IOException {
        Context context = Context.create();
        context.eval("js", "console.log('Hello GraalVM! from JavaScript')");
        context.eval("python", "print('Hello GraalVM! from Python')");
        //JS 带参数及返回值
        Value value = context.eval("js", JS_CODE);
        Value result = value.execute("Jack");
        System.out.println(result.toString());
        //执行指定js文件中的方法
        File resource = new ClassPathResource("dateUtils.js").getFile();
        Source fibSrc = Source.newBuilder("js", resource).build();
        context.eval(fibSrc);
        System.out.println("Polyglot JS members are:" + context.getBindings("js").getMemberKeys());
        Value fib = context.getBindings("js").getMember("getDate");
        System.out.println(fib.execute(new String[]{}));
    }
}

