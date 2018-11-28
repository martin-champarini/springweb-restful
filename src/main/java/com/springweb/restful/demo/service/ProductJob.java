package com.springweb.restful.demo.service;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.PersistJobDataAfterExecution;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.stereotype.Service;

@PersistJobDataAfterExecution
@DisallowConcurrentExecution
public class ProductJob extends QuartzJobBean {
    private String jobName;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println("asd");
    }
}
