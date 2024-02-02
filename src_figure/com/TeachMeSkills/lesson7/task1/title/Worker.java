package com.TeachMeSkills.lesson7.task1.title;

import com.TeachMeSkills.lesson7.task1.iJobTitle.IJobTitle;

public class Worker implements IJobTitle {

    public String jobTitle = "Worker";
    public int id = 3;
    @Override
    public void title() {
        System.out.print(this.jobTitle);
    }
}
