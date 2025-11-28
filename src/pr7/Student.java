package pr7;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Student {
    private String name;
    private Date birthDate;

    public Student(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Метод, возвращающий дату рождения в нужном формате
    public String getBirthDateFormatted(int style) {
        DateFormat df = DateFormat.getDateInstance(style, Locale.getDefault());
        return df.format(birthDate);
    }

    @Override
    public String toString() {
        return "Студент: " + name + ", дата рождения: " +
                getBirthDateFormatted(DateFormat.MEDIUM);
    }
}
