package com.TeachMeSkills.lesson7.task1.title;

import com.TeachMeSkills.lesson7.task1.iJobTitle.IJobTitle;

public class Accountant implements IJobTitle {
    public String jobTitle = "Accountant";
    public int id = 1;
    @Override
    public void title() {
        System.out.print(this.jobTitle);
    }
}
