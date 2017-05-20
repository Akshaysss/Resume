package com.example.akshayjindam.menubar.project1_VP;

/**
 * Created by Akshay Jindam on 11-03-2017.
 */

public class project_model {

    private String topic, description;

    public project_model(String topic, String description) {
        this.topic = topic;
        this.description = description;
    }

    public project_model(){

        String Topic=null;
        String Description= null;

        this.topic=Topic;
        this.description=Description;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
