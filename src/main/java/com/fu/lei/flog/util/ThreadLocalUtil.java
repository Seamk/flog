package com.fu.lei.flog.util;

/**
 * @author fulei
 * @Title: ThreadLocalUtil
 * @ProjectName flog
 * @Description: TODO
 * @date 2019/9/16 18:11
 */
public class ThreadLocalUtil {

  private static String KEY_USER="userId";

  private ThreadLocalUtil(){}

  private static ThreadLocal<String> tlUser = new ThreadLocal<>();

}
