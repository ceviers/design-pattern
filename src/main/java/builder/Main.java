package builder;

public class Main {

    public static void main(String[] args) {
        var computer = new Computer.Builder()
                .cpu("AMD")
                .memory("samsung")
                .mainBoard("ASUS")
                .hardDisk("aigo")
                .build();

        System.out.println(computer);
    }
}
