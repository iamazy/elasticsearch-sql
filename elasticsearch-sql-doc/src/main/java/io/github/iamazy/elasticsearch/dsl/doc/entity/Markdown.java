package io.github.iamazy.elasticsearch.dsl.doc.entity;

import java.util.List;

public class Markdown {

    private boolean enabled = true;

    private String description;

    private List<Example> examples;

    // getter setter


    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Example> getExamples() {
        return examples;
    }

    public void setExamples(List<Example> examples) {
        this.examples = examples;
    }
}
