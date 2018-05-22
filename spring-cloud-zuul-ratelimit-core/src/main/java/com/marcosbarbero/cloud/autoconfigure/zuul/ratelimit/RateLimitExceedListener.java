package com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit;

import com.marcosbarbero.cloud.autoconfigure.zuul.ratelimit.config.properties.RateLimitProperties;
import com.netflix.zuul.context.RequestContext;
import org.springframework.cloud.netflix.zuul.filters.Route;

/**
 * @author Andrey Stepanov
 */
public interface RateLimitExceedListener {

    void onLimitExceed(RequestContext requestContext, RateLimitProperties.Policy policy, Route route);
}
