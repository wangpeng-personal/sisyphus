package com.github.houbb.sisyphus.core.support.condition;

import com.github.houbb.heaven.annotation.ThreadSafe;
import com.github.houbb.sisyphus.api.support.attempt.RetryAttempt;
import com.github.houbb.sisyphus.api.support.condition.RetryCondition;

/**
 * 恒为假重试条件
 * @author binbin.hou
 * @since 1.0.0
 */
@ThreadSafe
public class AlwaysFalseRetryCondition implements RetryCondition {

    @Override
    public boolean condition(RetryAttempt retryAttempt) {
        return false;
    }
    
}