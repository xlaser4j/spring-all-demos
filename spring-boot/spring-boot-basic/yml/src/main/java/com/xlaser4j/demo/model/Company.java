package com.xlaser4j.demo.model;

import java.util.List;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @package: com.xlaser4j.demo.model
 * @author: Elijah.D
 * @time: 2019/12/18 16:41
 * @description:
 * @modified: Elijah.D
 */
@Data
@Component
@ConfigurationProperties("prefix")
public class Company {
    private String name;

    private List<String> child;

    private List<Employee> employees;
}
