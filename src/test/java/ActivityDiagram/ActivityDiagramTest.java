package ActivityDiagram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ActivityDiagramTest {

    @Test
    void shouldCreateActivityDiagramWithNodesAndFlow() {
        ActivityDiagram diagram = new ActivityDiagram("Login Activity");

        diagram.addNode("start", "start", "Start");
        diagram.addNode("input", "activity", "Input Username Password");
        diagram.addNode("end", "end", "End");

        diagram.addFlow("start", "input");
        diagram.addFlow("input", "end");

        String result = diagram.toString();

        assertTrue(result.contains("Activity Diagram: Login Activity"));
        assertTrue(result.contains("(*)"));
        assertTrue(result.contains("[Input Username Password]"));
        assertTrue(result.contains("(/)"));
    }
}