package com.sli.gateway.config;

import com.sli.gateway.handler.ImgCodeHandler;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

/**
 * 路由配置信息
 */
@Configuration
@AllArgsConstructor
public class RouterFunctionConfiguration
{
//    private final HystrixFallbackHandler hystrixFallbackHandler;

    private final ImgCodeHandler imgCodeHandler;

    @Bean
    public RouterFunction<?> routerFunction()
    {
        return RouterFunctions
//                .route(RequestPredicates.path("/fallback").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
//                        hystrixFallbackHandler)
//                .andRoute(RequestPredicates.GET("/code").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                .route(RequestPredicates.GET("/code").and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
                        imgCodeHandler);
    }
}
