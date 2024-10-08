package com.ann.shadow.activity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Activity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String activityName;
    private String description;
    private String location;
    private List<String> tags;
    private List<String> toolsUsed;
    private String relatedProject;

    private String category;
    private int priorityLevel;

    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Duration duration;
    private Duration breakDuration;

    private int moodRating;
    private int interruptionCount;
    private boolean taskCompletionStatus;
    private int energyLevel;
    private String reflection;
    private String outcome;

    // Constructor
    public Activity(String activityName, LocalDateTime startTime, LocalDateTime endTime,
                           String category, int priorityLevel, String location, int moodRating,
                           String description, int interruptionCount, boolean taskCompletionStatus,
                           List<String> tags, int energyLevel, List<String> collaborators,
                           String reflection, String relatedProject, Duration breakDuration,
                           List<String> toolsUsed, String outcome) {
        this.activityName = activityName;
        this.startTime = startTime;
        this.endTime = endTime;
        this.duration = Duration.between(startTime, endTime);
        this.category = category;
        this.priorityLevel = priorityLevel;
        this.location = location;
        this.moodRating = moodRating;
        this.description = description;
        this.interruptionCount = interruptionCount;
        this.taskCompletionStatus = taskCompletionStatus;
        this.tags = tags;
        this.energyLevel = energyLevel;
        this.reflection = reflection;
        this.relatedProject = relatedProject;
        this.breakDuration = breakDuration;
        this.toolsUsed = toolsUsed;
        this.outcome = outcome;
    }

    public Activity() {
    }

    public Activity(String activityName) {
        this.activityName=activityName;
    }

    // Method to print activity details
    @Override
    public String toString() {
        return "ActivityTracker{" +
                "activityName='" + activityName + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", duration=" + duration +
                ", category='" + category + '\'' +
                ", priorityLevel=" + priorityLevel +
                ", location='" + location + '\'' +
                ", moodRating=" + moodRating +
                ", description='" + description + '\'' +
                ", interruptionCount=" + interruptionCount +
                ", taskCompletionStatus=" + taskCompletionStatus +
                ", tags=" + tags +
                ", energyLevel=" + energyLevel +
                ", reflection='" + reflection + '\'' +
                ", relatedProject='" + relatedProject + '\'' +
                ", breakDuration=" + breakDuration +
                ", toolsUsed=" + toolsUsed +
                ", outcome='" + outcome + '\'' +
                '}';
    }

    // Getters and Setters for all fields
    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
        this.duration = Duration.between(startTime, this.endTime);
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
        this.duration = Duration.between(this.startTime, endTime);
    }

    public Duration getDuration() {
        return duration;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getMoodRating() {
        return moodRating;
    }

    public void setMoodRating(int moodRating) {
        this.moodRating = moodRating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getInterruptionCount() {
        return interruptionCount;
    }

    public void setInterruptionCount(int interruptionCount) {
        this.interruptionCount = interruptionCount;
    }

    public boolean isTaskCompletionStatus() {
        return taskCompletionStatus;
    }

    public void setTaskCompletionStatus(boolean taskCompletionStatus) {
        this.taskCompletionStatus = taskCompletionStatus;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public int getEnergyLevel() {
        return energyLevel;
    }

    public void setEnergyLevel(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public String getReflection() {
        return reflection;
    }

    public void setReflection(String reflection) {
        this.reflection = reflection;
    }

    public String getRelatedProject() {
        return relatedProject;
    }

    public void setRelatedProject(String relatedProject) {
        this.relatedProject = relatedProject;
    }

    public Duration getBreakDuration() {
        return breakDuration;
    }

    public void setBreakDuration(Duration breakDuration) {
        this.breakDuration = breakDuration;
    }

    public List<String> getToolsUsed() {
        return toolsUsed;
    }

    public void setToolsUsed(List<String> toolsUsed) {
        this.toolsUsed = toolsUsed;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }
}
