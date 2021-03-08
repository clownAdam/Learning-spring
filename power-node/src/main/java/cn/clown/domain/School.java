package cn.clown.domain;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author clown
 * @date 2021
 */
@Component("myschool")
public class School {
    @Value("kunmingUniversity")
    private String name;

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                '}';
    }
}
