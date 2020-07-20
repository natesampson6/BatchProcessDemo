package com.selflearning.batchprocesslesson;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import com.selflearning.batchprocesslesson.reader.ContractReader;

import org.junit.*;
import java.util.*;
import org.junit.runner.RunWith;
import org.junit.runner.JUnitCore;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.batch.test.context.SpringBatchTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBatchTest
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:job-context.xml")
public class ReaderTest {
    @Autowired
    private ItemReader<String> reader;

    @Test
    public void readerTest1() throws UnexpectedInputException, ParseException, 
                            NonTransientResourceException, Exception {
        
        
        List<String> items = new ArrayList<>();
        items.add("1");
        items.add("2");
        items.add("3");

        reader = new ContractReader<>(items);
        assertEquals("1", reader.read());
        assertEquals("2", reader.read());
        assertEquals("3", reader.read());
        assertNull(reader.read());
    }
}