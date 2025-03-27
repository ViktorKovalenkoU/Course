package challenges.challenge4;

import java.util.List;

public interface ISaveable {
     List<String> write();
     void read(List<String> dataList);
}
