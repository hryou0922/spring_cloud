package com.hry.spring.cloud.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by huangrongyou@yixin.im on 2017/11/16.
 */
@Component // 初始化过滤类
public class MyPreFilter extends ZuulFilter {
    @Override
    public String filterType() {
        // 设置过滤器类型：error post pre route
        return FilterConstants.PRE_TYPE;
    }

    @Override
    public int filterOrder() {
        // 设置执行的顺序，值越小越早执行。不同过滤器的值可以相同
        return FilterConstants.PRE_DECORATION_FILTER_ORDER  - 1; // run before PreDecoration
    }

    @Override
    public boolean shouldFilter() {
        // 这个方法决定是否启用这个过滤器，可以通过配置属性完成，这里简单测试，直接使用返回true
        return true;
    }

    @Override
    public Object run() {
        // 通过 RequestContext的getCurrentContext获取RequestContext对象可以进行相关的操作
        RequestContext ctx = RequestContext.getCurrentContext();
        // 这里只打印一些请求信息
        HttpServletRequest request = ctx.getRequest();
        System.out.println("================ MyPreFilter begin================");
        System.out.println("请求来源:" + request.getRemoteAddr() + ":" + request.getRemotePort());
        System.out.println("================ MyPreFilter end================");
        return null;
    }
}
