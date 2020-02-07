package com.lwh.elasticsearch.xunwu;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author lwh
 * @date 2020-02-06
 * @desp @ActiveProfiles("test")配置单元测试时走application-test配置
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Configuration
@ActiveProfiles("test")
public class ApplicationTests {

}
