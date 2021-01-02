package com.bookshop.utils;

import org.junit.Test;

import java.util.Base64;

/**
 * @ Author     : Rain
 * @ Classname  : Base64Util
 * @ Date       : 2019/5/21 10:04
 * @ Description: 常见于邮件、http加密，截取http信息，你就会发现登录操作的用户名、密码字段通过BASE64加密的。
 */

public class Base64Util {

    /**
     * BASE64的加密解密是双向的，可以求反解.
     * BASE64Encoder和BASE64Decoder是非官方JDK实现类。虽然可以在JDK里能找到并使用，但是在API里查不到。
     * JRE 中 sun 和 com.sun 开头包的类都是未被文档化的，他们属于 java, javax 类库的基础，其中的实现大多数与底层平台有关，
     * 一般来说是不推荐使用的。
     * BASE64 严格地说，属于编码格式，而非加密算法
     * 主要就是BASE64Encoder、BASE64Decoder两个类，我们只需要知道使用对应的方法即可。
     * 另，BASE加密后产生的字节位数是8的倍数，如果不够位数以=符号填充。
     * BASE64
     * 按照RFC2045的定义，Base64被定义为：Base64内容传送编码被设计用来把任意序列的8位字节描述为一种不易被人直接识别的形式。
     * （The Base64 Content-Transfer-Encoding is designed to represent arbitrary sequences of octets in a form that need not be humanly readable.）
     * 常见于邮件、http加密，截取http信息，你就会发现登录操作的用户名、密码字段通过BASE64加密的。
     */


    public static String encode(String src) {
        byte[] encodeBytes = Base64.getEncoder().encode(src.getBytes());
        return new String(encodeBytes);
    }

    public static String decode(String src) {
        byte[] decodeBytes = Base64.getDecoder().decode(src.getBytes());
        return new String(decodeBytes);
    }

    @Test
    public void testbase64() throws Exception {

        System.out.println(encode("任思雨"));
        System.out.println(decode("5Lu75oCd6Zuo"));


    }

}
