package Sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SequenceDiagramTest {

    @Test
    void shouldCreateSequenceDiagramWithLifelineAndMessage() {
        SequenceDiagram diagram = new SequenceDiagram("Login Sequence");

        diagram.addLifeline("User", "Actor");
        diagram.addLifeline("System", "Object");
        diagram.addMessage("User", "System", "submit login", "sync");

        String result = diagram.toString();

        assertTrue(result.contains("Sequence Diagram: Login Sequence"));
        assertTrue(result.contains("Lifeline: User"));
        assertTrue(result.contains("User -> System: submit login"));
    }
}