package StudentGrade;
import java.util.ArrayList;

public interface Contain<T> {
    boolean isContain(ArrayList<T> list, T e);
}
