package com.tribeapp.process.listener;

import com.tribeapp.process.utils.CamundaVariableNames;
import org.camunda.bpm.engine.delegate.DelegateTask;
import org.camunda.bpm.engine.delegate.TaskListener;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

@Component
public final class TaskNameBeautifier implements TaskListener {

    @Override
    public void notify(DelegateTask task) {
        String modelVariable = (String) task.getExecution().getVariable("model");
        beautifierTaskName(modelVariable, task);
    }

    public void beautifierTaskName(String newName, DelegateTask task) {
        if (newName != null) {
            String capitalizedName = StringUtils.capitalize(newName);
            task.setName(capitalizedName);
        }
    }
}
