package ClassDiagram;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class ClassDiagramTest {

    @Test
    void shouldCreateClassDiagramWithAttributeMethodAndInheritance() {
        ClassDiagram diagram = new ClassDiagram("User");

        diagram.addAttribute("-", "username", "String");
        diagram.addMethod("+", "login", "void", List.of("String password"));
        diagram.setSuperClass("Account");

        String result = diagram.toString();

        assertTrue(result.contains("User"));
        assertTrue(result.contains("- username: String"));
        assertTrue(result.contains("+ login(String password): void"));
        assertTrue(result.contains("Account"));
    }
}