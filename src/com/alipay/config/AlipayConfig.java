package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016101000655499";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCC8MxL3gu2t38CD35wbJ7O3w/sxRKXYQQr3TNNyatqxJntL4jtttae9wWzqEjjquXpAU6+8rt0gdd3LlMNb9mJVwry0Ptw+7dMJT58hfN8nDtcwmv7qfMNWIb57vi7SsVMtWfeufdUOzDGy1/OI6mHt0pIkkhthaQ7mV8wzojK1ERp31MTOqOF9C8LdOgnGWIHGJiMphFqPpX96Ul7+2fuVa/7e1O9DtAMbH9y/HD5tjqIr3NEdTn5ylBk2iO3TxUq1chajS/fA46oxzTyUjrcWu2QkN60p4gwP5xDa3PVb/oAS2qkjlIrg9BY+CgOR1pNmKYXYO2E5qmgvN7DRlKLAgMBAAECggEANNJ7N+fdhdpEbEpf0W6gKggmXnep5lOG4UMc3TaL5khlaB+S94KY1gwEytMKhH1+vh5+69zz7i4rA7M2YedLNHJewlG3/X4uFZO4v3cyIITOFb+A3EdU+39JBC55POUO7sEHo/wVYG94X9nPTlNooo04dEo+2Z/d/wUCN6g52shuS0AQAbCpKQQfWOh3VbhEoJb0zJSBSQ7AsnfeAyK7O4GTf0mVAbHcvBbALkjM7L7vlhnB6v0x+Wy3wJvCEc6RzgG7fg/XTQKqi8rVwGnc8ZBETUgCkIp8fe24sbuELw9ghbayNsS3S6EAYQdZukLF5L0B+6Xx9o4h1mFVwn4HIQKBgQDKyOqrsgOW1yHd6GMsvsAAvETjnydn76NDwQHSzfNW+IVnDWvfTFFz07AAdqf+UbcTBteK/dDTQFDgGeITbTfDDbdkuykyQ88XIebpeJ+VVffnxiuxEa7w//yrRrgUBJ0bx7K4E23bbgcLmmJFLM9QJtwt8c5lpjI17otwMXBamQKBgQClTWM9wncG21ngOQ0ys2V/9beX2Cj85I7fCWeB4g+YmQrWkKDGYp0IvCjOzXRZ+Am5mEGbbJbCG2HqtlbVpzdgFyiPqb0PtI4xtS+4LzNIPoHzl0QLX2l8F2S1sYn4byBMML3NuSq1NjZpWxDfb/WlfcIx13NMCxdK4wXgU93QwwKBgQDCSC51Yy8HJIRA+/WQmAySZ85EmmYBsVklf9REaKb8K0x8SCKSpKbhJu5X81bOVPHmm8aEVtrsmpEhtAqifCBRk2Gic6JrkwXk7skx5CxYwi2qdHXFxuBp64fjfPS90RHI3NIAhDTbZ5X+auI9zkmtTB3lMueBAfLXMv2K9wLi+QKBgQCU2C44ela7MeCn6jdcI/WNVzBN5jJiJVwQsWMmrOvmOEhuFCTw/fLw3pzQOmg+av42xEavMQQ/HHD6690c3UkbmT7Ivcqjza0MTV3+t2Gx97cEJHz80JknR9lDUe4uacHnWSxPhiBSs9Ii5AE5cJL8xVSLlLkZDBOZNvsfl+TwCQKBgGOV2uD28iLo6zcrdFmkuowQXfSW3U2W3yXHAZHvPjukVQv3zOQoWJtuO1YLackWp227MZHRb2ilwAAmaw+6NlZGODlv9Kv/SG04zeb6QJI5UKbFonwXI7WZz6i6u9n1EqILs5cuQkOffaYDObYldfSOqtjPLzSm1EgIesTfxGPT";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAgvDMS94Ltrd/Ag9+cGyezt8P7MUSl2EEK90zTcmrasSZ7S+I7bbWnvcFs6hI46rl6QFOvvK7dIHXdy5TDW/ZiVcK8tD7cPu3TCU+fIXzfJw7XMJr+6nzDViG+e74u0rFTLVn3rn3VDswxstfziOph7dKSJJIbYWkO5lfMM6IytREad9TEzqjhfQvC3ToJxliBxiYjKYRaj6V/elJe/tn7lWv+3tTvQ7QDGx/cvxw+bY6iK9zRHU5+cpQZNojt08VKtXIWo0v3wOOqMc08lI63FrtkJDetKeIMD+cQ2tz1W/6AEtqpI5SK4PQWPgoDkdaTZimF2DthOapoLzew0ZSiwIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，一定要部署在服务器才能访问, 必须外网可以正常访问
	public static String notify_url = "http://pay2.java1234.com/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，一定要部署在服务器才能访问, 必须外网可以正常访问
	public static String return_url = "http://pay2.java1234.com/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

