package builder;

public class Computer {
    private String cpu;
    private String mainBoard;
    private String memory;
    private String hardDisk;

    private Computer(Builder builder){
        this.cpu = builder.cpu;
        this.mainBoard = builder.mainBoard;
        this.memory = builder.memory;
        this.hardDisk = builder.hardDisk;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", memory='" + memory + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                '}';
    }

    public static final class Builder{
        private String cpu;
        private String mainBoard;
        private String memory;
        private String hardDisk;


        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder mainBoard(String mainBoard){
            this.mainBoard = mainBoard;
            return this;
        }

        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }

        public Builder hardDisk(String hardDisk){
            this.hardDisk = hardDisk;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
}
