package com.selflearning.batchprocesslesson.domain;

import java.util.Date;

public class StageContract {
    
    private String indexName;  // contractName + "-" + contractId
    private String carrier;
    private Date processTime;
    private String statusCode;

    public String getIndexName() {
        return indexName;
    }

    public void setIndexName(String contractName, Long contractId) {
        this.indexName = contractName + "-" + contractId.toString();
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public Date getProcessTime() {
        return processTime;
    }

    public void setProcessTime(Date processTime) {
        this.processTime = processTime;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}