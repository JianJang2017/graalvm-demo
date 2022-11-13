package com.jianjang.graalvm.demo.js;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;

/**
 * @program: graalvm-demo
 * @description: 测试用例2
 * @author: Jian Jang
 * @create: 2022-11-12 22:06:36
 */
public class JavaScriptDemo2 {
    /***
     * 运行脚本
     * 注意：这里为啥()用包着，意思是运行函数
     */
    private static String JS_CODE = "(function hello(param){console.log('hello '+param); return new Date();})";

    public static void main(String[] args) {
        Context context = Context.create();
        //JS 带参数及返回值
        Value value = context.eval("js", JS_CODE);
        Value result = value.execute("Jack");
        System.out.println(result.toString());
    }
}
