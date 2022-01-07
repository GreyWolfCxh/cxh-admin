package com.cxh.quartz.task;

import com.cxh.common.utils.StringUtils;
import org.springframework.stereotype.Component;

/**
 * 定时任务调度测试
 *
 * @author cxh
 */
@Component("cxhTask")
public class CxhTask
{
    public void cxhMultipleParams(String s, Boolean b, Long l, Double d, Integer i)
    {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

    public void cxhParams(String params)
    {
        System.out.println("执行有参方法：" + params);
    }

    public void cxhNoParams()
    {
        System.out.println("执行无参方法");
    }
}
