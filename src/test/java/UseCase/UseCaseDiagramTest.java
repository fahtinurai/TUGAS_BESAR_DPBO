package UseCase;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UseCaseDiagramTest {

    @Test
    void shouldCreateUseCaseRelationship() {
        Actor actor = new Actor(1, "Admin", "Primary");
        UseCase useCase = new UseCase(1, "Login", "Admin masuk sistem");
        Relationship relationship = new Relationship(actor, useCase, "association");

        assertEquals("Admin --association--> Login", relationship.toString());
    }

    @Test
    void shouldDisplayUseCaseDiagram() {
        UseCaseDiagram diagram = new UseCaseDiagram("Authentication");
        Actor actor = new Actor(1, "Admin", "Primary");
        UseCase useCase = new UseCase(1, "Login", "Admin masuk sistem");

        diagram.addActor(actor);
        diagram.addUseCase(useCase);
        diagram.addRelationship(actor, useCase, "association");

        String result = diagram.toString();

        assertTrue(result.contains("[Authentication]"));
        assertTrue(result.contains("Admin"));
        assertTrue(result.contains("(Login)"));
    }
}