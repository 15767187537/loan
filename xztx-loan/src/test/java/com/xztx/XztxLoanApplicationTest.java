package com.xztx;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/*
 * @Author xztx
 * @Date 2020/9/11 10:00
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = XztxLoanApplication.class)
public class XztxLoanApplicationTest {

    @Test
    public void test01() {
        System.out.println("111");
    }

    @Test
    public void test02() {
        int sum = 20;
        System.out.println("前: " + sum);
        sum = sumAll(sum);
        System.out.println("后: " + sum);
    }

    private int sumAll(int sum) {
        return sum += 10;
    }
}
