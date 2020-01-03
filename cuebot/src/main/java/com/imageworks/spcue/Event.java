
package com.imageworks.spcue;

public class Event {

    private String type;
    private String body;

    public Event() {
    }

    public Event(String type, String body) {
        this.type = type;
        this.body = body;
    }

    public String getType() {
        return type;
    }

    public String getBody() {
        return body;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return String.format("Event{type=%s, body=%s}", getType(), getBody());
    }

}