import com.company.bean.UserInfo;
import com.company.repository.UserInfoRepository;
import com.company.repository.impl.UserInfoRepositoryImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by Elivs on 2017/4/28.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring-data-redis.xml")
public class TestUserInfoRepository {

    @Resource(name = "userInfoRepositoryImpl")
    private UserInfoRepository impl;

    @Test
    public void testSaveUserInfo() {
        UserInfo userInfo = new UserInfo(1l, "jetty", 18, "456");
        impl.saveUserInfo(userInfo);
        UserInfo userInfo1 = impl.getUserInfoByName("jetty");
        System.out.println(userInfo1);
    }
}
