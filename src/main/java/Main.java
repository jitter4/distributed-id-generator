import generators.IIdGenerator;
import generators.implementations.NodeIdGenerator;
import generators.implementations.SnowflakeSequenceIdGenerator;

public class Main {

    public static void main(String[] args) {
        Long nodeId = new NodeIdGenerator().generate();
        System.out.println(nodeId);
        IIdGenerator<Long> distributedIDGenerator = new SnowflakeSequenceIdGenerator(nodeId);
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    distributedIDGenerator.generate()
            );
        }
    }

}
