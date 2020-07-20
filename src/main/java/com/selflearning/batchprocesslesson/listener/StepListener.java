package com.selflearning.batchprocesslesson.listener;

import org.springframework.batch.core.ExitStatus;
import org.springframework.batch.core.StepExecution;
import org.springframework.batch.core.StepExecutionListener;

public class StepListener implements StepExecutionListener{

    public void beforeStep(StepExecution arg0) {
        System.out.println("Before listner");
    }

    public ExitStatus afterStep(StepExecution execution) {
        System.out.println("After listner");

        return execution.getExitStatus();
    }

}