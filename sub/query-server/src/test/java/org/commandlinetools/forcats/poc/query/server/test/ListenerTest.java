package org.commandlinetools.forcats.poc.query.server.test;

import org.commandlinetools.forcats.poc.query.server.Listener;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ListenerTest {

    @Test
    public void testQuery() {
        assertEquals("handler response",
                     "Query Server Listener handleQuery response TBD",
                     Listener.handleQuery("query"));
    }
}
