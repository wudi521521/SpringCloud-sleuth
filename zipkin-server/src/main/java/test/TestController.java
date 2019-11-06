package test;

import org.jasypt.util.text.BasicTextEncryptor;

/**
 * @author Dillon Wu
 * @Title: TestController
 * @Description: 明文加密
 * @date 2019/11/6 19:59
 */
public class TestController {
    public static void main(String[] args) {
        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
        //加密所需的salt(盐)
        textEncryptor.setPassword("eblocks@2019");
        //要加密的数据（数据库的用户名或密码）
        String username = textEncryptor.encrypt("root");
        String password = textEncryptor.encrypt("root");
        System.out.println("username:"+username);
        System.out.println("password:"+password);

        //解密:
        String Enusername= textEncryptor.decrypt("nIcv2Qr6ZY7uME8p+wW40g==");
        String Enpassword =  textEncryptor.decrypt("wFxC/BFpkgYkvW30pEXVjV0VsHMn6Q98+5oRftb5aXw=");
        System.out.println("解密用户:"+Enusername);
        System.out.println("解密密码:"+Enpassword);
    }
}
