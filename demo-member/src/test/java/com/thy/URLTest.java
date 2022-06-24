package com.thy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.StandardCharsets;

public class URLTest {

    public static void main(String[] args) throws IOException {
        //连接URL请求
        URL url = new URL("http://localhost:8090/order/queryUser?userId=12");
        /* 字节流 */
        //InputStream is = url.openConnection().getInputStream();
        InputStream is = url.openStream();
        /* 字符流 */
        InputStreamReader isr = new InputStreamReader(is, StandardCharsets.UTF_8);
        /* 提供缓存功能 */
        BufferedReader br = new BufferedReader(isr);
        String line;
        //每次读取一行的数据输出，实际上输出的是一个HTML页面，也就是说服务器响应的是一个静态HTML页面的代码
        //该页面进过浏览器渲染，我们就能看到熟悉的“百度一下”的界面
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }

}
