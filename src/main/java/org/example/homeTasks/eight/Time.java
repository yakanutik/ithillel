package org.example.homeTasks.eight;

public enum Time {
    BREAKFEAST("This is time for breakfeast"),
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
