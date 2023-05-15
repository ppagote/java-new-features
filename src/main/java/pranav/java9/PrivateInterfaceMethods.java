package pranav.java9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class PrivateInterfaceMethods {

    public static void main(String[] args) {
        TestingNames names = new TestingNames();
        System.out.println(names.fetchInitialData());
    }

    public static class TestingNames implements NamesInterface {
        public TestingNames() {
            // TODO document why this constructor is empty
        }
    }

    public interface NamesInterface {
        default List<String> fetchInitialData() {
            try (BufferedReader br = new BufferedReader(
                    new InputStreamReader(Objects.requireNonNull(this.getClass()
                            .getResourceAsStream("/names.txt"))))) {
                return readNames(br);
            } catch (IOException e) {
                e.printStackTrace();
                return Collections.emptyList();
            }
        }

        private List<String> readNames(BufferedReader br)
                throws IOException {
            ArrayList<String> names = new ArrayList<>();
            String name;
            while ((name = br.readLine()) != null) {
                names.add(name);
            }
            return names;
        }
    }
}
