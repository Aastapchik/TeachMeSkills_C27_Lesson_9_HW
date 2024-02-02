package com.TeachMeSkills.lesson7.task1.title;

import com.TeachMeSkills.lesson7.task1.iJobTitle.IJobTitle;

public class Principle implements IJobTitle {

    public String jobTitle = "Principle";
    public int id = 2;
    @Override
    public void title() {
        System.out.print(this.jobTitle);
    }
}
