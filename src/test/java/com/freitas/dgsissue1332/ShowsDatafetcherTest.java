package com.freitas.dgsissue1332;

import com.netflix.graphql.dgs.DgsQueryExecutor;
import com.netflix.graphql.dgs.autoconfig.DgsAutoConfiguration;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = {DgsAutoConfiguration.class, ShowsDatafetcher.class})
class ShowsDatafetcherTest {

    @Test
    void shows(@Autowired DgsQueryExecutor dgsQueryExecutor) {
        var titles = dgsQueryExecutor.<List<String>>executeAndExtractJsonPath(
                " { shows { title releaseYear }}",
                "data.shows[*].title");

        assertTrue(titles.contains("Ozark"));
    }

}
