package com.selflearning.batchprocesslesson.writer;

import com.selflearning.batchprocesslesson.domain.StageContract;
import com.selflearning.batchprocesslesson.helper.JDBCHelper;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

public class ContractWriter implements ItemWriter<StageContract>{

    @Autowired

    JDBCHelper contractDao;

    @Override
    public void write(List<? extends StageContract> items) throws Exception {
        // TODO Auto-generated method stub

    }

}