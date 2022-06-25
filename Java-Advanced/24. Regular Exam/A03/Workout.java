package workout;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Workout {
    private String type;
    private int exerciseCount;
    List<Exercise> exercises;

    public Workout(String type, int exerciseCount) {
        exercises = new ArrayList<>();
        this.type = type;
        this.exerciseCount = exerciseCount;
    }

    public void addExercise(Exercise exercise) {
        if (exercises.size() < exerciseCount) {
            exercises.add(exercise);
        }
    }


    public boolean removeExercise(String name, String muscle) {
        if (!exercises.isEmpty()) {
            for (Exercise e : exercises) {
                if (e.getName().equals(name) && e.getMuscle().equals(muscle)) {
                    exercises.remove(e);
                    return true;
                }
            }
        }
        return false;
    }

    public Exercise getExercise(String name, String muscle) {
        if (!exercises.isEmpty()) {
            for (Exercise e : exercises) {
                if (e.getName().equals(name) && e.getMuscle().equals(muscle)) {

                    return e;
                }
            }
        }
        return null;
    }

    public Exercise getMostBurnedCaloriesExercise() {
        if (!exercises.isEmpty()) {
            List<Exercise> current = new ArrayList<>(exercises);
            current.sort(Comparator.comparingInt(Exercise::getBurnedCalories).reversed());
            return current.get(0);
        }
        return null;
    }


    public int getExerciseCount() {
        if (!exercises.isEmpty()) {
            return exercises.size();
        }
        return 0;
    }

    public String getStatistics() {
        StringBuilder sb = new StringBuilder();
        sb.append("Workout type: ").append(this.type).append(System.lineSeparator());
        if (!exercises.isEmpty()) {
            for (int i = 0; i < exercises.size(); i++) {
                if(i == exercises.size() - 1){
                    sb.append(exercises.get(i).toString());
                }else {
                    sb.append(exercises.get(i).toString()).append(System.lineSeparator());
                }
            }
        }
        return sb.toString();
    }
}
