package com.xxM.utils;

import com.xxM.dao.Impl.AccountDaoImpl02;

/**
 * @Program: IntelliJ IDEA springFramework
 * @Description:
 * @Author: Mr Liu
 * @Creed: Talk is cheap,show me the code
 * @CreateDate: 2019-10-08 13:19:55 周二
 * @LastModifyDate:
 * @LastModifyBy:
 * @Version: ULTIMATE
 */
public class StaticFactory {
    public static Object getBean(){
        return new AccountDaoImpl02();
    }
}
