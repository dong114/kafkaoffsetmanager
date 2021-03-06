package org.ctrlr.kom.dao;

import kafka.common.TopicAndPartition;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Test Stub DAO Object
 */
public class StubOffsetStore implements IOffsetDao {

    public StubOffsetStore() {}

    @Override
    public Map<TopicAndPartition, Long> getOffsets(String groupid, String topic) {
        return new HashMap<>();
    }

    @Override
    public void setOffsets(String groupid, Map<TopicAndPartition, Long> offsets) {
        return;
    }

    @Override
    public void close() throws IOException {
        return;
    }
}
