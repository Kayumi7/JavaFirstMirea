package pr5;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class UndoableStringBuilder {
    private final StringBuilder sb;
    private final Deque<String> history = new ArrayDeque<>();

    public UndoableStringBuilder() {
        this.sb = new StringBuilder();
    }

    public UndoableStringBuilder(String initial) {
        this.sb = new StringBuilder(Objects.requireNonNull(initial));
    }

    private void saveState() {
        history.push(sb.toString());
    }

    public UndoableStringBuilder append(String str) {
        saveState();
        sb.append(str);
        return this;
    }

    public UndoableStringBuilder insert(int offset, String str) {
        saveState();
        sb.insert(offset, str);
        return this;
    }

    public UndoableStringBuilder delete(int start, int end) {
        saveState();
        sb.delete(start, end);
        return this;
    }

    public void undo() {
        if (!history.isEmpty()) {
            String prev = history.pop();
            sb.setLength(0);
            sb.append(prev);
        } else {
            // при отсутствии истории очищаем
            sb.setLength(0);
        }
    }

    @Override
    public String toString() {
        return sb.toString();
    }

    public int length() { return sb.length(); }
}
