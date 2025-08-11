import java.util.Objects;

public class User {
    private int age;
    private String username;
    private String sex;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (!Objects.equals(username, user.username)) return false;
        return Objects.equals(sex, user.sex);
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }
}
