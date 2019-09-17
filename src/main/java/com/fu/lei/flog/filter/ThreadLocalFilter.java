package com.fu.lei.flog.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.fu.lei.flog.util.ThreadLocalUtil;
import org.springframework.stereotype.Component;

/**
 * @author fulei
 * @Title: ThreadLocalFilter
 * @ProjectName flog
 * @Description: TODO
 * @date 2019/9/16 18:23
 */
@Component
public class ThreadLocalFilter implements Filter {

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
      fillThreadLocal(servletRequest);
      filterChain.doFilter(servletRequest,servletResponse);
  }

  private void fillThreadLocal(ServletRequest servletRequest) {
    HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
    HttpSession session = httpServletRequest.getSession(false);
    if(session!=null){
      ThreadLocalUtil.setUser((String)session.getAttribute(ThreadLocalUtil.KEY_USER));
    }

  }
}
