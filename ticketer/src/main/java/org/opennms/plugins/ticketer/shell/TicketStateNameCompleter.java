package org.opennms.plugins.ticketer.shell;

import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.apache.karaf.shell.api.console.CommandLine;
import org.apache.karaf.shell.api.console.Completer;
import org.apache.karaf.shell.api.console.Session;
import org.apache.karaf.shell.support.completers.StringsCompleter;
import org.opennms.integration.api.v1.ticketing.Ticket;

import java.util.Arrays;
import java.util.List;

@Service
public class TicketStateNameCompleter implements Completer {
    @Override
    public int complete(Session session, CommandLine commandLine, List<String> list) {
        StringsCompleter stateNames = new StringsCompleter();
        Arrays.asList(Ticket.State.values()).forEach(state -> stateNames.getStrings().add(state.name()));
        return stateNames.complete(session, commandLine, list);
    }
}