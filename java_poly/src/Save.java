import java.io.IOException;
import java.util.Date;

public interface Save {

    void save(String filename) throws IOException;

    void save(String filename, Date d) throws IOException;
}
