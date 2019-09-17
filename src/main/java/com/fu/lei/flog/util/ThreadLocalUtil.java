package com.fu.lei.flog.util;

/**
 * @author fulei
 * @Title: ThreadLocalUtil
 * @ProjectName flog
 * @Description: TODO
 * @date 2019/9/16 18:11
 */
public class ThreadLocalUtil {

  public static final String KEY_USER="userId";

  public static final String KEY_LANG = "lang";

  private ThreadLocalUtil(){}

  private static ThreadLocal<String> tlUser = new ThreadLocal<>();

  private static ThreadLocal<String> tlLang = new ThreadLocal<>();

  public static void setUser(String userId){
    tlUser.set(userId);
  }

  public static String getUserId(){
    return tlUser.get();
  }

}
