package pr5;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ObservableStringBuilder {
    private final StringBuilder sb = new StringBuilder();
    private final List<ChangeListener> listeners = new ArrayList<>();

    public void addListener(ChangeListener l) {
        listeners.add(Objects.requireNonNull(l));
    }

    public void removeListener(ChangeListener l) {
        listeners.remove(l);
    }

    private void notifyListeners() {
        String current = sb.toString();
        for (ChangeListener l : listeners) {
            try {
                l.changed(current);
            } catch (Exception e) {
                // защита от исключений в слушателях
                e.printStackTrace();
            }
        }
    }

    public ObservableStringBuilder append(String s) {
        sb.append(s);
        notifyListeners();
        return this;
    }

    public ObservableStringBuilder insert(int pos, String s) {
        sb.insert(pos, s);
        notifyListeners();
        return this;
    }

    public ObservableStringBuilder delete(int start, int end) {
        sb.delete(start, end);
        notifyListeners();
        return this;
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    public int length() { return sb.length(); }
}
