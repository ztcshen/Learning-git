package com.thy;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;
import sun.net.www.http.HttpClient;

import java.io.IOException;

public class TestHttpClient {

    /**
     * 1.实例化HttpClient客户端对象
     * 2.定义url地址
     * 3.定义请求类型
     * 4.发起httpClient请求
     * 5.获取响应结果 分析状态码信息  200 404 500 504 502
     * 6.获取结果,进行后续操作
     */
    @Test
    public void testGet() throws IOException {
        CloseableHttpClient httpClient = HttpClients.createDefault();
        String url = "http://localhost:8090/order/queryUser?userId=12";
        HttpGet httpGet = new HttpGet(url);
        HttpResponse httpResponse = httpClient.execute(httpGet);
        if(httpResponse.getStatusLine().getStatusCode() == 200){
            //表示请求一切正常
            HttpEntity httpEntity = httpResponse.getEntity();//获取响应结果实体对象
            String result  = EntityUtils.toString(httpEntity, "UTF-8");
            System.out.println(result);
        }else{
            //表示请求有误
            System.out.println("请求结果有误!!!");
        }
    }
}
