package src.think_java;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class HttpRequest {
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "/" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
//            URLConnection connection = realUrl.openConnection();
            HttpURLConnection connection = (HttpURLConnection) realUrl.openConnection();
            if (connection.getResponseCode() == 200){
                in = new BufferedReader(new InputStreamReader(
                        connection.getInputStream()));
                String line;
                while ((line = in.readLine()) != null) {
                    result += line;
                }
            } else {
                throw new Exception("请求失败,响应码为：" + connection.getResponseCode());
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sendGet("http://ip-api.com/json", "45.79.165.225"));
    }
}
