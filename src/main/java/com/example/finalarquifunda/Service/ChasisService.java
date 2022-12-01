package com.example.finalarquifunda.Service;

import com.example.finalarquifunda.Core.Chasis;
import org.springframework.stereotype.Component;

import java.io.File;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;


@Component
public class ChasisService {
    ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
    long start = System.nanoTime();
    Runtime runtime = Runtime.getRuntime();
    int cpus_ = runtime.availableProcessors();
    Double mmax_ = (double) (runtime.maxMemory() / 1024 / 1024);
    Double mtotal_ = (double) (runtime.totalMemory() / 1024 / 1024);
    Double mfree_ = (double) (runtime.freeMemory() / 1024 / 1024);
    File cDrive = new File("C:");

    Double TotalC_ = (double) (cDrive.getTotalSpace() / 1073741824);
    Double TotalFreeC_ = (double) (cDrive.getFreeSpace() / 1073741824);

    public Chasis getData(){
        Chasis emp = new Chasis();
        emp.setCpus(cpus_);
        emp.setMmax(mmax_);
        emp.setMtotal(mtotal_);
        emp.setMfree(mfree_);
        emp.setElapseTime(0.0);
        emp.setTotalSpaceFreeC(TotalC_);
        emp.setFreeSpace(TotalFreeC_);
        return emp;
    }
}
