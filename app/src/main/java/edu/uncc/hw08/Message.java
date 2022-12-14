// Homework Assignment 08
// Group22_HW08
// Stephanie Lee Karp & Ken Stanley

package edu.uncc.hw08;

import com.google.firebase.Timestamp;

public class Message {
    public String id;
    public String from;
    public String message;
    public Timestamp sent;

    public Message() {}

    public Message(String id, String from, String message, Timestamp sent) {
        this.id = id;
        this.from = from;
        this.message = message;
        this.sent = sent;
    }

    public String getId() {
        return id;
    }

    public String getFrom() {
        return from;
    }

    public String getMessage() {
        return message;
    }

    public String getSent() {
        return sent.toDate().toString();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setSent(Timestamp sent) {
        this.sent = sent;
    }
}
