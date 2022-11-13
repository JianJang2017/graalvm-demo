package com.jianjang.graalvm.demo.js;

import org.graalvm.polyglot.Context;

import java.io.IOException;

/**
 * @program: graalvm-demo
 * @description: 测试用例1
 * @author: Jian Jang
 * @create: 2022-11-12 22:06:36
 */
public class PythonDemo1 {
    /***
     * 运行脚本
     */

    public static void main(String[] args) throws IOException {
        Context context = Context.create();
        context.eval("python", "print('Hello GraalVM! from Python')");
    }
}
