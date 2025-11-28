package pr5;

public class Magazine implements Printable {
    private final String title;
    private final int issueNumber;
    private final String monthYear;

    public Magazine(String title, int issueNumber, String monthYear) {
        this.title = title; this.issueNumber = issueNumber; this.monthYear = monthYear;
    }

    @Override
    public void print() {
        System.out.printf("Magazine: \"%s\" — Issue %d (%s)%n", title, issueNumber, monthYear);
    }

    @Override
    public String toString() {
        return String.format("Magazine{title='%s', issue=%d, monthYear='%s'}",
                title, issueNumber, monthYear);
    }
}
