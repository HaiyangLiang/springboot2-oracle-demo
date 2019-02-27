package com.liang;

import org.jasypt.encryption.StringEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot2OracleDemoApplicationTests {

    @Test
    public void contextLoads() {
    }


    @Autowired
    private StringEncryptor stringEncryptor;

    @Test
    public void jasyptTest() {
        String druidAdmin = stringEncryptor.encrypt("admin");
        String druidPassword = stringEncryptor.encrypt("123");
        System.out.println("--------------------");
        System.out.println(druidAdmin);
        System.out.println(druidPassword);
        System.out.println("--------------------");
        String system = stringEncryptor.encrypt("admin");
        String oracle = stringEncryptor.encrypt("oracle");
        System.out.println(system);
        System.out.println("--------------------");
        System.out.println(oracle);
        System.out.println("--------------------");
        String url = stringEncryptor.encrypt("jdbc:oracle:thin:@//192.168.12.11:1521/HELLO");
        System.out.println(url);
    }
}
