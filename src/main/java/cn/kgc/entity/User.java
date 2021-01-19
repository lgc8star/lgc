package cn.kgc.entity;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import java.util.Date;

/**
 * @author LiGuoCan
 */
@Data
@ConfigurationProperties(prefix = "user")
@Component
@Validated
public class User {

    private Integer id;
    //@Value("${user.userName}")
    private String userName;
    private Date birthday;
    @Email
    private String email;

}
