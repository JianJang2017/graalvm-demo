package com.jianjang.graalvm.demo.js;

import org.graalvm.polyglot.Context;

/**
 * @program: graalvm-demo
 * @description: 测试用例1
 * @author: Jian Jang
 * @create: 2022-11-12 22:06:36
 */
public class JavaScriptDemo1 {
    public static void main(String[] args) {
        Context context = Context.create();
        context.eval("js", "console.log('Hello GraalVM! from JavaScript')");
    }
}
