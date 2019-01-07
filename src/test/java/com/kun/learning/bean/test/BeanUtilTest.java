package com.kun.learning.bean.test;

import com.kun.learning.bean.test.bean.A;
import com.kun.learning.bean.test.bean.C;
import com.kun.learning.bean.util.BeanUtil;
import com.kun.learning.bean.util.config.BeanTypeConfigHolder;
import com.kun.learning.bean.util.config.Features;
import com.kun.learning.bean.util.convert.BeanCopyConvert;
import com.kun.learning.bean.util.defaultConvetor.BigDecimal2StringConvetor;
import com.kun.learning.bean.util.defaultConvetor.Date2StringConvetor;
import com.kun.learning.bean.util.exception.BeanCopyException;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;


/**
 * Created by jrjiakun on 2018/12/27
 */
public class BeanUtilTest extends TestBase{


    @Test
    public void test_copy(){
        A a = new A();
        a.setA("a");
        a.setAs("as");
        C c = new C();
        BeanUtil.copyProperties(a,c, Features.BigDecimal2String);
        System.out.println(c);
        BeanUtil.copyProperties(a,c, Features.Date2String);
    }

    @Test(expected = BeanCopyException.class)
    public void test_NotSameTypeField(){
        A a = new A();
        a.setA("a");
        a.setAs("as");
        C c = new C();
        BeanUtil.copyProperties(a,c);
    }
}
