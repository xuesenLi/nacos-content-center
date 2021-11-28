package ribbonconfiguration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 不能被Spring启动类 扫描
 * 通过java配置ribbon规则
 */
//@Configuration
public class RibbonConfiguration {
    @Bean
    public IRule ribbonRule() {
        // 设置 基于nacos里面的权重 配合NacosWeightedRule代码
        // return new NacosSameClusterWeightedRule();
        // 设置随机
//        return new RandomRule();
        // 轮询
        return new RoundRobinRule();
    }

}
