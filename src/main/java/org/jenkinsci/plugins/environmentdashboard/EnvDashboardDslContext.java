package org.jenkinsci.plugins.environmentdashboard;

import javaposse.jobdsl.dsl.Context;
import java.util.ArrayList;

/**
 * Environment Dashboard DSL Context
 */
public class EnvDashboardDslContext implements Context {
    String nameOfEnv = "";
    String branchName = "";
    String componentName = "";
    String buildNumber = "";
    String buildJob = "";
    String packageName = "";
    boolean addColumns = false;
    ArrayList<ListItem> data = new ArrayList<ListItem>();

    public void environmentName(String value) {
        nameOfEnv = value;
    }

    public void branchName(String value) {
        branchName = value;
    }

    public void componentName(String value) {
        componentName = value;
    }

    public void buildNumber(String value) {
        buildNumber = value;
    }

    public void buildJob(String value) {
        buildJob = value;
    }

    public void packageName(String value) {
        packageName = value;
    }

    public void addColumns(boolean value) {
        addColumns = value;
    }

    public void column(String columnName, String contents) {
        ListItem col = new ListItem(columnName, contents);
        data.add(col);
    }
}
