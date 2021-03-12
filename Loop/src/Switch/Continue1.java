package Switch;

public class Continue1 {
    public void hello() {
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                System.out.println(i);
                continue;
            }
        }
    }
}
