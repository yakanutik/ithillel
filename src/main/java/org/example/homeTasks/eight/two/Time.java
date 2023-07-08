package org.example.homeTasks.eight.two;

public enum Time {
    BREAKFAST("This is time for breakfast"),
    LUNCH("This is time for lunch"),
    DINNER("This is time for dinner");
    final String time;
    Time (String time) {
      this.time=time;
    }
    public String getValue(){
        return time;
    }
}

