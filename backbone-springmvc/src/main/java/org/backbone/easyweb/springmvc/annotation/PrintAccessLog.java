package org.backbone.easyweb.springmvc.annotation;

import org.backbone.easyweb.springmvc.interceptor.AccessLogInterceptor;

import java.lang.annotation.*;

/**
 * @author bianliang (04/11/2017)
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Interceptor(value = AccessLogInterceptor.class)
public @interface PrintAccessLog {
}