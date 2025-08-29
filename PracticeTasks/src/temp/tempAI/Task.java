package temp.tempAI;

import java.util.Collections;
import java.util.List;

//unmodifaeble
public final class Task {
    private final String title;
    private final List<String> tags;

    public Task(String title, List<String> tags) {
        this.title = title;
        this.tags = Collections.unmodifiableList(tags);
    }

    public String getTitle() {
        return title;
    }

    public List<String> getTags() {
        return tags;
    }

    /* mutable
        public class Task {
        private String title;
        private List<String> tags;
        public Task(String title, List<String> tags) {
            this.title = title;
            this.tags = tags;
        }
        public String getTitle() {
            return title;
        }
        public List<String> getTags() {
            return tags;
        }
        public void setTitle(String title) {
            this.title = title;
        }
        public void addTag(String tag) {
            tags.add(tag);
        }
    }*/
}
