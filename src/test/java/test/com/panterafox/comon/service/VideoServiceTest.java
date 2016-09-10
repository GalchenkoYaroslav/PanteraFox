package test.com.panterafox.comon.service;

import com.panterafox.common.config.DatabaseConfig;
import com.panterafox.common.domain.VideoEntity;
import com.panterafox.common.service.VideoService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 * Created by Yaroslav on 10.09.2016.
 */

@DirtiesContext
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DatabaseConfig.class)
@WebAppConfiguration
public class VideoServiceTest {

    @Resource
    private EntityManagerFactory emf;
    protected EntityManager em;


    @Resource
    private VideoService videoService;

    @Before
    public void setUp() throws Exception {
        em = emf.createEntityManager();
    }

    @Test
    public void testSaveVideoEntity()throws Exception{
        VideoEntity videoEntity = new VideoEntity();
        videoEntity.setName("1+1");
        videoEntity.setReference("www.1+1.com");
        videoService.add(videoEntity);
    }
}
