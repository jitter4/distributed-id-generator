package generators.implementations;

import generators.IIdGenerator;

import java.util.UUID;

public class UUIDGenerator implements IIdGenerator<String> {
    @Override
    public String generate() {
        return UUID.randomUUID().toString();
    }
}
