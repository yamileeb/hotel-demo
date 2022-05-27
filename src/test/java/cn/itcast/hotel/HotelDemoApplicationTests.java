package cn.itcast.hotel;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;

@SpringBootTest
class HotelDemoApplicationTests {

    private RestHighLevelClient client;

    //在每个test方法之前执行
    @BeforeEach
    void setUp() {
        this.client = new RestHighLevelClient(RestClient.builder(
                HttpHost.create("http://192.168.136.160:9200")
        ));
    }

    //在每个test方法之后执行
    @AfterEach
    void tearDown() throws IOException {
        this.client.close();
    }

    @Test
    void contextLoads() {

    }


}
