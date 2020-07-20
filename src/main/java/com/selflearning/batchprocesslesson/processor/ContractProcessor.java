package com.selflearning.batchprocesslesson.processor;

import com.selflearning.batchprocesslesson.domain.Contract;
import com.selflearning.batchprocesslesson.domain.StageContract;

import org.springframework.batch.item.ItemProcessor;

public class ContractProcessor implements ItemProcessor<Contract, StageContract>{

    @Override
    public StageContract process(Contract item) throws Exception {
        System.out.println("Processing..."+item.getContractId()+" - "+item.getContractName());
        StageContract stage = new StageContract();
        stage.setIndexName(item.getContractName(), item.getContractId());
        stage.setCarrier(item.getCarrier());
        stage.setProcessTime(item.getFileProcessingTime());
        stage.setStatusCode("PEND");

        return stage;
    }

}